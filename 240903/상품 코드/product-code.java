import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String itemName = sc.next();
        int itemCode = sc.nextInt();

        Item item1 = new Item("codetree", 50);
        Item item2 = new Item(itemName, itemCode);

        item1.printInfo();
        item2.printInfo();
    }
}

class Item {

    private String itemName;
    private int itemCode;

    public Item(String itemName, int itemCode) {
        this.itemName = itemName;
        this.itemCode = itemCode;
    }

    public void printInfo() {
        System.out.println("product " + itemCode + " is " + itemName);
    }
}