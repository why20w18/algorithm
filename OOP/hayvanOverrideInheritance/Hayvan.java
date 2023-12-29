package OOP.hayvanOverrideInheritance;


public class Hayvan {

    protected String renk;
    protected String habitat;
    protected String beslenmeSekli;
    protected int ayakSayisi;
    protected String isim;
    
    public Hayvan(String isim,String renk , String habitat , String beslenmeSekli , int ayakSayisi){
        
        this.habitat = habitat;
        this.renk = renk;
        this.beslenmeSekli = beslenmeSekli;
        this.ayakSayisi = ayakSayisi;
        this.isim = isim;
    }
    
    public void showInfo(){
        System.out.println("Renk: "+renk
                            +"\nHabitat: "+habitat
                            +"\nBeslenme Sekli: "+beslenmeSekli+"\n"
                                    + "Ayak Sayisi: "+ayakSayisi+"\n"
                                            + "Isim: "+isim);
    }
    
    public void ses(){
        System.out.println("Hayvan Bagiriyor !");
    }

    public String getIsim() {
        return isim;
    }
}
