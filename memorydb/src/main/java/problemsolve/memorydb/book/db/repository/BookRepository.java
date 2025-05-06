package problemsolve.memorydb.book.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import problemsolve.memorydb.book.db.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
