package kr.safekids.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Data
@Component
public class UserModel {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private LocalDateTime entryDate;
    private Boolean isActive;

}
