package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PeriodModel {
    private Long id;
    private String condition;

}
