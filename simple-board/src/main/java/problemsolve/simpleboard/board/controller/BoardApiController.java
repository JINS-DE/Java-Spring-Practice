package problemsolve.simpleboard.board.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import problemsolve.simpleboard.board.db.BoardEntity;
import problemsolve.simpleboard.board.model.BoardDto;
import problemsolve.simpleboard.board.model.BoardRequest;
import problemsolve.simpleboard.board.service.BoardService;

@Slf4j
@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardService boardService;

    @PostMapping("")
    public BoardDto create(
        @Valid
        @RequestBody BoardRequest boardRequest
    ){
        return boardService.create(boardRequest);
    }

    @GetMapping("/id/{id}")
    public BoardDto view(
            @PathVariable Long id
    ){
        var entity = boardService.view(id);
        log.info("result:{}",entity);
        return boardService.view(id);
    }
}
