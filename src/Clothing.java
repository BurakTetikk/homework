public abstract class Clothing extends Item implements Washable{
    public Clothing() {
       // super(0.18);
        setVat(0.18);
    }

/*    public Clothing(double vat, double basePrice) {
        super(vat, basePrice);
    }*/
}
