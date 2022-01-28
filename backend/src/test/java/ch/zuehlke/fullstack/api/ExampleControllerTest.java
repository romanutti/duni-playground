package ch.zuehlke.fullstack.api;

import ch.zuehlke.fullstack.domain.model.ExampleDto;
import ch.zuehlke.fullstack.domain.service.ExampleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest()
@AutoConfigureMockMvc
class ExampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ExampleService exampleService;

    @Test
    void getExample() throws Exception {
        when(exampleService.getExampleDto()).thenReturn(new ExampleDto("Examplevalue", 1));
        mockMvc.perform(get("/api/example")).andExpect(status().isOk());
    }
}