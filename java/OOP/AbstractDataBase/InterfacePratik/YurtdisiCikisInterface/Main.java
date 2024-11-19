package OOP.AbstractDataBase.InterfacePratik.YurtdisiCikisInterface;


public class Main {

    public static void main(String[] args) {
        
        Yolcu yolcu1 = new Yolcu();
        
        if(yolcu1.cikisYasagiKONTROL() == true &&
              yolcu1.harcUcretiKONTROL() == true &&
               yolcu1.vizeDurumuKONTROL() == true ){
               System.out.println("\nUcus Kontrolu Yapildi Cikis Yapabilirsiniz !");
        }
        else{
            System.out.println("Lutfen gerekli sartlari saglayin !");
        }
        
    }
    
}
