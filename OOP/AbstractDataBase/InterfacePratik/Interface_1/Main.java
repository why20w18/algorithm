package OOP.AbstractDataBase.InterfacePratik.Interface_1;

public class Main {
    
    public static void main(String[] args) {
        
        IMuhendis programci = new Programci(true, true, true, "Bugra", 2, "Java");
        Calisan makineci = new Makineci(false, false, true, "Ahmet", 3, 2.75);
        
        
        ((Programci)programci).showInfo();
        System.out.println();
        makineci.showInfo();
    }
    
}
