package kr.safekids.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import kr.safekids.model.domain.ScheduleModel;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "schedule")
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String period;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    @JsonBackReference
    private EmployeeEntity employee;
    // employee -> playground (id) / periodId -> checkItem (전체)
    // => 이렇게 출력하면 작업자의 놀이터에 대한 기간의 checkList 생성 가능

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playground_id")
    private PlaygroundEntity playground;


    public static ScheduleEntity toScheduleEntity(ScheduleModel scheduleModel, EmployeeEntity employee) {
        return ScheduleEntity.builder()
                .id(scheduleModel.getId())
                .code(scheduleModel.getCode())
                .period(scheduleModel.getPeriod())
                .employee(employee)
                .build();

    }
}
