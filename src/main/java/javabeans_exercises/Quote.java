package javabeans_exercises;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Quote implements Serializable {
    private int id;
    private String content;
    // represents the foreign key in the quotes table
    private Author author;

    public Quote(String content, Author author) {
        this.content = content;
        this.author = author;
    }
}
