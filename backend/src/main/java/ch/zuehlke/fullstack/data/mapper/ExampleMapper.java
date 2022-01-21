package ch.zuehlke.fullstack.data.mapper;

import ch.zuehlke.fullstack.data.model.Example;
import ch.zuehlke.fullstack.domain.model.ExampleDto;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface ExampleMapper {
    ExampleDto exampleToExampleDto(Example example);
}
