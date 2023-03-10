package models;

import java.util.ArrayList;
import java.util.Date;

public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album(0,"Pitbull","Worldwide",new Date(2021-12-25), 6.42,"Greatest music of all time");

        System.out.println(album);

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
