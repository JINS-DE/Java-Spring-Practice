package problemsolve.memorydb.user.controller;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import problemsolve.memorydb.user.db.UserRepository;
import problemsolve.memorydb.user.model.UserEntity;
import problemsolve.memorydb.user.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor // 생성자 메소드로 채워달라는 어노테이션
public class UserApiController {

    private final UserService userService;

    // 생성 및 수정
    @PutMapping("")
    public UserEntity create(
            @RequestBody UserEntity userEntity
    ){
        return userService.save(userEntity);
    }

    // user 전체 찾기
    @GetMapping("/all")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }

    //delete , findby id -> path variable로 받아서
    @DeleteMapping("/id/{id}")
    public void delete(
        @PathVariable Long id
    ){
//        userService.delete(id);
    }

    @GetMapping("/id/{id}")
    public UserEntity findOne(
            @PathVariable Long id
    ){
        var response = userService.findById(id);
        return response.get();

    }

    @GetMapping("/score")
    public List<UserEntity> findScore(
            @RequestParam int score
    ){
        return userService.filterScore(score);

    }

    @GetMapping("/min_max")
    public List<UserEntity> findScore(
            @RequestParam int min,
            @RequestParam int max
    ){
        return userService.filterScore(min,max);

    }

}
