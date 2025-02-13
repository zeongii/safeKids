package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class DepartmentModel {
    private Long id;
    private String name;
    private Boolean isActive;
}
