public class Vegetable extends Food implements Vegan, Washable{
    public Vegetable() {
        this(10.0);
    }

    public Vegetable(double basePrice) {
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() {
        double taxedPrice = getBasePrice() * (1 + getVat());
        double retailPrice;
        retailPrice = (25 * taxedPrice) / 100;
        return retailPrice;
    }

    @Override
    public void madeOf() {
        System.out.println("It is made only of vegetables.");
    }

    @Override
    public void howToWash() {
        System.out.println("Wash Vegetable with warm water.");
    }
}
