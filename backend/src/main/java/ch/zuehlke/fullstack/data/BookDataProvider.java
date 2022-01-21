package ch.zuehlke.fullstack.data;

import ch.zuehlke.fullstack.data.model.Book;
import ch.zuehlke.fullstack.data.repository.BookRepository;
import ch.zuehlke.fullstack.helper.BookHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class BookDataProvider  {

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void init() {
        bookRepository.save(new Book(1 ,"978-1-4920-7698-8",
                "Spring Boot: Up and running",
                new ArrayList<String>(Arrays.asList("Martin Heckler")),
                BookHelper.stringToDate("01.01.2020"),
                "Building Cloud Native Java and Kotlin Applications",
                Double.valueOf(5),
                new HashMap<String, String>(Map.of("https://assets.thalia.media/img/artikel/fce0f87046dcbf48cb73e0d96eb8e758c2a31ab0-00-00.jpeg","Cover")),
                "Spring Boot is the most widely used Java framework available. Its ease and power have revolutionized application development from monoliths to microservices. Yet Spring Boots simplicity can also be confounding. This practical book shows you how to use this framework to write successful mission-critical applications."));
    }
}
