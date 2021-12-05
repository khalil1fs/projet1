public class erreur {
    public static void main(String[] args) {
        int quotient=0;
        int  n1=9;
        int  n2=5;
        try{
            quotient = n1/n2;
        }catch(Exception a) {
            a.printStackTrace();
        }
        System.out.println("la quotient est : "+quotient);
    }
    
}
