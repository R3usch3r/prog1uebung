import java.util.Scanner;

public class pro1uebung {
    public static void main(String[] args) {
        System.out.println("hello world");
        blattAufgabe1();
    }

    public static void blattAufgabe1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zahl eingeben");
        int eingeleseneZahl = sc.nextInt();
        int restWert = eingeleseneZahl % 17;
        System.out.println("Der Rest bei Division durch 17 ist" +restWert);

        if (restWert == 13) {
            System.out.println("Pechkeks!");
        }

    }
}
