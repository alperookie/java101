import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        int mat,fizik,kimya,tarih,turkce;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        int toplam = (mat + fizik + kimya + tarih + turkce);
        double sonuc = toplam / 5;
        System.out.print("Ortalama: " + sonuc);
        String z = sonuc >= 60 ? " Geçti" : " Kaldı";
        System.out.print(z);

    }
}
