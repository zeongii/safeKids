package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class TeamModel {
    private Long id;
    private String teamName;
    private Boolean isActive;

}
