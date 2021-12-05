class Point1 {
   
public Point1(double x, char c) {
    abscisse = x;
    nom = c;
   } 
public void affiche() {
   System.out.println("le nom du point est : "+nom);
   System.out.println("l'abscisse du point est: "+abscisse);
   }
public void translate(double dx) {
    abscisse += dx;
   }
private char nom;
private double abscisse;
public static void main(String args[]) {
        Point1 a = new Point1(2.6,'r');
        a.affiche();


	Point1 b = new Point1(9.44,'d');
        b.affiche();
        b.translate(9.23);
    }
}
