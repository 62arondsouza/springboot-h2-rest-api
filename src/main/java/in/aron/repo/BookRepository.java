package in.aron.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.aron.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}
