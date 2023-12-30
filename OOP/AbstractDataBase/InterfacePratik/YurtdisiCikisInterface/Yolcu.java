package OOP.AbstractDataBase.InterfacePratik.YurtdisiCikisInterface;
import java.util.Scanner;

public class Yolcu implements YurtdisiCikisKurallari{
    
    private boolean vizeDurumu;
    private double harcUcreti;
    private boolean cikisYasakDurumu;
    
    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Odediginiz Harc Miktari:");
        this.harcUcreti = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Vize Durumunuz:");
        String cevap1 = scanner.nextLine();
        this.vizeDurumu = (cevap1.equals("iyi")) ? true : false;
        
        System.out.print("Cikis Yasaginiz Var mi:");
        String cevap2 = scanner.nextLine();
        this.cikisYasakDurumu = (cevap1.equals("evet")) ? false : true;
    }
    
    @Override
    public boolean vizeDurumuKONTROL() {
    return this.vizeDurumu;    
    }

    @Override
    public boolean cikisYasagiKONTROL() {
    return this.cikisYasakDurumu;
    }

    @Override
    public boolean harcUcretiKONTROL() {
    boolean sonuc = (this.harcUcreti <= 100) ? false : true;
    return sonuc;
    }

   
    
}
