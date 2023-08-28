package telran.book.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class LiteratureBook extends Book {
    private Genre genre;

    public LiteratureBook(long isbn, String Author, CoverType cover, int pages, LocalDate publishDate, String title, Genre genre) {
        super(isbn, Author, cover, pages, publishDate, title);
        this.genre = genre;
    }
}
