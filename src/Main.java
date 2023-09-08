import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj na losowaniu liczb");

        System.out.println("losowanie 6 liczb całkowitej z zakresu od 1 do 100");
        int zmienna =10; //typ prosty, tylko zmienna
        Integer zmienna2 =20; //typ złozny wielka litera obiekt klasy Integer metody

        int wylosowaneLiczby[] = new int[6];
        for (int i = 0; i < wylosowaneLiczby.length; i++) {
            wylosowaneLiczby[i] = (int)(Math.random()*10+1);

        }
        for (int wartoscWylosowana:wylosowaneLiczby) {
            System.out.println(wartoscWylosowana);
        }




    }
}