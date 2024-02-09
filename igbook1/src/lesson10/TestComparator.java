package lesson10;

import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        System.out.println("sorting surname");

        eList.stream()
              //  .filter(e -> e.getRole().equals(Role.EXECUTIVE))
             //   .filter(e -> e.getState().equals("CO"))
                .sorted(Comparator.comparing(Employee::getSurName))
                .forEach( Employee::printSummary);

        System.out.println("sorting reverse surname");

        eList.stream()
               // .filter(e -> e.getRole().equals(Role.EXECUTIVE))
              //  .filter(e -> e.getState().equals("CO"))
                .sorted(Comparator.comparing(Employee::getSurName).reversed())
                .forEach( Employee::printSummary);

        System.out.println("sorting  surname dept");

        eList.stream()
               // .filter(e -> e.getRole().equals(Role.EXECUTIVE))
              //  .filter(e -> e.getState().equals("CO"))

                .sorted(Comparator.comparing(Employee::getDept)
                .thenComparing(Employee::getSurName))
                .forEach( Employee::printSummary);


    }
    }

