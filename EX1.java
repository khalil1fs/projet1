package TP1;


import java.util.Scanner;


public class EX1 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=10;
	
	      int random = (int)((b-a)*Math.random()+a);
	      
         
         int nbr;
        
         System.out.println("Merci d'entrer un nombre entre 1 et 10:");
         Scanner input=new Scanner(System.in);
         nbr=input.nextInt(); 
     do 
         {    System.out.println("Merci de rentrer � nouveau le nombre plus grand ou plus petit");
         nbr=input.nextInt();
        } while(random!=nbr);
       
      System.out.println("Vous avez gagnez");
        
	}
	
}



