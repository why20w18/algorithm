package recursiveAlgorithm;
import java.util.Scanner;

public class fibonacciRecursive{
    
    public static int fiboRecursive(int n){
    
        if(n <= 1){
            return n;
        }
        
        return fiboRecursive(n-1) + fiboRecursive(n-2);
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Terim sayisi: ");
        int terim = scanner.nextInt();
        
        System.out.println(terim+".terimdeki eleman: "+fiboRecursive(terim-1));
        
        System.out.println(terim+". terime kadar olan fibonacci dizisi:");
        for(int i = 0 ; i < terim ; i++){
            System.out.print(fiboRecursive(i)+" ");
            
        }
        System.out.println();
        
    }
    
}