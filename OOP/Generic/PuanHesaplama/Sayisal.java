package OOP.Generic.PuanHesaplama;


public class Sayisal extends Aday{

    public Sayisal(int turkce, int matematik, int cografya, int kimya) {
        super(turkce, matematik, cografya, kimya);
    }

    @Override
    int puanHesapla() {
        return turkce*2+matematik*5+cografya*2+kimya*5;
    }
    
}
