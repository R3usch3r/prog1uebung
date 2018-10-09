import java.util.Scanner;

public class pro1uebung {
    public static void main(String[] args) {
        System.out.println("hello world");
        blatt2Aufgabe2();
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

    public static void blattAufgabe2() {
        //Kann nicht geloest werden
    }

    public static void blatt2Aufgabe1() {
        boolean z = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Booleanwert eingeben");
        boolean x = sc.nextBoolean();
        System.out.println("Booleanwert eingeben");
        boolean y = sc.nextBoolean();

        if((x==true) && (y == false)) {
            z = true;
        }
        if((x==false) && (y == true)) {
            z = true;
        }
        if((x == true) && (y == false)) {
            z = true;
        }
        if((x == true) && (y==true)) {
            z = false;
        }
        System.out.println(z);
     }

     public static void blatt2Aufgabe2() {
        Scanner sc = new Scanner(System.in);
         System.out.println("Zahl eingeben");
         int x = sc.nextInt();
         System.out.println("Zahl eingeben");
         int y = sc.nextInt();
         int summe = 0;

        if(x>0 || y>0) {
            summe = x + y;
            System.out.println(summe);
        }
        if(x<0 && y<0) {
            System.out.println(summe);
        }
     }

}
