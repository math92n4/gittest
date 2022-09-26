import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hej Navid");

        System.out.println("Vi arbejder på at blive bedre til Git");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antallet af bogstaver i dit fornavn! ");
        int antalTalNavn = scanner.nextInt();

        System.out.println("Der er :" + antalTalNavn + "I dit navn! ");
    }
}
