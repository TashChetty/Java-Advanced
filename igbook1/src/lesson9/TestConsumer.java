package lesson9;

import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        Consumer<SalesTxn> buyerConsumer = t -> System.out.println("id " + t.getTxnId() + "Buyer: " + t.getBuyerName());
        tList.stream()
                .forEach(buyerConsumer);
    }
}
