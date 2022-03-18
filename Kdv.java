import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double kdv,kdvsiz_fiyat,kdv_tutari,kdvli_fiyat;
        Scanner input = new Scanner(System.in);

        System.out.print("Ödediğiniz ücret: ");
        kdvsiz_fiyat = input.nextDouble();
        if (kdvsiz_fiyat > 0 && kdvsiz_fiyat < 1000) {
            kdv = 0.18;
            kdv_tutari = kdvsiz_fiyat * kdv;
            kdvli_fiyat = kdvsiz_fiyat + kdv_tutari;

            System.out.println("KDV'li Fiyat: " + kdvli_fiyat);
            System.out.println("KDV'siz Fiyat: " + kdvsiz_fiyat);
            System.out.println("KDV Tutarı: " + kdv_tutari);

        }else if (kdvsiz_fiyat > 1000) {
            kdv = 0.08;
            kdv_tutari = kdvsiz_fiyat * kdv;
            kdvli_fiyat = kdvsiz_fiyat + kdv_tutari;

            System.out.println("KDV'li Fiyat: " + kdvli_fiyat);
            System.out.println("KDV'siz Fiyat: " + kdvsiz_fiyat);
            System.out.println("KDV Tutarı: " + kdv_tutari);
        }





    }
}
