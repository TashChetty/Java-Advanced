package lesson8;

import java.util.List;
import java.util.function.Predicate;

public class A03MethodReference {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        Predicate<SalesTxn> transCA = t -> t.getState().equals(State.CA);
        System.out.println("\nPrice List for CA transactions " );
//        tList.stream()
//                .filter(t -> t.getState().equals(State.CA))
//                .forEach(t -> t.printSummary());

        tList.stream()
                .filter(transCA)
                .forEach(SalesTxn ::printSummary);


    }
    }
