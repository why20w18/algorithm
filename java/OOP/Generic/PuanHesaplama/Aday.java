package OOP.Generic.PuanHesaplama;



public abstract class Aday {
    
    //default
     int turkce;
     int matematik;
     int cografya;
     int kimya;
    
    public Aday(int turkce , int matematik , int cografya , int kimya){
        this.turkce = turkce;
        this.cografya = cografya;
        this.matematik = matematik;
        this.kimya = kimya;
    }
    
    
   abstract int puanHesapla();
    
    
}
