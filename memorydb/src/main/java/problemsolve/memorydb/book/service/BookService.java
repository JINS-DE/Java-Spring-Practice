package problemsolve.memorydb.book.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import problemsolve.memorydb.book.db.entity.BookEntity;
import problemsolve.memorydb.book.db.repository.BookRepository;

import java.util.List;

/*
BookRepository는 @Service 어노테이션으로 Spring에서 이미 Bean으로 관리되고 있다.
스프링 컨텍스트에서 어떻게 빈을 찾아서 주입해줄 방법들을 고민한 3가지이다.

1번 방법
그래서 아래와 같이 생성자 public BookService(BookRepository bookRepository)에 주입받고
생성자를 통해 bookRepository를 초기화 시켜줄 수 있다.

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
}

2번 방법
@RequiredArgsConstructor를 어노테이션을 사용해서 생성자 자동 구현(Lombok에서 제공)

예시)
@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
}

3번 방법
@Autowired 사용

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
}

* */
@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    // create, update
    public BookEntity create(BookEntity book){
        return bookRepository.save(book);
    }

    // all
    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }
}



