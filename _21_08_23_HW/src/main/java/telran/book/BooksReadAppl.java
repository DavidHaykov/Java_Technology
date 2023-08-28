package telran.book;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import telran.book.dto.Book;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BooksReadAppl {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        List<Book> books = mapper.readValue(new File("books.data"), new TypeReference<List<Book>>() {
        });
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
