package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class FacilityModel {
    private Long id;
    private String FacilityName;

}
