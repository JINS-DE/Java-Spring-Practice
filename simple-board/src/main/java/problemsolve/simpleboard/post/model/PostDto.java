package problemsolve.simpleboard.post.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PostDto {

    private Long id;

    private Long boardId;

    private String userName;
    private String password;
    private String email;
    private String status;
    private String title;
    private String content;
    private LocalDateTime postedAt;

}
