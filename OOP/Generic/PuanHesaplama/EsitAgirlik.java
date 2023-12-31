package OOP.Generic.PuanHesaplama;


public class EsitAgirlik extends Aday{

    public EsitAgirlik(int turkce, int matematik, int cografya, int kimya) {
        super(turkce, matematik, cografya, kimya);
    }

    @Override
    int puanHesapla() {
     return turkce*5+matematik*2+cografya*5+kimya*2;
    }


    
}
