package service;
import java.util.List;
import models.Book;
public interface BookService {
List<Book> getAllBooks();
Book getBookByIsbn(int isbn);
void deleteBook(int isbn);

}
