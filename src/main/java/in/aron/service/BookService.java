package in.aron.service;

import java.util.List;

import in.aron.entity.Book;

public interface BookService {
	
	public String upsertBook(Book book);
	public List<Book> getAllBooks();
	public String deleteBook(Integer bookId);
}
