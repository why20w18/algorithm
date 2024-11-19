package basicAlgorithm;

public class commandLineArguman{
    //java -jar commadLineArguments.jar isim , soyIsim , id ,okulAdi
      public static void main(String[] args) {
        int argSayisi = args.length;

        System.out.println("argc = " + argSayisi);

        for (int i = 0; i < argSayisi; i++) {
            System.out.print(args[i]+" ");
        }
    }
}
