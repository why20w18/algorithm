package OOP.hayvanOverrideInheritance;


public class Main {
    
    public static void main(String[] args) {
        
        Hayvan hayvan = new Hayvan("Hayvan","Yesil", "Irmak", "Hepcil", 4);
        hayvan.showInfo();
        hayvan.ses();
        
        System.out.println();
        
        //Inek
        Inek inek = new Inek("Inek","Beyaz", "Ciftlik", "Otcul", 4);
        inek.ses();
        
        System.out.println();
        
        //Tavuk
        //Tavuk tavuk = new Tavuk("Siyah", "Kumes", "Hepcil", 2, "Mor");
        Hayvan tavuk = new Tavuk("Tavuk","Siyah", "Kumes", "Hepcil", 2, "Mor");
        tavuk.showInfo();
        tavuk.ses();
        
        //Polimorfizm
        System.out.println("\n\n"+cokluHayvanGetir(hayvan));
        System.out.println(cokluHayvanGetir(inek));
        System.out.println(cokluHayvanGetir(tavuk));
        
    }
    
    public static String cokluHayvanGetir(Hayvan hayvan1){
        return hayvan1.getIsim();
    }
    
}
