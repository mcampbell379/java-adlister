package javabeans_exercises;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album();

        Author robert = new Author("Robert");
        Author bobert = new Author("Bobert");

        Quote robertQuote = new Quote("urmom", robert);
        Quote bobertQuote = new Quote("urgranny", bobert);

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(robertQuote);
        quotes.add(bobertQuote);

        for (Quote quote : quotes) {
            System.out.println(quote.toString());
        }
    }
}
