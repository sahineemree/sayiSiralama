import java.util.*;
public class SayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a , b , c;

        System.out.print("1. sayı : ");
        a = input.nextInt();

        System.out.print("2. sayı : ");
        b = input.nextInt();

        System.out.print("3. sayı : ");
        c = input.nextInt();

        if ((a>b) && (a>c)) {
            if (b>c) {
                System.out.println("Sayı 1 > Sayı 2 > Sayı 3");

            } else {
                System.out.println("Sayı 1 > Sayı 3 > Sayı 2");

            }
        } else if ((b>a) && (b>c)){
            if (a>c) {
                System.out.println("Sayı 2 > Sayı 1 > Sayı 3");

            } else {
                System.out.println("Sayı 2 > Sayı 3 > Sayı 1");

            }

        } else if ((c>a) && (c>b)) {

            if (a>b) {
                System.out.println("Sayı 3 > Sayı 1 > Sayı 2");

            } else {
                System.out.println("Sayı 3 > Sayı 2 > Sayı 1");

            }
        }
    }
}