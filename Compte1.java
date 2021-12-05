public class Compte1 {
   private int numero;
   private char type_compte;
   private double solde;
   private int code_Secret;
Compte1(){                                                    /* Normal Constructor */
    this.numero=999999;
    this.type_compte=' ';
    this.solde=0;
    this.code_Secret=0;
} 
Compte1(int New_Numero,char type_de_compte,double NewSolde){   /* constructor with parameter */
    if(type_de_compte=='D' || type_de_compte=='E') 
    {
      this.type_compte = type_de_compte;
    }
  else 
    {
      this.type_compte = ' '; 
      this.code_Secret= (int)(9899*Math.random()+100);
    }
    this.numero=New_Numero;
    this.type_compte=type_de_compte;
    this.solde=NewSolde;

}
public void rand_Secret() {              /*     set  a random password */
    this.code_Secret= (int)(9899*Math.random()+100);
}
public void setType_compte(char type){
    this.type_compte=type;
}
public void setNumero(int Numero){
    this.numero=Numero;
}
public int getNumero() {
    return numero;
}
public int getCode_secret(){
    return code_Secret;
}
public void depot(int Montant){
    this.solde += Montant;
}
public void retrait(int Montant){
    this.solde -= Montant;
}
public String toString(){ 
    return "le compte numero "+this.numero+" de Type "+type_compte+" de Solde "+solde+" .";
}

}
