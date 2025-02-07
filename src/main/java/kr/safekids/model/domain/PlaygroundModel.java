package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
public class PlaygroundModel {
    private Long id;
    private String name;
    private String address;
    private LocalDateTime InstallationDate;
    private Boolean isActive;
    private Long placeId;
    private Long employeeId;


}
