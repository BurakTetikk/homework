public class Fruit extends Food implements Washable, Vegan{

    public Fruit() {
        this(6.0);
    }

    public Fruit(double basePrice) {
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() {
        double taxedPrice = getBasePrice() * (1 + getVat());
        double retailPrice;
        retailPrice = (12 * taxedPrice) / 10;
        return retailPrice;
    }

    @Override
    public void madeOf() {
        System.out.println("It is made only of fruits.");
    }

    @Override
    public void howToWash() {
        System.out.println("Wash Fruit with cold water.");
    }
}
