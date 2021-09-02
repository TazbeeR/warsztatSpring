package pl.coderslab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")

public class BookController {

    private final List<Book> bookList;
    private final BookService bookService;

    @Autowired
//    private BookController(BookService bookService){
//    this.bookService = bookService;
//}

    public BookController(List<Book> bookList, BookService bookService) {
        this.bookList = bookList;
        this.bookService = bookService;
    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        Book book = new Book(4L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
        bookList.add(book);
        return book;

    }

    @GetMapping("")
    @ResponseBody
    public
    List<Book> getList() {
        return bookService.getBooks();
    }

//    @PostMapping("/addbook")
//    public void addbook(@RequestBody Book book) {
//        bookList.add(book);
//
//    }
}
