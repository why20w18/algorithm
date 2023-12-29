package OOP.hayvanOverrideInheritance;

public class Inek extends Hayvan{
    
    private String isim;
    
    public Inek(String isim,String renk , String habitat , String beslenmeSekli , int ayakSayisi){
        super(isim,renk, habitat, beslenmeSekli, ayakSayisi);
        this.isim = isim;
    }
    
    @Override
    public void ses(){
        System.out.println("Inek Moo");
    }

    public String getIsim() {
        return isim;
    }

}
