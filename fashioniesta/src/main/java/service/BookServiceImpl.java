package service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import dao.BookDao;
import models.Book;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
private BookDao bookDao;

	public BookDao getBookDao() {
	return bookDao;
}

public void setBookDao(BookDao bookDao) {
	this.bookDao = bookDao;
}
  @Transactional
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}
  
  public Book getBookByIsbn(int isbn) {
		return bookDao.getBookByIsbn(isbn);
	}
	public void deleteBook(int isbn) {
		 bookDao.deleteBook(isbn);
		
	}


}

