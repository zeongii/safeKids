package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
public class RiskScanModel {
    private Long id;

    private String content;

    private LocalDateTime entryDate;

    private String checkStatus;

    private Long checkItemId;

    private Long playgroundId;

    private Long scheduleId;
}
