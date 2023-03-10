package models;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Album implements Serializable {
    private int id;
    private String artist;
    private String albumName;
    private Date releaseDate;
    private float sales;
    private String genres;
}
