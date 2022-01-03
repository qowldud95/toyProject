package project.demo.bookRegisterTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import project.demo.domain.Book;
import project.demo.repository.BookRepository;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
public class BookRegisterTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void bookInsert() {
        Book book = new Book();
        book.setIndex("123");
        bookRepository.insertBook(book);
    }
}
