package basicAlgorithm;

import java.util.Scanner;

public class calculator {
    
    public static double hesaplayici(char sembol , int say1 , int say2){
        int sonuc = 0;
        double bolumSonuc = 0;
        switch(sembol){
            
            case '+':{
                sonuc = say1 + say2;
                break;
            }
            case '-':{
                sonuc = say1 - say2;
                break;
            }
            case '*':{
                sonuc = say1 * say2;
                break;
            }
            case '/':{      //Wrapper nesne donduru
                bolumSonuc = Double.valueOf(say1) / Double.valueOf(say2);
                return bolumSonuc;
            }
            default:{
                System.out.println("Geçersiz iþlem sembolü: " + sembol);
                break;
            }
              
        }
                                        //num classi
        return Double.valueOf(sonuc).intValue(); //double çevir ondalýk kýsmý at
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Tum semboller \"+ - * /\""
                + "\nSayilar tam sayi olmak zorundadir !\nYapmak istediginiz islem sembolu:");
        
        String islem = "";
        System.out.print("sembol:");
        islem = scanner.nextLine();
        char sembol = islem.charAt(0);
        
        
        System.out.print("ilk sayi:");
        int sayi1 = scanner.nextInt();        
 
        
        System.out.print("ikinci sayi:");
        int sayi2 = scanner.nextInt();
        
        if(sembol == '/' && sayi2 == 0){
            System.out.println("Sifira bolemezsin !");
        }
        else if(sembol == '/'){
            
        System.out.printf("\nGirilen Islem: %.1f %c %.1f = %.2f\n",Double.valueOf(sayi1),sembol,Double.valueOf(sayi2),hesaplayici(sembol, sayi1, sayi2));
        }
        else                                                //double ceviriyor
        System.out.printf("\nGirilen Islem: %d %c %d = %.0f\n",sayi1,sembol,sayi2,hesaplayici(sembol, sayi1, sayi2));

        
    }
    
}
