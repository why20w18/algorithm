package OOP.Generic.InnerClass;



public class DisClass {
    //default
    int sayi = 30;
    
    void ilkMetod(){
        int sayi = 20;
       
        class IcClass{ //lokal inner class
            int sayi = 10;
            
            public void sayiGoster(){
                
                System.out.println("ic class degeri: "+sayi);
                System.out.println("dis class degeri: "+DisClass.this.sayi);
                System.out.print("ilk metod degeri:");
            }
            
        }//Ic Class sonu
        
        IcClass lokalInner = new IcClass();
        lokalInner.sayiGoster();
        System.out.println(sayi);
        
    }//metod sonu
    
    //main metodu
    public static void main(String[] args) {
       DisClass disClass = new DisClass();
       disClass.ilkMetod();
        
    }
    
    
    
}//Dis Class sonu
