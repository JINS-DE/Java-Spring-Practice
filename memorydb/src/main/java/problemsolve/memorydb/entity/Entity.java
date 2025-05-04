package problemsolve.memorydb.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import problemsolve.memorydb.user.model.UserEntity;


public abstract class Entity implements PrimaryKey {
    @Getter
    @Setter
    private Long id;

}
