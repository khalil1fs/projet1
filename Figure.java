public class Figure {
   protected double abscisse;
   protected double ordonnee;
   protected int couleur;
  
public Figure(double abscisse, double ordonnee, int couleur) {
   super();
this.abscisse=abscisse;
this.couleur=couleur;
this.ordonnee=ordonnee;
}
private String Vector="l'abscisse: "+abscisse+". l'ordonnee: "+ordonnee+".couleur : "+couleur;
public static int getInstances(){
   return Vector;
}
   


}