package OOP.inheritanceOverride.InheritanceBaseSubErisim;


class base{
    
    public void selamla(){
        System.out.println("Selamla BASE");
    }
    
}
class sub extends base{

    @Override
    public void selamla() {
        System.out.println("Selamla SUB");
    }
    
    public void subaOzelMetod(){
        System.out.println("Sub Ozel Metodudur !");
    }
    
    
}

public class inheritanceBaseSubaErisim {
        
    public static void main(String[] args) {
        
        base baseNesne = new base();
        sub subNesne = new sub();
        base poliNesne = new sub();
        
        baseNesne.selamla();
        subNesne.selamla();
        poliNesne.selamla();
        
        //poliNesne.subaOzelMetod(); //HATA VERÝR ERÝÞEMEZ
        subNesne.subaOzelMetod();
        ((sub)poliNesne).subaOzelMetod(); //CALISIR HATA VERMEZ & Polimorfizm Cast
        ((sub)baseNesne).subaOzelMetod(); //CALISMADI HATA VERDÝ
        
        
    }

}
