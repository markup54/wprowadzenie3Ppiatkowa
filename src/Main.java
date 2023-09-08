import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj na losowaniu liczb");

        System.out.println("losowanie liczby całkowitej z zakresu od 1 do 100");
        int losowanaLiczba = (int) (Math.random() * 100 + 1);

        //System.out.println("wylosowana liczba" + losowanaLiczba);
        System.out.println("Zgadnij liczbę");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba;
        do {
            wpisanaLiczba = klawiatura.nextInt();
            System.out.println("Wpisano liczbę" + wpisanaLiczba);
            if (losowanaLiczba < wpisanaLiczba) {
                System.out.println("wpisano za dużo");
            } else {
                System.out.println("Wpisano za mało");
            }
        } while (wpisanaLiczba != losowanaLiczba);
        System.out.println("Gratulacje");

    }
}