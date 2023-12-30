package OOP.AbstractDataBase.AbstractAlanHesaplama;

public class Kare extends geometrikSekil{
    
    private double uzunluk;
    
    public Kare(double uzunluk){
        this.uzunluk = uzunluk;
    }
    
    @Override
    double alanHesapla() {
        return this.uzunluk*this.uzunluk;
    }
    
}
