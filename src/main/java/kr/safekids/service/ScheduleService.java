package kr.safekids.service;


import kr.safekids.model.domain.ScheduleModel;
import kr.safekids.model.entity.ScheduleEntity;

import java.util.List;

public interface ScheduleService {


    List<ScheduleEntity> findWeeklySchedule(Long userId);

    List<ScheduleEntity> findMonthlySchedule(Long userId);

    ScheduleEntity save(ScheduleModel scheduleModel);

}
