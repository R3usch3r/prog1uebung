import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class pro1uebung {
    public static void main(String[] args) {
        System.out.println("hello world");
        //blatt1Aufgabe1();
       // blatt2Aufgabe1();
       // blatt2Aufgabe2();
       // blatt2Aufgabe3();
        //blatt3Aufgabe1();
        try {
            java2Aufgabe1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void blatt1Aufgabe1() {
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

    public static void blatt2Aufgabe3() {
        Scanner sc = new Scanner(System.in);
         System.out.println("Zahl eingeben");
         int n = sc.nextInt();

        System.out.println("ungerade zahlen");
         for(int i = 1;  i <=n*2; i=i+2) {
             System.out.println(i);
         }
        System.out.println("gerade quadratzahlen");
        for(int i = 1; i <= n; i++) {
            System.out.println(i*i);
        }
        System.out.println("zahlen durch 13");
        for(int i = 1; i <=n; i++) {
            System.out.println(i*13);
        }
        System.out.println("postivie rueackwearts");
        for(int i = n; i >=1; i--) {
             System.out.println(i);
         }
     }

     public static void blatt3Aufgabe1() {
        Scanner sc = new Scanner(System.in);
         System.out.println("Bitte String eingeben");
         String str = sc.nextLine();
         str = str.replace("a", " ");
         str = str.replace("e", " ");
         str = str.replace("i", " ");
         str = str.replace("o", " ");
         str = str.replace("u", " ");
         System.out.println(str);
     }

     public static void java2Aufgabe1() throws IOException {
         FileReader fr = new FileReader("C:\\Users\\JulianReuscher\\Desktop\\einpaarzahlen.txt");
         BufferedReader br = new BufferedReader(fr);
         String str;
         int summe = 0;
         int zahl;

         while (null != (str = br.readLine())) {
             zahl = Integer.parseInt(str);
             summe=+zahl;
         }
         System.out.println(summe);
         br.close();
     }
}
