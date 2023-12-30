package OOP.AbstractDataBase.AbstractAlanHesaplama;


public abstract class geometrikSekil {

    protected String isim;
    
    public geometrikSekil(){
        
    }
    
    abstract double alanHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
}
