package problemsolve.simpleboard.board.model;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import problemsolve.simpleboard.post.db.PostEntity;
import problemsolve.simpleboard.post.model.PostDto;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BoardDto {
    private Long id;
    private String boardName;
    private String status;
    private List<PostDto> postList = List.of();
}
