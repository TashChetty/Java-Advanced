package lesson8;

import java.util.List;

public class A04ManyFilters {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        System.out.println("CA transaction for ACME using two filters");

        tList.stream()
                .filter(t-> t.getState().equals(State.CA))
                .filter(t-> t.getBuyerName().equals("Acme Electronics"))
                .forEach(SalesTxn:: printSummary);
        System.out.println("CA one filter with logic operator");
        tList.stream()
                .filter(t->(t.getState().equals(State.CA))&&(t.getBuyerName().equals("Acme Electronics")))
                .forEach(t-> t.printSummary());
    }
}
