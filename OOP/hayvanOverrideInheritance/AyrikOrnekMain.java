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
        System.out.println(isim+" Saldirdi !");
    }
    
}


public class AyrikOrnekMain {

    public static void main(String[] args) {
        
        Hayvan kopek1 = new Kopek("Maya");
        Hayvan kedi1 = new Kedi("Munni");
        Hayvan hayvan1 = new Hayvan("Badem");
        
        kopek1.konus();
        kedi1.konus();
        hayvan1.konus();
        
        ((Kopek)kopek1).saldir();
        
        
        
    }
        
}
