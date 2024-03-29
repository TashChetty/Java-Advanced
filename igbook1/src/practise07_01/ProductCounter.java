package practise07_01;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {

    private Map<String, Long> productCountMap = new HashMap<>();
    private Map<String, String> productNames = new TreeMap<>();

    public static void main(String[] args) {


        String[] parts = new String[]{"1S01", "1S01", "1S01", "1S01", "1S01", "1S02", "1S02", "1S02", "1H01", "1H01", "1S02", "1S01", "1S01", "1H01", "1H01", "1H01", "1S02", "1S02", "1M02", "1M02", "1M02"};

        // Create Product Name Part Number map
        Map<String, String> productNames = new TreeMap<>();
        productNames.put("Blue Polo TShirt", "1S01");
        productNames.put("Black Polo LongShirt", "1S02");
        productNames.put("Red Ball Baseball Cap", "1H01");
        productNames.put("Duke Penguin Bowl   ", "1M02");

        ProductCounter pc1 = new ProductCounter(productNames);
        pc1.processList(parts);
        pc1.printReport();
    }

    public ProductCounter(Map productNames) {
        this.productNames = productNames;
    }

    public void processList(String[] list) {
        long curVal = 0;
        for (String itemNumber : list) {
            if (productCountMap.containsKey(itemNumber)) {
                curVal = productCountMap.get(itemNumber);
                curVal++;
                productCountMap.put(itemNumber, new Long(curVal));
            } else {
                productCountMap.put(itemNumber, new Long(1));
            }
        }
    }

    public void printReport() {
        System.out.println("Product Report : ");
        for (String key : productNames.keySet()) {
            System.out.print("Name: " + key);
            System.out.println("\t\tCount: " + productCountMap.get(productNames.get(key)));
        }
    }
}
