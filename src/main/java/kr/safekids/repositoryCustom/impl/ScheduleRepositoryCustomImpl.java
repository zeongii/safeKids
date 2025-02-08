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
                .innerJoin(playground).on(playground.id.eq(schedule.playground.id))
                .innerJoin(facilityList).on(playground.id.eq(facilityList.playground.id))
                .innerJoin(checkItem).on(checkItem.facility.eq(facilityList.facility))
                .where(
                        schedule.period.eq(checkItem.period),
                        playground.employee.id.eq(userId),
                        schedule.code.like("%D1%")
                )
                .fetch();
    }


    @Override
    public List<ScheduleEntity> findMonthlyByEmployeeId(Long userId) {
        return List.of();
    }
}
