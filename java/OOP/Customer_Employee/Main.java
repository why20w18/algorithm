package OOP.Customer_Employee;


public class Main {
    
    public static void main(String[] args) {
        
        Customer musteri = new Customer();
        Employee calisan = new Employee();
        
        CustomerManager musteriYonetimi = new CustomerManager();
        EmployeeManager calisanYonetimi = new EmployeeManager();
        //---------------
        musteri.seteMail("test@test.com");
        musteriYonetimi.indirimliUrunler();

        System.out.println("Musteri E-Mail: "+musteri.geteMail());
        musteriYonetimi.ekle();
        musteriYonetimi.cikart();
        
        
        System.out.println("-----------------");
        
        calisan.setMaas(12.000);
        calisan.setIsim("Ahmet");
        
        calisanYonetimi.mesaiGunleri(calisan.getIsim());
        System.out.println("Calisanin Maasi: "+calisan.getMaas());
        calisanYonetimi.ekle();
        calisanYonetimi.cikart();
    
    
    }
    
}
