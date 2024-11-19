package OOP.inheritanceGeometrikSekil;



public class Kare extends Dikdortgen{
    
    
    public Kare(double uzunluk){
        super(uzunluk, uzunluk);
    }
    
    public double alanHesapla(){
        return super.alanHesapla();
    }

}
