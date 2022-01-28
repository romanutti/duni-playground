package ch.zuehlke.fullstack.domain.service;

import ch.zuehlke.fullstack.data.mapper.BookMapper;
import ch.zuehlke.fullstack.data.repository.BookRepository;
import ch.zuehlke.fullstack.domain.model.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("default")
public class BookServiceImpl implements BookService {

    @Autowired
    private final BookRepository bookRepository;
    private final BookMapper mapper;

    public BookServiceImpl(BookRepository bookRepository, BookMapper mapper) {
        this.bookRepository = bookRepository;
        this.mapper = mapper;
    }

    @Override
    public List<BookDto> getAllBooks() {
        return mapper.booklistToBookDtoListMapper(bookRepository.findAll());
    }

}
