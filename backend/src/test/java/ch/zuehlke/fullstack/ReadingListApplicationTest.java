package ch.zuehlke.fullstack;

import ch.zuehlke.fullstack.annotations.ExampleAnnotation;
import ch.zuehlke.fullstack.domain.model.BookDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.lang.annotation.Annotation;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ReadingListApplicationTest {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testAnnotation() {
        BookDto bookDto = new BookDto();
        Annotation[] annotations =  bookDto.getClass().getAnnotations();
        ExampleAnnotation exampleAnnotation = bookDto.getClass().getAnnotation(ExampleAnnotation.class);
        System.out.println(exampleAnnotation.value);
    }

}