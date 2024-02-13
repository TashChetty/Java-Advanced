package practise10_07;

import java.util.List;
import java.util.stream.Collectors;


public class JoinTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        // sorted Buyer's List
        System.out.println("sorted Buyer's List");
        String result = tList.stream()
            .map(t -> t.getBuyerName())
            .distinct()
            .sorted()
            .collect(Collectors.joining(", "));
        
        System.out.println("Buyer list: " + result);
            
        
        
        
    }
}
