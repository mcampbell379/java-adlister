package people;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person implements Serializable {
    private String name;
    private int age;
    private Puppy puppy;

    // for if a person wants multiple puppies
//    private ArrayList<Puppy> chaos;

    public Person(String name){
        this.name = name;
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.puppy = null;
    }


    public static void main(String[] args) {
        Puppy spot  = new Puppy("Spot");
        Person bob = new Person("Bob", 42, spot);

        System.out.println(bob);

        Puppy rover = new Puppy("Rover");
        bob.setPuppy(rover);

        System.out.println(bob);
    }
}
