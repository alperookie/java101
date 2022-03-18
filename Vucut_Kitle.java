import java.util.Scanner;
public class Vucut_Kitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,indeks;
        int kilo;
        System.out.print("Boy: ");
        boy = input.nextDouble();

        System.out.print("Kilo: ");
        kilo = input.nextInt();

        indeks = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz:" + indeks);


    }
}
