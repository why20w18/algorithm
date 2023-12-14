package basicAlgorithm;
import java.util.Scanner;

public class kuadratikDenklem {
    
    public static double[] hesaplayici(double a , double b , double c){
       
        double diskriminant = ((b*b)+(-4*a*c));
       
        if(diskriminant < 0){
            System.out.println("kokler karmasik sayidir !");
            return new double[] {Double.NaN , Double.NaN}; //Not a Number
        }
        
        double x1 = ((-b + Math.sqrt(diskriminant))/2*a);
        double x2 = ((-b - Math.sqrt(diskriminant))/2*a);
        
        return new double[] {x1,x2};
    }
    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ax^2 + bx + c\na:");
        double a = scanner.nextInt();
        
        System.out.print("b:");
        double b = scanner.nextInt();
        
        System.out.print("c:");
        double c = scanner.nextInt();
        
        System.out.printf("%.1fx^2 + %.1fx + %.1f\n",a,b,c);
        double[] kokler = hesaplayici(a, b, c);
        
        System.out.printf("\nx1  =  %2.2f\nx2  = %3.2f ",kokler[0],kokler[1]);
        
    }
    
}
