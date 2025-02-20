package kr.safekids.service.serviceImpl;

import kr.safekids.model.domain.UserModel;
import kr.safekids.model.entity.UserEntity;
import kr.safekids.repository.UserRepository;
import kr.safekids.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder encoder;


    @Override
    public Boolean join(UserModel userModel) {
        String email = userModel.getEmail();
        String password = userModel.getPassword();

        Boolean byEmail = userRepository.existsByEmail(email);
        System.out.println(byEmail);

        if (byEmail) {
            return false;

        } else {
            UserEntity user = UserEntity.builder()
                    .email(email)
                    .password(encoder.encode(password))
                    .phone(userModel.getPhone())
                    .name(userModel.getName())
                    .role(userModel.getRole())
                    .entryDate(LocalDateTime.now())
                    .isActive(false)
                    .build();

            userRepository.save(user);
            return true;
        }

    }
}
