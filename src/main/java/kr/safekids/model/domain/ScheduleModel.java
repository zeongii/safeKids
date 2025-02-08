package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class ScheduleModel {
    private Long id;
    private String code;
    private String period;
    private Long employeeId;
    // employee -> playground (id) / periodId -> checkItem (전체)
    // => 이렇게 출력하면 작업자의 놀이터에 대한 기간의 checkList 생성 가능
}
