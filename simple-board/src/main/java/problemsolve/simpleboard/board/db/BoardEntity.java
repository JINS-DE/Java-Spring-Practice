package problemsolve.simpleboard.board.db;

import jakarta.persistence.*;
import lombok.*;
import problemsolve.simpleboard.post.db.PostEntity;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String boardName;
    private String status;

    // 1:N 매핑  board(1) : Post(N)
    @OneToMany(
            mappedBy = "board" // PostEntity안의 변수의 이름 board
    )
    private List<PostEntity> postList = List.of();
}
