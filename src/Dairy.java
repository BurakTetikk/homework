public class Dairy extends Food{
    public Dairy() {
        this(8.0);
    }

    public Dairy(double basePrice) {
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() {
        double taxedPrice = getBasePrice() * (1 + getVat());
        double retailPrice;
        retailPrice = (13 * taxedPrice) / 10;
        return retailPrice;
    }
}
