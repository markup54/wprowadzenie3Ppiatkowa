import java.util.HashSet;
import java.util.Scanner;

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




    }
}