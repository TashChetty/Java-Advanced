package practise10_08;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Map<String, List<SalesTxn>> tMap;
        
        // transactions grouped by Buyer
        System.out.println("transactions grouped by buyer");
        tMap = tList.stream()
            .collect(Collectors.groupingBy(SalesTxn::getBuyerName));
        
        tMap.forEach((k,v) -> {
            System.out.println("\nbuyer: " + k);
            v.forEach(SalesTxn::printSummary);
        });
        
        
        
    }
}
