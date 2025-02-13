package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CheckListModel {

    private Long employeeId;
    private Long PlaygroundId;
    private Long facilityId;
    private String CheckContent;
    private String period;

}
