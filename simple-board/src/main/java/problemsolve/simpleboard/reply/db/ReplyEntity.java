package problemsolve.simpleboard.reply.db;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import problemsolve.simpleboard.post.db.PostEntity;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name="reply")
public class ReplyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @ToString.Exclude
    @JsonIgnore
    private PostEntity post; // post => _id => post_id
    private String userName;
    private String password;
    private String status;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;
    private LocalDateTime repliedAt;
}
