package practise10_06;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        List<SalesTxn> rList;
        
        // Transactions over $300k
        System.out.println("Transactions over $300 000");
        rList = tList.stream()
            .filter(t -> t.getTransactionTotal() > 300000)
            .sorted(Comparator.comparing(SalesTxn::getTransactionTotal))
            .collect(Collectors.toList());
            
        
        rList.stream()
            .forEach( t -> 
                System.out.printf(
                    "Id: " + t.getTxnId() + " Seller: " + t.getSalesPerson() + 
                    " Buyer: " + t.getBuyerName() +
                    " Amt: $%,9.2f%n", t.getTransactionTotal()
                )
            );
        
        
    }
}
