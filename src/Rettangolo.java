public class Rettangolo implements Forma {
    private double altezza;
    private double larghezza;


    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    @Override
    public double calcolaArea() {
        return altezza * larghezza;
    }
}
