package OOP.AbstractDataBase.InterfaceDataBase;



public class MysqlDatabase implements IMusteriDatabaseSecim{

    @Override
    public void musteriEkle() {
        System.out.println("Musteri Eklendi MYSQL");
    }

    @Override
    public void musteriCikart() {
        System.out.println("Musteri Cikartildi MYSQL");
    }

    @Override
    public void musteriListele() {
        System.out.println("Musteri Listelendi MYSQL");
    }


    
}
