package alyson.springframework.spring6webapp.bootstrap;

import alyson.springframework.spring6webapp.domain.Author;
import alyson.springframework.spring6webapp.domain.Book;
import alyson.springframework.spring6webapp.domain.Publisher;
import alyson.springframework.spring6webapp.repositories.AuthorRepository;
import alyson.springframework.spring6webapp.repositories.BookRepository;
import alyson.springframework.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author pedro = new Author();
        pedro.setFirstName("Pedro");
        pedro.setLastName("Rodrigo");

        Book ddd = new Book();
        ddd.setTitle("DDD");
        ddd.setIsbn("123456");

        Author carlo = new Author();
        carlo.setFirstName("Carlo");
        carlo.setLastName("Silva");

        Book book2 = new Book();
        book2.setTitle("Book 2");
        book2.setIsbn("789");

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Publisher 1");
        publisher.setState("SP");
        publisher.setCity("Santo André");
        publisher.setZip("000000");
        publisher.setAddress("Address 1");

        Author pedroSaved = authorRepository.save(pedro);
        Author carloSaved = authorRepository.save(carlo);

        Book dddSaved = bookRepository.save(ddd);
        Book book2Saved = bookRepository.save(book2);

        Publisher publisherSaved = publisherRepository.save(publisher);

        dddSaved.setPublisher(publisherSaved);
        book2Saved.setPublisher(publisherSaved);

        // pedroSaved.getBooks().add(dddSaved);
        // carloSaved.getBooks().add(book2Saved);
        dddSaved.getAuthors().add(pedroSaved);
        book2Saved.getAuthors().add(carloSaved);

        authorRepository.save(pedroSaved);
        authorRepository.save(carloSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(book2Saved);

        System.out.println("In bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());
    }
}
