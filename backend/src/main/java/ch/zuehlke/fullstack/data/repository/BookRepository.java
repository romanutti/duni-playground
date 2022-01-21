package ch.zuehlke.fullstack.data.repository;

import ch.zuehlke.fullstack.data.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
