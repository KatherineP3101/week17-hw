package it.girl.week17_hw.repository;

import it.girl.week17_hw.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    Book findBookById(Long idByUser);
}
