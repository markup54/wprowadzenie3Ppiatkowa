import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj na losowaniu liczb");
        //komentarz jednoliniowy

        /*
        komentarz wieloliniowy
         */
        System.out.println("losowanie liczby całkowitej z zakresu od 1 do 100");
        int losowanaLiczba = (int) (Math.random() * 100 + 1);
        //Math.random() -losuje liczbę z zakresu<0,1)
        /*typy proste
        byte short int long - typy calkowite
        float double rzeczywiste
        boolean
        char
        rzutowanie rozszezrające - domyślnie
        rzutowanie zawężające np z double (int)
        */
        System.out.println("wylosowana liczba" + losowanaLiczba);
        System.out.println("Zgadnij liczbę");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();
        System.out.println("Wpisano liczbę" + wpisanaLiczba);
        if (losowanaLiczba == wpisanaLiczba) {
            System.out.println("Gratulacje");
        } else {
            int roznica = losowanaLiczba > wpisanaLiczba ? losowanaLiczba - wpisanaLiczba : wpisanaLiczba - losowanaLiczba;
            //dzielenie całkowite  jeżeli dzielimy liczby calkowite wynik jest całkowity
            roznica = roznica/10;
            System.out.println(
                    switch (roznica){
                        case 0 -> "Było bardzo blisko";
                        case 1 -> "Było blisko";
                        case 2 -> "Nie najgorzej";
                        default -> "Może innym razem";
                    }
            );


        }

    }
}