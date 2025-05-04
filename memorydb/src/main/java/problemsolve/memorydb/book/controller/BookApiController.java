package problemsolve.memorydb.book.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import problemsolve.memorydb.book.db.entity.BookEntity;
import problemsolve.memorydb.book.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookApiController {
    private final BookService bookService;

    @PostMapping("")
    public BookEntity create(
            @RequestBody BookEntity bookEntity
    ){
        return bookService.create(bookEntity);
    }

    @GetMapping("/all")
    public List<BookEntity> findAll(

    ){
        return bookService.findAll();
    }
}
