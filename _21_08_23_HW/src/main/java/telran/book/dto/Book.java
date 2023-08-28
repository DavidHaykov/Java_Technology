package telran.book.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = LiteratureBook.class, name = "Literature"), @JsonSubTypes.Type(value = TechnicalBook.class, name = "Technician")})
public class Book implements Serializable {
    private long isbn;
    private String Author;
    private CoverType cover;
    private int pages;
    private LocalDate publishDate;
    private String title;
}
