package kr.safekids.controller;

import kr.safekids.model.domain.UserModel;
import kr.safekids.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserService userService;

    @PostMapping("join")
    public ResponseEntity<Boolean> joinProcess(@RequestBody UserModel userModel) {
        return ResponseEntity.ok(userService.join(userModel));
    }
}
