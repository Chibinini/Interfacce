public class Triangolo implements Forma {
    private double altezza;
    private double larghezza;


    public Triangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    @Override
    public double calcolaArea() {
        return altezza * larghezza / 2 ;
    }
}
