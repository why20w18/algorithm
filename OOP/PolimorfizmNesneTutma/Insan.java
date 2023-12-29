package OOP.PolimorfizmNesneTutma;


public class Insan {
    
    int id;
    String isim;
    String soyIsim;

    public Insan(int id, String isim, String soyIsim) {
        this.id = id;
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }
    
}
