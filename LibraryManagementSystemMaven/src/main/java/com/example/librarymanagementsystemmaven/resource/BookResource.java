package com.example.librarymanagementsystemmaven.resource;

import com.example.librarymanagementsystemmaven.model.Book;
import com.example.librarymanagementsystemmaven.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value="/book")
public class BookResource {
    @Autowired
    BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping
    public List<Book> getBookList(){
        return bookService.returnBookList();
    }
    @GetMapping(value="/{bookId}")
    public Book getBook (@PathVariable("bookId") int bookId)
    {
        return bookService.getBook(bookId);
    }
    @PutMapping(value="/{bookId}")
    public Book updateBookDetails(@PathVariable("bookId") int bookId,@RequestBody Book book){
        return bookService.updateBookDetails(bookId,book);
    }
    @DeleteMapping(value ="/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId){
        bookService.deleteBook(bookId);
}
}