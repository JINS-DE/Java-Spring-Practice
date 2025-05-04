package problemsolve.memorydb.book.db.repository;

import org.springframework.stereotype.Service;
import problemsolve.memorydb.book.db.entity.BookEntity;
import problemsolve.memorydb.db.SimpleDataRepository;

@Service
public class BookRepository extends SimpleDataRepository<BookEntity, Long> {

}
