import java.util.*;

public class Main {
    private static HashSet<Integer> wylosuj(){
        HashSet<Integer> wylosowaneLiczby = new HashSet<>();
        while(wylosowaneLiczby.size()<6) {
            wylosowaneLiczby.add((int)(Math.random()*10+1));
        }
        return wylosowaneLiczby;
    }
    private static ArrayList<Integer> wpiszZKlawiatury(){
        ArrayList<Integer> wpisaneLiczby = new ArrayList<>();
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
        return wpisaneLiczby;
    }
    private static List<Integer> sprawdzTrafione(HashSet<Integer> wylosowaneLiczby, ArrayList<Integer> wpisaneLiczby ){
        List<Integer> trafioneLiczby = new LinkedList<>();
        for (Integer wpisanaLiczba:
                wpisaneLiczby) {
            if(wylosowaneLiczby.contains(wpisanaLiczba))
                trafioneLiczby.add(wpisanaLiczba);
        }
        return trafioneLiczby;
    }
    public static void main(String[] args) {
        System.out.println("Witaj na losowaniu liczb");
        System.out.println("losowanie 6 liczb całkowitej z zakresu od 1 do 100");
        HashSet <Integer>wylosowaneLiczby = wylosuj();
        for (int wartoscWylosowana:wylosowaneLiczby) {
            System.out.println(wartoscWylosowana);
        }

        ArrayList<Integer> wpisaneLiczby =wpiszZKlawiatury();
        System.out.println("Wpisane liczby"+wpisaneLiczby);
        List<Integer> trafioneLiczby = sprawdzTrafione(wylosowaneLiczby,wpisaneLiczby);
        System.out.println("Odgadnięto "+trafioneLiczby);

        //TODO: wydzielić do odzielnej klasy


    }
}