package ch.zuehlke.fullstack.service;

import ch.zuehlke.fullstack.model.ExampleDto;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@Profile("prod")
public class ExampleServiceDummy implements ExampleService {

    public ExampleDto getExampleDto() {

        return new ExampleDto("Prod profile", 99);
    }

}
