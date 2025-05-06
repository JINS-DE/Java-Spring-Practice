package problemsolve.simpleboard.post.service;

import org.springframework.stereotype.Service;
import problemsolve.simpleboard.post.db.PostEntity;
import problemsolve.simpleboard.post.model.PostDto;

@Service
public class PostConverter {

    public PostDto toDto(PostEntity postEntity){
        return PostDto.builder()
                .id(postEntity.getId())
                .userName(postEntity.getUserName())
                .status(postEntity.getStatus())
                .email(postEntity.getEmail())
                .password(postEntity.getPassword())
                .title(postEntity.getTitle())
                .content(postEntity.getContent())
                .postedAt(postEntity.getPostedAt())
                .boardId(postEntity.getBoard().getId())
                .build();
    }
}
