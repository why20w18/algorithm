package OOP.PolimorfizmNesneTutma;


public class Mudur extends Insan{

    int yonettigiOgretmenler;

    public Mudur(int yonettigiOgretmenler, int id, String isim, String soyIsim) {
        super(id, isim, soyIsim);
        this.yonettigiOgretmenler = yonettigiOgretmenler;
    }

    public int getYonettigiOgretmenler() {
        return yonettigiOgretmenler;
    }

    public void setYonettigiOgretmenler(int yonettigiOgretmenler) {
        this.yonettigiOgretmenler = yonettigiOgretmenler;
    }
    
    
}
