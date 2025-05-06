package problemsolve.jpa.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import problemsolve.jpa.user.db.UserEntity;
import problemsolve.jpa.user.db.UserRepository;

import java.util.List;


@RequiredArgsConstructor // 생성자로 UserRepository 주입 받겠다 !
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    private final UserRepository userRepository;

    @GetMapping("/find-all")
    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/{name}")
    public void autoSave(
            @RequestParam String name
    ){
        var user = UserEntity.builder()
                .name(name)
                .build();
        userRepository.save(user);
    }
}

