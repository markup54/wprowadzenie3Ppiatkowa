import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj na losowaniu liczb");

        System.out.println("losowanie 6 liczb całkowitej z zakresu od 1 do 100");
        int zmienna =10; //typ prosty, tylko zmienna
        Integer zmienna2 =20; //typ złozny wielka litera obiekt klasy Integer metody
/*
tablica musi mieć zdefiniowany rozmiar,
nie można go zmienić w trakcie działania programu
może przechowywać typy proste i złożone
elementy indeksowane mogą się powtarzać

kolekcje
nie deklarujemy rozmiaru, rozmiar kolekcji może się zmieniać w trakcie działania programu
listy List ArrayList, LinkedList
elementy indeksowane, każdy element ma swoje miejsce, elementy mogą się powtarzac
zbiory Set HashSet
zazwyczaj elementy nie sa indeksowane, elementy nie powtarzają się
słowniki Map para klucz wartosc
 */
        HashSet<Integer> wylosowaneLiczby = new HashSet<>();
        while(wylosowaneLiczby.size()<6) {
            wylosowaneLiczby.add((int)(Math.random()*10+1));

        }
        for (int wartoscWylosowana:wylosowaneLiczby) {
            System.out.println(wartoscWylosowana);
        }

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
        System.out.println("Wpisane liczby"+wpisaneLiczby);
        List<Integer> trafioneLiczby = new LinkedList<>();

        for (Integer wpisanaLiczba:
             wpisaneLiczby) {
            if(wylosowaneLiczby.contains(wpisanaLiczba))
                trafioneLiczby.add(wpisanaLiczba);
        }
        System.out.println("Odgadnięto "+trafioneLiczby);
        //TODO: wydzielić do metod losuj wstaw sprawdz
        //TODO: wydzielić do odzielnej klasy


    }
}