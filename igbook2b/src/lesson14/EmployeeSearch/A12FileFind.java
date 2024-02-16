package lesson14.EmployeeSearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class A12FileFind {
    public static void main(String[] args) {
        try(Stream<Path> files =
                    Files.find(
                            Paths.get("."), 9, (p, a) -> a.isDirectory())){

            files
                    .forEach(f -> System.out.println("Dirname: " + f));

        } catch (IOException e){
            System.out.println("Message: " + e.getMessage());
        }
    }
}
