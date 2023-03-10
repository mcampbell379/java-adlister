package models;

import java.util.ArrayList;
import java.util.Date;

public class BeanTest {
    public static void main(String[] args) {
        // use no args constructor when using beans
        Album pitbullAlbum = new Album();
        pitbullAlbum.setId(1);
        pitbullAlbum.setArtist("Pitbull");
        pitbullAlbum.setAlbumName("The World");
        pitbullAlbum.setSales(20000000.99);
        pitbullAlbum.setGenres("Greatest Music Of All Time");
        pitbullAlbum.setReleaseDate(new Date(2020-12-25));
        System.out.println(pitbullAlbum);

        Author robert = new Author("Robert", "Martini");
        Author bobert = new Author("Bobert", "Bambini");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(new Quote("Ur mom", robert));
        quotes.add(new Quote("Ur granny", bobert));

        for (Quote quote : quotes) {
            System.out.println(quote);
        }
    }
}
