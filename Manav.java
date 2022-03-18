import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int armutkg,elmakg,domateskg,muzkg,patlıcankg;
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95, patlıcan = 5.00;

        System.out.print("Kaç kilo armut ?: ");
        armutkg = input.nextInt();

        System.out.print("Kaç kilo elma ?: ");
        elmakg = input.nextInt();

        System.out.print("Kaç kilo domates ?: ");
        domateskg = input.nextInt();

        System.out.print("Kaç kilo muz ?: ");
        muzkg = input.nextInt();

        System.out.print("Kaç kilo patlıcan ?: ");
        patlıcankg = input.nextInt();

        double toplam = (armut * armutkg) + (elma * elmakg) + (domates * domateskg) + (muz * muzkg) + (patlıcan * patlıcankg);

        System.out.println("Toplam Tutar: " + toplam);
    }
}
