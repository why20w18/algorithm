
package OOP.hayvanOverrideInheritance;

public class Tavuk extends Hayvan{
    
    private String gagaRenk;
    
    public Tavuk(String isim,String Renk , String Habitat , String beslenmeSekli , int ayakSayisi , String gagaRenk){
        super(isim,Renk, Habitat, beslenmeSekli, ayakSayisi);
        this.gagaRenk = gagaRenk;
    }
    
    @Override
    public void ses(){
        System.out.println("Tavuk gýtgýt gýdak !");
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Gaga Rengi: "+getGagaRenk());
    }
    
    public String getGagaRenk(){
        return gagaRenk;
    }

    public String getIsim() {
        return isim;
    }
    
}
