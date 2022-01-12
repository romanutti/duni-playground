package ch.zuehlke.fullstack.controller;

import ch.zuehlke.fullstack.service.ExampleService;
import ch.zuehlke.fullstack.service.ExampleServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExampleControllerTest {

    private ExampleController testee;

    @BeforeEach
    void setup(){
        //ExampleService service = Mockito.mock(ExampleServiceImpl.class);
        //testee = new ExampleController(service);
    }

    @Test
    void getExample() {
        //testee.getExample();
    }
}