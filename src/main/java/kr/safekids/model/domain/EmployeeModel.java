package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class EmployeeModel {
    private Long id;
    private String role;
    private Long teamId;
    private Long groupId;
    private Long userId;


}
