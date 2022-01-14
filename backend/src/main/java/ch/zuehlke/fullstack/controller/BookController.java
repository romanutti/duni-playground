package ch.zuehlke.fullstack.controller;

import ch.zuehlke.fullstack.model.Book;
import ch.zuehlke.fullstack.service.BookService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @ApiOperation(value = "Get all Books")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully returned example"),
            @ApiResponse(code = 500, message = "If something fails internally")})
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> result;
        try {
            result = this.bookService.getAllBooks();
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
