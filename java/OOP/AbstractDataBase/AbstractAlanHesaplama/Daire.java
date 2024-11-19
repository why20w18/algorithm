package OOP.AbstractDataBase.AbstractAlanHesaplama;

public class Daire extends geometrikSekil{
    
    private double yariCap;
    
    public Daire(double r){
        yariCap = r;
    }
    
    @Override
    double alanHesapla() {
        return this.yariCap*yariCap*Math.PI;
    }
    
}
