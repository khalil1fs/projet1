public class Vehicule {
    private boolean moteur;
    private int vitessMax;
public Vehicule(boolean moteur, int vitessMax) {
    this.moteur = moteur;
    this.vitessMax = vitessMax;
}
public void Vmax() {
    System.out.println("la Vitesse Max de Vehicule : "+this.vitessMax);
}
public boolean getmoteur() {
    return moteur;
}
public void setmoteur(boolean moteur1) {
    this.moteur=moteur1;
}


public int getVitessMax() {
    return vitessMax;
}
public void setVitessMax(int vitessMax1) {
    this.vitessMax=vitessMax1;
}

public String toString() { 
    if(moteur==true) 
    return "la vehicule est en Marche et sa vitesse Max est : "+this.vitessMax;
    else 
    return "la Vehicule est en repos ! ";
}

}
