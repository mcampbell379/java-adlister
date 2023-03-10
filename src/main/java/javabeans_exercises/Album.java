package javabeans_exercises;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class Album implements Serializable {
    private int id;
    private String artist;
    private String recordName;
    private Date releaseDate;
    private float sales;
    private String genres;
}
