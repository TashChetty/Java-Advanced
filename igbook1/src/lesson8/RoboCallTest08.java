package lesson8;

import java.util.List;
import java.util.function.Predicate;

public class RoboCallTest08 {
    public static void main(String[] args){

        List<Person> pl = Person.createShortList();
        RoboCall05 robo = new RoboCall05();

        System.out.println("\n=== Calling all Drivers Lambda ===");
        Predicate<Person> allPlilots = p -> p.getAge() >=23 && p.getAge() <=65;
         pl.stream()
                .filter(p -> p.getAge() >= 23 && p.getAge() <= 65)
                .forEach(p -> robo.roboCall(p));

    }
}


