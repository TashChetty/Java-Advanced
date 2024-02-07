package lesson8;

import java.util.List;

public class RoboCallTest06 {
    public static void main(String[] args) {

            List<Person> pl = Person.createShortList();

            System.out.println("\n=== Print List ===");
            pl.forEach(p -> System.out.println(p));

        }
    }



