package telran.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@Data
@AllArgsConstructor
public class TechnicalBook extends Book {
    private String technology;


    public TechnicalBook(long isbn, String Author, CoverType cover, int pages, LocalDate publishDate, String title, String technology) {
        super(isbn, Author, cover, pages, publishDate, title);
        this.technology = technology;
    }
}
