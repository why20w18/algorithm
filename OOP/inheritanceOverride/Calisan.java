package OOP.inheritanceOverride;

public class Calisan {

    protected String isim;
    protected String soyIsim;
    protected String adres;
    protected long telefonNo;
    
    public Calisan(String isim , String soyIsim , String adres , long telefonNo){
        
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.adres = adres;
        this.telefonNo = telefonNo;
    }
    
    public void showInfo(){
        System.out.println("Isim: "+isim
        +"\nSoyisim: "+soyIsim+"\n"
                + "Adres: "+adres+
                "\nTelefon No: "+telefonNo);
    }
}
