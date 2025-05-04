package problemsolve.memorydb.user.model;

import lombok.*;
import problemsolve.memorydb.entity.Entity;

@EqualsAndHashCode(callSuper = true) // Entity 클래스(부모 클래스)의 id 필드도 equals()와 hashCode()연산에 사용할 수 있게함
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity extends Entity {

    private String name;
    private int score;
}
