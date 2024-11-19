package OOP.PolimorfizmNesneTutma;


public class Ogrenci extends Insan{
    
    int odevSayisi;

    public Ogrenci(int odevSayisi , int id , String isim , String soyIsim) {
        super(id, isim, soyIsim);
        this.odevSayisi = odevSayisi;
    }
    
    
    
}
