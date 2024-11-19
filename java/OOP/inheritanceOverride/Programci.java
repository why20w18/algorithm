package OOP.inheritanceOverride;

public class Programci extends Calisan {
    
    //Programcidan kalitilacak baska class olmayacak bu yuzden private olarak tanimliyorum
    private String bildigiProgramlamaDilleri;
    
    public Programci(String isim , String soyIsim , String adres , long telefonNo , String bildigiProgramlamaDilleri){
        super(isim, soyIsim, adres, telefonNo);
        this.bildigiProgramlamaDilleri = bildigiProgramlamaDilleri;
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Programcinin bildigi programlama dilleri: "+bildigiProgramlamaDilleri);
    }
    
    
}
