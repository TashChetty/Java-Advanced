package lesson10;

import java.util.List;
import java.util.stream.Collectors;

public class TestCollectMath {
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();


        double avgSalary = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println("ave sal collect method for CO exec");
        System.out.printf("Average salary : $%,9.2f %n", avgSalary);

    }
}
