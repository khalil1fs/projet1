public class Student {
protected  String Nom;
public String Prenom;
protected int age ;
public Student(String Nom,String Prenom) {
  this.Nom=Nom;
  this.Prenom=Prenom;
}
public void getName() {
  System.out.println(this.Nom+" is the name of the student ");
}
public void getPrenom() {
  System.out.println(this.Prenom+" is the lastname of the student ");
}
@Override
public String toString(){
  return "The info : "+Nom+","+this.Prenom;
}


public static void main(String[] args) {
  Student stu = new Student("khalil","Aboulouane");
    stu.getName();
    stu.getPrenom();
   System.out.println(stu.toString());    
}
}









/*
class Test1 {
   protected String name;     
    public void getName(String name) {    
      this.name = name;                
      System.out.println("My name is "+ name);
    }
    public String getnom(){
      return name;
    }
  }
  public class Student extends Test1 {         /* le type de l'extends 
    private String cours = "Java";   
    public static void main(String[] args) {                /* Main fonction  
      Student st = new Student();                           /* Creation d'un Objet st par Student
      st.getName("khalil");
      System.out.println(st.name + " " + st.cours);
    }
  }
  */