package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class GroupModel {
    private Long id;
    private String groupName;


}
