package kr.safekids.service;

import kr.safekids.model.domain.UserModel;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

    Boolean join(UserModel userModel);

    UserDetails loadUserByUsername(String username);
}
