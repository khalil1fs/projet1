public class Compte {
    
    private int numero;
    private int code_secret;
    private Double solde;
    private char type_de_compte;

    Compte()                  // constructor without parameter 
{
    this.numero=9999;
    this.type_de_compte=' ';
    this.solde=0d;
    this.code_secret=0;
}

Compte(int numero,char type_de_compte,double solde)   // constructor with parameter
{
        this.numero = numero;
        this.solde = solde;
        if(type_de_compte=='D' || type_de_compte=='E') 
          {
            this.type_de_compte = type_de_compte;
          }
        else 
          {
            this.type_de_compte = 'F';
          }
        }

        int random_codeSecret() 
{
    this.code_secret= (int)((9999-100)*Math.random()+100);
    return code_secret;
}

public void setNum_compte(int nmr)  // set numero de compte
{
this.numero=nmr;
}

public void settype_de_compte(char t) // set type de compte
{
this.type_de_compte=t;
}
        
public int getCode_Secret()       // get code secret
{
    return code_secret;
}

public int getNumero()            // get numero de compte
{
    return numero;
}

public void debit(double somme)   // debit un somme
{
    this.solde += somme;
}

public void repot(double somme)   // retrait un somme
{
    this.solde -= somme;
}
public String toString() 
{
    return "le compte "+numero+" de solde "+solde+" et de type "+type_de_compte+" et de code secret "+random_codeSecret();
}

public static void main(String[] args)  // main method
{
Compte v1 = new Compte(333,'E',444.9);
Compte v2 = new Compte(789,'D',5.94);

System.out.println("l'objet est pret a utiliser \nle random secret nombre est: "+v1.random_codeSecret());     
System.out.println("le type de compte est: "+v1.type_de_compte);
System.out.println("le string  est "+v1.toString());        // v1 to string option
System.out.println("le string de v2 est : "+v2.toString()); // v2 to string option
}}