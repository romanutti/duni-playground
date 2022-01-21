package ch.zuehlke.fullstack.domain.service;

import ch.zuehlke.fullstack.domain.model.Book;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Profile("default")
public class BookServiceImpl implements BookService {

    @Override
    public List<Book> getAllBooks() {
        List<Book> booklist = new ArrayList<>();
        Book dummyBook = new Book("978-1-4920-7698-8",
                "Spring Boot: Up and running",
                new ArrayList<String>(Arrays.asList("Martin Heckler")),
                stringToDate("01.01.2020"),
                "Building Cloud Native Java and Kotlin Applications" ,
                Double.valueOf(5),
                new HashMap<String, String>(Map.of("https://assets.thalia.media/img/artikel/fce0f87046dcbf48cb73e0d96eb8e758c2a31ab0-00-00.jpeg","Cover")),
                "Spring Boot is the most widely used Java framework available. Its ease and power have revolutionized application development from monoliths to microservices. Yet Spring Boots simplicity can also be confounding. This practical book shows you how to use this framework to write successful mission-critical applications.");

        booklist.add(dummyBook);
        return booklist;
    }

    public Date stringToDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.GERMAN);
        try {
            return formatter.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
