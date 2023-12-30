package OOP.AbstractDataBase.InterfaceDataBase;


public class OracleDatabase implements IMusteriDatabaseSecim{

    @Override
    public void musteriEkle() {
        System.out.println("Musteri Eklendi Oracle");
    }

    @Override
    public void musteriCikart() {
        System.out.println("Musteri Cikartildi Oracle");
    }

    @Override
    public void musteriListele() {
        System.out.println("Musteri Listelendi Oracle");
    }

    
}
