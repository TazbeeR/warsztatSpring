package pl.coderslab;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final List<Book> bookList;

    public BookController(List<Book> bookList) {
        this.bookList = bookList;
    }

    @RequestMapping("/helloBook")
public Book helloBook() {
    return new Book(1L, "9788324631766", "Thinking in Java",
            "Bruce Eckel", "Helion", "programming");
    }
    @PostMapping("/addbook")
    public void addBook(@RequestBody Book book){
        bookList.add(book);
//        @ResponseBody
    }

}
