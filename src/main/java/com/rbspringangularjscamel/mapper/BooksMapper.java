package com.rbspringangularjscamel.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.rbspringangularjscamel.entity.Books;

@Mapper
public interface BooksMapper {

	public void addBook(Books book);
	public void updateBook(Books book);
	public void getBooks();
}
