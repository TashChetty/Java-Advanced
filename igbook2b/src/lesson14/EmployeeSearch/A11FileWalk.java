package lesson14.EmployeeSearch;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class A11FileWalk {
    public static void main(String[] args) {
        try(Stream<Path> files = Files.walk(Paths.get("."))){

            files
                    .forEach(line -> System.out.println(line));

        } catch (Exception e){
            System.out.println("Message: " + e.getMessage());
        }
    }
}
