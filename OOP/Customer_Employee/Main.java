package OOP.Customer_Employee;


public class Main {
    
    public static void main(String[] args) {
        
        Customer musteri = new Customer();
        Employee calisan = new Employee();
        
        musteri.seteMail("test@test.com");
        musteri.indirimliUrunler();
        System.out.println("Musteri E-Mail: "+musteri.geteMail());
        
        System.out.println("-----------------");
        
        calisan.setMaas(12.000);
        calisan.setIsim("Ahmet");
        calisan.mesaiGunleri(calisan.getIsim());
        System.out.println("Calisanin Maasi: "+calisan.getMaas());
    }
    
}
