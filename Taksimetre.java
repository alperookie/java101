import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int yol,acilis = 10;
        double km_ucreti = 2.20,tutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç km yol gittiniz: ");
        yol = input.nextInt();
        tutar = acilis + (yol*km_ucreti);

        if (tutar <= 20)
            System.out.println("Ücret: 20Tl'dir" );
        else if (tutar > 20)
            System.out.println("Ücret: " + tutar + "Tl'dir");
    }
}
