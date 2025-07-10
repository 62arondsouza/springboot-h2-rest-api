package in.aron.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.aron.entity.Book;
import in.aron.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository repository;
	
	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
	}
	@Override
	public String upsertBook(Book book) {
		Integer bookId = book.getBookId();
		repository.save(book);
		if(bookId == null) {
			return "Book Inserted";
		} else {
			return "Book Updated";
		}
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> list = repository.findAll();
		return list;
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "Book Deleted";
	}

}
