import java.util.ArrayList;

public class ShoppingMall {
    private ArrayList<Item> items;

    public ShoppingMall(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addDairy(Dairy dairy) {
        items.add(dairy);
    }

    public void addFruit() {
        Fruit fruit = new Fruit();
        items.add(fruit);
    }

    public void addTop() {
        Top top = new Top();
        items.add(top);
    }

    public void addTrousers() {
        Trousers trousers = new Trousers();
        items.add(trousers);
    }

    public void addUnderware() {
        Underware underware = new Underware();
        items.add(underware);
    }

    public void addVegetable() {
        Vegetable vegetable = new Vegetable();
        items.add(vegetable);
    }

    public void addArbitrary(Item item) {
        items.add(item);
    }

    public double bill() {
        return 0;
    }
}
