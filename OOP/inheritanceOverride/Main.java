package OOP.inheritanceOverride;



public class Main {

    public static void main(String[] args) {
        
        Programci programci = new Programci("Linus", "Torvalds", "Fin"
                + "landiya", 1745625962, "C/C++ , x86 Assembly");
        
        programci.showInfo();
        System.out.println("-------------");
    
    //  Yonetici yonetici = new Yonetici(20, "Ken", "Thompson", "Turkiye", 541096);
        Calisan yonetici = new Yonetici(20, "Ken", "Thompson", "Turkiye", 541096);
        
        yonetici.showInfo();
    
    }
}
