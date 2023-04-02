public abstract class Item {
    private double vat;
    private double basePrice;

    public Item() {
    }

    public Item(double vat) {
        this.vat = vat;
    }

    public Item(double vat, double basePrice) {
        this.vat = vat;
        this.basePrice = basePrice;
    }


    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();
}
