package kr.safekids.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import kr.safekids.model.domain.RiskScanModel;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "riskscan")
public class RiskScanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @Column(columnDefinition = "TIMESTAMP(0)")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDateTime entryDate;

    private String checkStatus;

    private Long checkItemId;

    private Long playgroundId;

    private Long scheduleId;


    public static RiskScanEntity toRiskScanEntity(RiskScanModel riskscanModel) {
        return RiskScanEntity.builder()
                .id(riskscanModel.getId())
                .content(riskscanModel.getContent())
                .entryDate(riskscanModel.getEntryDate())
                .checkStatus(riskscanModel.getCheckStatus())
                .checkItemId(riskscanModel.getCheckItemId())
                .playgroundId(riskscanModel.getPlaygroundId())
                .scheduleId(riskscanModel.getScheduleId())
                .build();
    }


}
