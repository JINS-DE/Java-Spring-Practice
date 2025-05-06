package problemsolve.jpa.user.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "user") // user테이블과 매핑하겠다 선언

// object와 db 컬럼들 매칭해주는게 orm
public class UserEntity {

    // PK로 작동해서 @Id 어노테이션 달아줘야하고
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mysql은 IDENTITY 사용, id 값은 MYSQL에 의해 AI될것임
    private Long id;
    private String name;
    private Integer age;
    private String email;

}
