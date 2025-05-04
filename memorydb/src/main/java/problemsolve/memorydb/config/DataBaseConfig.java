package problemsolve.memorydb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import problemsolve.memorydb.user.db.UserRepository;

//@Configuration // Spring이 실행될 때 여기를 찾아 특정한 내용들을 spring bean context라는 영역에 new 생성자를 통해 객체를 만들어놓음
//public class DataBaseConfig {
//
//    @Bean
//    public UserRepository userRepository(){
//        return new UserRepository();
//    }
//}
