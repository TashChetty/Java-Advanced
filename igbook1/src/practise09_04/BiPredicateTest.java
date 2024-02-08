package practise09_04;

import java.util.List;
import java.util.function.BiPredicate;


public class BiPredicateTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    String searchState = "KS";
    
    BiPredicate<Employee, String> eBiPred = 
      (e, s) -> e.getState().equals(s);
      
    System.out.println(" Print matching list");
    for(Employee e:eList){
      if (eBiPred.test(e, searchState)){//test using pred
        e.printSummary();
      }
    }
  }
}
