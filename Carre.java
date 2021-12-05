public class Carre extends Figure {
    protected double cotes1;
    protected double cotes2;
public Carre(double abscisse,double ordonnee,double couleur,double cotes1,double cotes2){
    super(abscisse,ordonnee,couleur);
    this.cotes1 = cotes1;
    this.cotes2 = cotes2;
}

    
//private String Vector="l'abscisse: "+abscisse+". l'ordonnee: "+ordonnee+".couleur : "+couleur;
public static int getInstances(){
   return Vector;
}
   
}
