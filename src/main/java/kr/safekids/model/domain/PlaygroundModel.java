package kr.safekids.model.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import kr.safekids.model.entity.TeamEntity;
import kr.safekids.model.entity.UserEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Component
public class PlaygroundModel {
    private Long id;
    private String name;
    private String address;
    private LocalDateTime InstallationDate;
    private Boolean isActive;
    private String District;
    private String City;
    private Long userId;
    private Long teamId;



}
