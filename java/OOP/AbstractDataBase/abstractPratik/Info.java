package OOP.AbstractDataBase.abstractPratik;


public abstract class Info {
    
    protected String isim;
    protected String sonCalistigiKonum;
    protected double maas;
    
    public Info(String isim , String sonCalistigiKonum , double maas){
        this.isim = isim;
        this.sonCalistigiKonum = sonCalistigiKonum;
        this.maas = maas;
    }
    
    abstract void showInfo();
    
    public void dusuncesi(){
        System.out.println("Sirket buyuk bir yukselis gosterdi , sevindim !");
    }
    
    
}
