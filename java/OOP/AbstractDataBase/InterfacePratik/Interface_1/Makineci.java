package OOP.AbstractDataBase.InterfacePratik.Interface_1;


public class Makineci extends Calisan implements IMuhendis{
    
    private double gpa;
    
    public Makineci(boolean askerlik, boolean kaliciHastalik, boolean adliSicil
            , String isim, int dilSayisi , double gpa) {
        super(askerlik, kaliciHastalik, adliSicil, isim, dilSayisi);
        this.gpa = gpa;
    }

    @Override
    public void sicilKaydi() {
        
         if(adliSicil){
           System.out.println("Adli sicil kaydi var !");
       }
       else
            System.out.println("Adli sicil kaydi yok !");
        
    }

    @Override
    public void kaliciHastalik() {
          if(kaliciHastalik){
            System.out.println("Kalici hastalik var !");
        }
        else
            System.out.println("Kalici hastalik yok !");

        
    }

    @Override
    public void askerlik() {
         if(askerlik){
            System.out.println("Askerligi yapmis !");
        }
        else
            System.out.println("Askerligi yapmadi !");
        
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("GPA:"+gpa);
    }

   
}
