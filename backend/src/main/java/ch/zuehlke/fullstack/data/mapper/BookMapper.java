package ch.zuehlke.fullstack.data.mapper;

import ch.zuehlke.fullstack.data.model.Book;
import ch.zuehlke.fullstack.domain.model.BookDto;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface BookMapper {
    BookDto bookToBookDtoMapper(Book book);
}
