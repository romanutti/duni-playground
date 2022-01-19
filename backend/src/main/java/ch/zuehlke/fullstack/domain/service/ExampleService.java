package ch.zuehlke.fullstack.domain.service;

import ch.zuehlke.fullstack.data.mapper.ExampleMapper;
import ch.zuehlke.fullstack.data.repository.ExampleRepository;
import ch.zuehlke.fullstack.domain.model.ExampleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    private final ExampleRepository repository;
    private final ExampleMapper mapper;

    @Autowired
    public ExampleService(ExampleRepository repository, ExampleMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ExampleDto getExampleDto() {
        return mapper.exampleToExampleDto(repository.findAll().stream().findFirst().get());
    }

}
