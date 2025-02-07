package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class FacilityListModel {
    private Long id;
    private Long facilityId;
    private Long playgroundId;

}
