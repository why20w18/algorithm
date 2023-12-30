package OOP.AbstractDataBase.InterfaceDataBase;


public class Main {
      private static IMusteriDatabaseSecim seciminiz;
      
    public static void main(String[] args) {
        
        //interfaceden nesne uretilemez
        
        //Seciminiz(new OracleDatabase());
        Seciminiz(new ElasticDatabase());
        //Seciminiz(new MysqlDatabase());
        
        seciminiz.musteriEkle();
        seciminiz.musteriCikart();
        seciminiz.musteriListele();
        
    }
    //unutulmayi engellemek icin
    public static void Seciminiz(IMusteriDatabaseSecim SecimNesnesi){
      seciminiz = SecimNesnesi;
    }
}
