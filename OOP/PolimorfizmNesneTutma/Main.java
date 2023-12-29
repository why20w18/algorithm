package OOP.PolimorfizmNesneTutma;


public class Main {
    
    public static void main(String[] args) {
            
        Mudur mudur1 = new Mudur(3, 1, "Guner", "Gunmez");
        
        Ogretmen ogretmen1 = new Ogretmen(2, "Harun", "Efe");
        Ogretmen ogretmen2 = new Ogretmen(3, "Ahmet", "Ali");
        Ogretmen ogretmen3 = new Ogretmen(4, "Hakki", "Can");
        
        
        Ogrenci ogrenci1 = new Ogrenci(41, 5, "Omer", "Faruk");
        
        Insan[] insan = {mudur1,ogretmen1,ogretmen2,ogretmen3,ogrenci1};
        
        for(Insan x : insan){
            System.out.println(x.getId()+" "+x.getIsim()+" "+x.getSoyIsim());
        }

        System.out.println("Mudurun Yonettigi Ogretmenler: "+((Mudur)insan[0]).getYonettigiOgretmenler());
        System.out.println("Mudurun Yonettigi Ogretmenler: "+mudur1.getYonettigiOgretmenler());
        
    }
    
}
