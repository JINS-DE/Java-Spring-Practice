package problemsolve.simpleboard.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import problemsolve.simpleboard.board.db.BoardEntity;
import problemsolve.simpleboard.board.model.BoardDto;
import problemsolve.simpleboard.post.db.PostEntity;
import problemsolve.simpleboard.post.model.PostDto;
import problemsolve.simpleboard.post.service.PostConverter;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardConverter {
    private final PostConverter postConverter;
    public BoardDto toDto(BoardEntity boardEntity){

        var postList = boardEntity.getPostList()
                .stream()
                .map(postConverter::toDto)
                .collect(Collectors.toList());

        return BoardDto.builder()
                .id(boardEntity.getId())
                .boardName(boardEntity.getBoardName())
                .status(boardEntity.getStatus())
                .postList(postList)
                .build();
    }
}
