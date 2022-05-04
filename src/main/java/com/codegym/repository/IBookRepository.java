package com.codegym.repository;


import com.codegym.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IBookRepository extends PagingAndSortingRepository<Book,Long> {
Page<Book> findAllByName(String name, Pageable pageable);
}
