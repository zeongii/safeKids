package kr.safekids.repositoryCustom;

import kr.safekids.model.entity.ScheduleEntity;

import java.util.List;

public interface ScheduleRepositoryCustom {

    List<ScheduleEntity> findDailyByEmployeeId(Long userId);

    List<ScheduleEntity> findWeeklyByEmployeeId(Long userId);

}
