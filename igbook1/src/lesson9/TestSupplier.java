package lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
        List<SalesTxn> tList = new ArrayList<>(10);
        Supplier<SalesTxn> txnSupplier = () -> new SalesTxn.Builder()
                .txnId(101)
                .salesPerson("John Adams")
                .buyer(Buyer.getBuyerMap().get("PriceCo"))
                .product("Widget")
                .paymentType(("cash"))
                .unitPrice(20)
                .unitCount(10)
                .build();
        tList.add(txnSupplier.get());
        tList.forEach(t -> t.printSummary());
    }
}
