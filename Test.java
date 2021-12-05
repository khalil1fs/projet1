class Test    {    // final class Test // public final class Test

public static Double somme(Double a, Double b) {
    return a+b;
}
public static Double somme(Double a,int b) {
    return a+b;
}
   
    public static Double somme(int a, Double b) {
        return a+b;
    } 
public static void main(String[] args) {
    System.out.println("la somme est :  "+somme(12,19.9));
}

}