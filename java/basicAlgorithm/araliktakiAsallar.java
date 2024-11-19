package basicAlgorithm;
import java.util.Scanner;


public class araliktakiAsallar{
    
    public static void araliktaAra(int x , int y){
        
        int min = (x < y) ? x:y;
        int max = (x > y) ? x:y;
        
        for(int i = min ; i <= max ; i++){
            boolean asalFlag = true;
            
            if(i < 2){
                asalFlag = false;
            }
            else{
                
                for(int j = 2 ; j < i ; j++){
                    
                    if(i % j == 0){
                        asalFlag = false;
                        break;
                    }   
                }
            }
            if(asalFlag){
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Aralik girin:\n>");
        int x = scanner.nextInt();
        
        System.out.print(">");
        int y = scanner.nextInt();
        
        araliktaAra(x, y);
        
    }
    
}