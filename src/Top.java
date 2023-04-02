public class Top extends Clothing{
    public Top() {
        this(20.0);
    }

    public Top(double basePrice) {
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
    public void howToWash() {
        System.out.println("Wash Top at 40 degress.");
    }
}
