package problemsolve.simpleboard.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import problemsolve.simpleboard.board.db.BoardEntity;
import problemsolve.simpleboard.board.db.BoardRepository;
import problemsolve.simpleboard.board.model.BoardDto;
import problemsolve.simpleboard.board.model.BoardRequest;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    private final BoardConverter boardConverter;

    public BoardDto create(
            BoardRequest boardRequest
    ){
        var entity = BoardEntity.builder()
                .boardName(boardRequest.getBoardName())
                .status("REGISTERED")
                .build();
        var saveEntity = boardRepository.save(entity);

        return boardConverter.toDto(saveEntity);
    }

    public BoardDto view(Long id) {
        var entity = boardRepository.findById(id).get();
        return boardConverter.toDto(entity);
    }
}
