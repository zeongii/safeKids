package kr.safekids.model.domain;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ScheduleModel {
    private Long id;
    private String code;
    private String period;
    private Long employeeId;
    // employee -> playground (id) / periodId -> checkItem (전체)
    // => 이렇게 출력하면 작업자의 놀이터에 대한 기간의 checkList 생성 가능
}
