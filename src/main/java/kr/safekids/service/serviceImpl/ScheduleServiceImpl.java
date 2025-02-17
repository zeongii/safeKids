package kr.safekids.service.serviceImpl;

import kr.safekids.model.domain.ScheduleModel;
import kr.safekids.model.entity.EmployeeEntity;
import kr.safekids.model.entity.ScheduleEntity;
import kr.safekids.repository.EmployeeRepository;
import kr.safekids.repository.ScheduleRepository;
import kr.safekids.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final EmployeeRepository employeeRepository;


    @Override
    public List<ScheduleEntity> findWeeklySchedule(Long userId) {


        return List.of();
    }

    @Override
    public List<ScheduleEntity> findMonthlySchedule(Long userId) {
        return List.of();
    }

    @Override
    public ScheduleEntity save(ScheduleModel scheduleModel) {
        EmployeeEntity Employee = employeeRepository.findById(scheduleModel.getEmployeeId()).orElse(null);

        ScheduleEntity scheduleEntity = ScheduleEntity.toScheduleEntity(scheduleModel, Employee);
        return scheduleRepository.save(scheduleEntity);
    }
}
