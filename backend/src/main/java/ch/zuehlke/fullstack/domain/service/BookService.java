package ch.zuehlke.fullstack.domain.service;

import ch.zuehlke.fullstack.domain.model.BookDto;

import java.util.List;

public interface BookService {

    public List<BookDto> getAllBooks();
}
