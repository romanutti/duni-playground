package ch.zuehlke.fullstack.data;

import ch.zuehlke.fullstack.data.model.Example;
import ch.zuehlke.fullstack.data.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DemoDataProvider {

    @Autowired
    private ExampleRepository exampleRepository;

    @PostConstruct
    public void init(){
        exampleRepository.save(new Example(1, "Example1"));
        exampleRepository.save(new Example(2, "Example2"));
        exampleRepository.save(new Example(3, "Example3"));
        exampleRepository.save(new Example(4, "Example4"));
        exampleRepository.save(new Example(5, "Example5"));
    }

}
