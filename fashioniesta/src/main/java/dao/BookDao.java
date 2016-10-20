package dao;

import java.util.List;

import models.Book;

public interface BookDao {
		List<Book> getAllBooks();
		Book getBookByIsbn(int isbn);
		void deleteBook(int isbn);

		}


