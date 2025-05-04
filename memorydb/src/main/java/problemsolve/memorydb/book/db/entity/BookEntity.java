package problemsolve.memorydb.book.db.entity;

import lombok.*;
import problemsolve.memorydb.entity.Entity;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookEntity extends Entity {
    private String name;
    private String category;
    private BigDecimal amount;
}
