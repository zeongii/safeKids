package kr.safekids.service;

import kr.safekids.model.domain.UserModel;
import org.springframework.http.ResponseEntity;

public interface UserService {

    Boolean join(UserModel userModel);
}
