import java.util.Random;
import java.util.Scanner;

public class OdgadnijLiczbe {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int wylosowanaLiczba = random.nextInt(101); // Losowa liczba od 0 do 100
            int zgadywanaLiczba;
            int liczbaProb = 0;

            System.out.println("Komputer wylosował liczbę w zakresie od 0 do 100. Zgadnij ją!");

            do {
                System.out.print("Podaj swoją propozycję: ");
                zgadywanaLiczba = scanner.nextInt();
                liczbaProb++;

                if (zgadywanaLiczba < wylosowanaLiczba) {
                    System.out.println("Za mało. Spróbuj ponownie!");
                } else if (zgadywanaLiczba > wylosowanaLiczba) {
                    System.out.println("Za dużo. Spróbuj ponownie!");
                } else {
                    System.out.println("Brawo! Zgadłeś liczbę " + wylosowanaLiczba + " w " + liczbaProb + " próbach.");
                }
            } while (zgadywanaLiczba != wylosowanaLiczba);

            scanner.close();
        }
    }


