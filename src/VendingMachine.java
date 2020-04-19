import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachine {
    HashMap <String, Double> items = new HashMap <String, Double>();
    private String snackType;
    private double price;

    public void addItem(String item, double price){
        items.put(item,price);
    }
    public void buyItem(String item, double money){
        if(money< items.get(item))
            throw new IllegalArgumentException();
        System.out.println("Change is:" + (money - items.get(item)));//add
        items.remove(item);

    }
    public void printItems(){
        items.forEach((key,value) -> System.out.println(key + " -> price: " + value));

    }
}
