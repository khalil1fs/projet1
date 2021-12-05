public class Voiture_Derivee extends Vehicle {
    private int nombreDePortes;
    public Voiture_Derivee(moteur,vitesseMax, int nombreDePortes) {
        super(moteur,vitesseMax);
        this.nombreDePortes=nombreDePortes;
    }
}