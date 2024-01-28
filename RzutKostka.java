import java.util.Random;
import java.util.Scanner;

public class RzutKostka {
    public static void main(String[] args) {
        int iloscScian;
        int rzut;

        Scanner x= new Scanner(System.in);
        Random los = new Random();

        System.out.println("Ile ścianek ma Twoja kostka?");
        iloscScian = x.nextInt();

        rzut = los.nextInt(iloscScian) +1;
        System.out.println("Wylosowałeś liczbę:" +" "+ rzut);

    }
}
