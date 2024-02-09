package lesson10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollectGrouping {
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        Map<String, List<Employee>> gMap = new HashMap<>();

        gMap = eList.stream()
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("Empl by dep");
        gMap.forEach((k,v)-> {
                    System.out.println("Dep: " + k);

                    v.forEach(Employee::printSummary);
                }
        );


    }


}
