package kr.safekids.model.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
public class RecheckModel {

    private Long id;
    private String content;
    private String checkStatus;
    private LocalDateTime entryDate;
}
