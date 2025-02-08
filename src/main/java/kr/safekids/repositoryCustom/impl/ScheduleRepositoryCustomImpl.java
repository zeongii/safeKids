package kr.safekids.repositoryCustom.impl;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

import kr.safekids.model.entity.*;
import kr.safekids.repositoryCustom.ScheduleRepositoryCustom;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ScheduleRepositoryCustomImpl implements ScheduleRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;



    @Override
    public List<ScheduleEntity> findDailyByEmployeeId(Long userId) {
        QScheduleEntity schedule = QScheduleEntity.scheduleEntity;
        QPlaygroundEntity playground = QPlaygroundEntity.playgroundEntity;
        QFacilityListEntity facilityList = QFacilityListEntity.facilityListEntity;
        QCheckItemEntity checkItem = QCheckItemEntity.checkItemEntity;

        return jpaQueryFactory
                .selectFrom(schedule)
                .innerJoin(playground).on(schedule.playground.eq(playground))
                .innerJoin(facilityList).on(facilityList.playground.eq(playground))
                .innerJoin(checkItem).on(checkItem.facility.eq(facilityList.facility))
                .where(
                        schedule.period.eq(checkItem.period),
                        schedule.code.like("%D1%")
                )
                .fetch();
    }


    @Override
    public List<ScheduleEntity> findMonthlyByEmployeeId(Long userId) {
        return List.of();
    }
}
