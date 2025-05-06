package problemsolve.jpa.user.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // 이미 스프링에서 만들어놓은 jpa 이용만하면된다
}
