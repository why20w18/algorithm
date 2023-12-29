package OOP.Customer_Employee;


public class Customer extends Person{
    /*
    private int id;
    private String isim;
    private String soyIsim;
    */
    private String eMail;

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
       public void indirimliUrunler(){
        System.out.println("Indirimli urun stokta yok");
    }
    

    
}
