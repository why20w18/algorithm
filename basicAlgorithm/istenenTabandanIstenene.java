package basicAlgorithm;
import java.util.Scanner;

public class istenenTabandanIstenene {
    public static int girilenSayiToDecimal(String sayi, int girilenTaban) {
        int decimal = 0;
        for (int i = 0; i < sayi.length(); i++) {
            int basamakDegeri = Character.getNumericValue(sayi.charAt(sayi.length() - 1 - i));
            decimal += basamakDegeri * Math.pow(girilenTaban, i);
        }
        return decimal;
    }

    public static String decimaldenHedefTabanCevir(int hedefTaban, int girilenTaban, String sayi) {
        int decimalDeger = girilenSayiToDecimal(sayi, girilenTaban);
        StringBuilder sb = new StringBuilder();

        while (decimalDeger > 0) {
            int kalan = decimalDeger % hedefTaban;
            sb.insert(0, kalan);
            decimalDeger /= hedefTaban;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(decimaldenHedefTabanCevir(2, 5, "3142"));
        
        
    
    }
}
