package OOP.inheritanceGeometrikSekil;


public class Main {
    
    public static void main(String[] args) {
        
        Dikdortgen dikdortgen1 = new Dikdortgen(7, 8);
        Kare kare1 = new Kare(9);
        
        System.out.println("Dikdortgen Alan:"+
        dikdortgen1.alanHesapla()
                +"\nKare Alan:"+kare1.alanHesapla()
        );
        
        
    }
}
