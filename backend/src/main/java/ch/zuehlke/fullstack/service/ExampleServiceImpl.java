package ch.zuehlke.fullstack.service;

import ch.zuehlke.fullstack.model.ExampleDto;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@Profile("default")
public class ExampleServiceImpl implements ExampleService {

    private static final List<String> POSSIBLE_VALUES = List.of("Example", "Beispiel", "Exemple", "Ejemplar", "приме́р");
    private static final Random RANDOM = new Random(System.currentTimeMillis());

    public ExampleDto getExampleDto() {
        int randomInt = RANDOM.nextInt(POSSIBLE_VALUES.size());

        return new ExampleDto(POSSIBLE_VALUES.get(randomInt), randomInt);
    }

}
