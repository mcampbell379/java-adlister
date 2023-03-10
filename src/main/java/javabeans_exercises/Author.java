package javabeans_exercises;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Author implements Serializable {
    private int id;
    private String name;

    public Author(String name) {
        this.name = name;
    }
}
