import java.util.*;

public class Gra {
    private ArrayList<Integer> wpisaneLiczby;
    private static HashSet<Integer> wylosowaneLiczby = new HashSet<>();
    private List<Integer> trafioneLiczby;

    private void wylosuj(){
        while(wylosowaneLiczby.size()<6) {
            wylosowaneLiczby.add((int)(Math.random()*100+1));
        }
    }

    private void wpiszZKlawiatury(){
        wpisaneLiczby = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Wstaw "+i+" liczbę");
            int liczba  = klawiatura.nextInt();
            while(wpisaneLiczby.contains(liczba)){
                System.out.println("Podaj inna liczbę");
                liczba = klawiatura.nextInt();
            }
            wpisaneLiczby.add(liczba);
        }
    }

    private void sprawdzTrafione(){
        trafioneLiczby = new LinkedList<>();
        for (Integer wpisanaLiczba:
                wpisaneLiczby) {
            if(wylosowaneLiczby.contains(wpisanaLiczba))
                trafioneLiczby.add(wpisanaLiczba);
        }
    }
    public void zagraj(){
        wylosuj();
        wpiszZKlawiatury();
        sprawdzTrafione();
        System.out.println("Wylosowane"+wylosowaneLiczby);
        System.out.println("Wpisane"+wpisaneLiczby);
        System.out.println("Trafione"+trafioneLiczby);
    }
}
