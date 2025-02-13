package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
public class InspectionModel {
    private Long id;

    private String feedback;

    private LocalDateTime dueDate;
}

