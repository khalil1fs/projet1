// 22/11/2021 14:30 -> 16:30
//import java.util.*;
public class Point {
    double x, y;
    public Point(double a, double b) {
    this.x = a;
    this.y = b;       
    }
    public double dist(Point p1) {
    double dist = Math.sqrt((x-p1.x)*(x-p1.x)+(y-p1.y)*(y-p1.y));
    return dist;
    }
    public static void main(String[] args) {
  
        Point p1 = new Point(10,20);
        Point point1 = new Point(21,21);

     System.out.println("la distance entre les points est: "+point1.dist(p1));
 
   } 
 }

