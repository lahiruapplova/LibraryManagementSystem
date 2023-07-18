package com.example.librarymanagementsystemmaven.dao;
import com.example.librarymanagementsystemmaven.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookDAO extends JpaRepository<Book,Integer> {

}