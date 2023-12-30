package OOP.AbstractDataBase.abstractPratik;


public class Main {
    
    public static void main(String[] args) {
        
        MakineMuhendisi makine = new MakineMuhendisi("Cengiz", "Adana", 5400 , true);
        Yonetici yonetici = new Yonetici("Ahmet", "Istanbul", 9800, 56);
        BilgisayarMuhendisi programci = new BilgisayarMuhendisi("Mehmet", "Ankara", 7500, "Java");
        
        makine.showInfo();
        makine.dusuncesi();
 
        System.out.println();
        
        yonetici.showInfo();
        yonetici.dusuncesi();
        
        System.out.println();
        
        programci.showInfo();
        programci.dusuncesi();
        
 
    }
    
}
