import java.util.Scanner;
public class Resolve {
    public static void main(String[] args) {
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le Text pour l'inverser: ");
        text = sc.nextLine();
        System.out.println("Votre Text est : "+text);
    //    System.out.println(text.charAt(3));
  //       int j = text.length()-1;
        for(int i=text.length();;i--) {
            System.out.print(text.charAt(i));

        }
        
    }
    
}
/* 
Bidul b = new Bidul();
b.f()=2
b.g()=4    

Machin m.f()=5   m.g()=6



*/