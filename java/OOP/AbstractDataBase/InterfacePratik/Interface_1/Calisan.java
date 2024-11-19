package OOP.AbstractDataBase.InterfacePratik.Interface_1;


public class Calisan {

     protected boolean askerlik,kaliciHastalik,adliSicil;
     protected String isim;
     protected int dilSayisi;
     
     public Calisan(boolean askerlik ,boolean kaliciHastalik , boolean adliSicil , String isim , int dilSayisi ){
         this.askerlik = askerlik;
         this.kaliciHastalik = kaliciHastalik;
         this.adliSicil = adliSicil;
         this.isim = isim;
         this.dilSayisi = dilSayisi;
     }
     
     void showInfo(){
         System.out.println("Isim:"+isim+"\n"
                 + "Bildigi Yabanci Dil Sayisi:"+dilSayisi+"\n"
                         + "Askerlik Durumu:"+askerlik+"\n"
                                 + "Adli Sicil Kaydi"+adliSicil+"\n"
                                         + "Kalici Hastlalik:"+kaliciHastalik);
     }
    
}
