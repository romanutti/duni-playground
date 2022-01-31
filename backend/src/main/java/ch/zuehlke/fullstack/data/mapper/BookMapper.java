package ch.zuehlke.fullstack.data.mapper;

import ch.zuehlke.fullstack.data.model.Book;
import ch.zuehlke.fullstack.domain.model.BookDto;
import ch.zuehlke.fullstack.domain.model.ThumbnailDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Mapper(
        componentModel = "spring"
)
public interface BookMapper {
    BookDto bookToBookDtoMapper(Book book);
    List<BookDto> booklistToBookDtoListMapper(List<Book> books);

    default List<ThumbnailDto> mapToThumbnailList(Map<String, String> thumbnailMap){
        List <ThumbnailDto> thumbnailList = new ArrayList<>();
        for (Map.Entry<String, String> entry: thumbnailMap.entrySet()){
            thumbnailList.add((new ThumbnailDto(entry.getKey(), entry.getValue())));
        }
        return thumbnailList;
    }

}
