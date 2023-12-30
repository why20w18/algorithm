package OOP.AbstractDataBase.AbstractAlanHesaplama;


public class Main {
    
    public static void main(String[] args) {
        
        Kare kare1 = new Kare(8);
        Daire daire1 = new Daire(5);
        System.out.println("Karenin Alani: "+kare1.alanHesapla());
        System.out.println("Dairenin Alani: "+daire1.alanHesapla());
        
    }
}
