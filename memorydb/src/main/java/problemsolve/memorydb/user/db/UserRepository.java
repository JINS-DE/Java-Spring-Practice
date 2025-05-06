package problemsolve.memorydb.user.db;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import problemsolve.memorydb.user.model.UserEntity;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // select * from user where score > [??]

    //Camel 케이스 기준으로 쿼리 메소드를 작성
    //jpa에서 지원하는 쿼리 메소드를 제외하고 들어오는 파라미터의 순서대로매칭을 하게 된다.
    public List<UserEntity> findAllByScoreGreaterThanEqual(int sc);

    // SELECT * FROM user WHERE score>= ?? AND score <= ??
    List<UserEntity> findAllByScoreGreaterThanEqualAndScoreLessThanEqual(int min,int max);

    //?1 -> min , ?2 -> max
    @Query(
            value = "select * from user as u where u.score >= :min AND u.score <= :max",
            nativeQuery = true
    )
    List<UserEntity> score(
            @Param(value = "min") int min,
            @Param(value = "max") int max);
}
