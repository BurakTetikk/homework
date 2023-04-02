import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Dairy());
        items.add(new Fruit());
        items.add(new Top());
        items.add(new Trousers());
        items.add(new Underware());
        items.add(new Vegetable());
        items.add(new Top(100));
        ShoppingMall shoppingMall = new ShoppingMall(items);
    }
    public static void printContent(ShoppingMall shoppingMall) {

    }
}
