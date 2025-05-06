package problemsolve.simpleboard.post.db;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import problemsolve.simpleboard.board.db.BoardEntity;
import problemsolve.simpleboard.reply.db.ReplyEntity;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity(name="post")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // N:1
    @JsonIgnore
    @ToString.Exclude
    private BoardEntity board; // board + _id = board_id

    private String userName;
    private String password;
    private String email;
    private String status;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime postedAt;

    @OneToMany(
            mappedBy = "post"
    )
    private List<ReplyEntity> replyList = List.of();
}
