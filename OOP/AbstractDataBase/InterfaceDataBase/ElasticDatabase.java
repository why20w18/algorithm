package OOP.AbstractDataBase.InterfaceDataBase;



public class ElasticDatabase implements IMusteriDatabaseSecim{

    @Override
    public void musteriEkle() {
        System.out.println("Musteri Eklendi Elastic");
    }

    @Override
    public void musteriCikart() {
        System.out.println("Musteri Cikartildi Elastic");
    }

    @Override
    public void musteriListele() {
        System.out.println("Musteri Listelendi Elastic");
    }


    
}
