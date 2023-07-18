package com.example.librarymanagementsystemmaven.service;

import com.example.librarymanagementsystemmaven.dao.BookDAO;
import com.example.librarymanagementsystemmaven.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDAO bookDAO;

    //add a book to the library
    public Book addBook(Book book){
        return bookDAO.save(book);
    }

    //return all the books in the library
    public List<Book> returnBookList(){
        return bookDAO.findAll();
    }

    //return a specific book based on the book id
    public Book getBook(int bookId){
        return bookDAO.findById(bookId).get();
    }

    //update the details of a specific book
    public Book updateBookDetails(int bookId, Book book){
        book.setBookId(bookId);
        return bookDAO.save(book);
    }
    //delete a specific book
    public void deleteBook(int bookId){
        bookDAO.deleteById(bookId);
    }
}
