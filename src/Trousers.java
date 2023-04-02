public class Trousers extends Clothing{
    public Trousers() {
        this(40.0);
    }

    public Trousers(double basePrice) {
        setBasePrice(basePrice);
    }



    @Override
    public double calculatePrice() {
        double taxedPrice = getBasePrice() * (1 + getVat());
        double retailPrice;
        retailPrice = (45 * taxedPrice) / 100;
        return retailPrice;
    }

    @Override
    public void howToWash() {
        System.out.println("Wash Trousers at 30 degress");
    }
}
