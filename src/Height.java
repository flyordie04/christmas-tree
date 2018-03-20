import java.util.Scanner;

public class Height {
    public int treeHeight(){

        int wysokosc;
        Scanner odczyt = new Scanner(System.in);
        do {
            System.out.println("Wybierz wysokość choinki (od 1 do 100)");
            while(!odczyt.hasNextInt()) {
                System.out.println("To nie jest liczba!");
                odczyt.next();
            }
            wysokosc = odczyt.nextInt();
        }while(wysokosc <= 0 || wysokosc > 100);

     return wysokosc;
    }

}
