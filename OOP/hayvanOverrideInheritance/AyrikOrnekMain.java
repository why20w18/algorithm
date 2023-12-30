package OOP.hayvanOverrideInheritance;

class Hayvan{
    
    protected String isim;
    
    public Hayvan(String isim){
        this.isim = isim;
    }
    
    public void konus(){
        System.out.println(isim+" Konusuyor !(Hayvan)");
    }
}

class Kedi extends Hayvan{
    
    public Kedi(String isim){
        super(isim);
    }
    
    @Override
    public void konus(){
        System.out.println(isim+" Konusuyor !(Kedi)");
    }
    
}

class Kopek extends Hayvan{
    
    public Kopek(String isim){
        super(isim);
    }
    
    @Override
    public void konus(){
        System.out.println(isim+" Konusuyor !(Kopek)");
    }
    
    public void saldir(){
        System.out.println("Kopek Saldirdi !");
    }
    
}


public class AyrikOrnekMain {

    public static void main(String[] args) {
        
        cokluKonustur(new Kopek("Maya"));
        cokluKonustur(new Kedi("Munni"));
        cokluKonustur(new Hayvan("Badem"));
        
    }
    
    public static void cokluKonustur(Object object){
        
        if(object instanceof Hayvan){
            Hayvan hayvan = (Hayvan)object;
            hayvan.konus();
        }
        else if(object instanceof Kedi){
            Kedi kedi = (Kedi)object;
            kedi.konus();
        }
        else if(object instanceof Kopek){
            Kopek kopek = (Kopek)object;
            kopek.konus();
        }
        
    }
        
}
