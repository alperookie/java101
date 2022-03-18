import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        int a,b,c,u,cevre;
        double alan;
        Scanner input = new Scanner(System.in);

        System.out.println("İlk kenar:");
        a = input.nextInt();

        System.out.println("İkinci kenar:");
        b = input.nextInt();

        System.out.println("Üçüncü kenar:");
        c= input.nextInt();

        u = (a+b+c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Alan: " + alan);


    }
}
