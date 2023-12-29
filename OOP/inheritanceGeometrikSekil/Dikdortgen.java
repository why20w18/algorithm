package OOP.inheritanceGeometrikSekil;



public class Dikdortgen extends Sekiller{

    private double uzunluk;
    private double genislik;
    
    public Dikdortgen(double genislik , double uzunluk){
        super(genislik*uzunluk);
        
        this.uzunluk = uzunluk;
        this.genislik = genislik;
        
    }
        
}
