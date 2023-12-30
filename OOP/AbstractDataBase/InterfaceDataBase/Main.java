package OOP.AbstractDataBase.InterfaceDataBase;


public class Main {
    
    public static void main(String[] args) {
        
        //interfaceden nesne uretilemez
        IMusteriDatabaseSecim seciminiz;
        
        seciminiz = new MysqlDatabase();
                //new ElasticDatabase();
                //new OracleDatabase();
        
        seciminiz.musteriEkle();
        seciminiz.musteriCikart();
        seciminiz.musteriListele();
        
        
    }
}
