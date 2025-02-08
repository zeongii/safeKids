package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CheckItemModel {
    private Long id;
    private String content;
    private String period;
}
