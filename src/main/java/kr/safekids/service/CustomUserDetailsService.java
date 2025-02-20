package kr.safekids.service;

import kr.safekids.model.domain.CustomUserDetails;
import kr.safekids.model.entity.UserEntity;
import kr.safekids.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserEntity byEmail = userRepository.findByEmail(email);
        if (byEmail != null) {
            return new CustomUserDetails(byEmail);
        }

        return null;
    }
}
