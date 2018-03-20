import java.util.Scanner;

public class SuperTree {
private Branch branch = new Branch();
    public void superTree(){
        int wysokosc;
        Scanner odczyt = new Scanner(System.in);
        do {
            System.out.println("Wybierz ilość segmentów choinki (od 1 do 100)");
            while(!odczyt.hasNextInt()) {
                System.out.println("To nie jest liczba!");
                odczyt.next();
            }
            wysokosc = odczyt.nextInt();
        }while(wysokosc <= 0 || wysokosc > 100);
        drawTree(wysokosc);
    }

    private void drawTree(int wielkosc){
        for (int j = 0; j< wielkosc; j++) {
            for (int i = 0; i < 5; i++) {
                branch.spaces(5 - i - 1 - j + wielkosc - 1);
                branch.needle(i * 2 + 1 + 2*j);
                System.out.println("");
            }
        }
        for (int i=0;i<wielkosc/2;i++){
            branch.spaces(4);
            branch.needle(2*wielkosc - 1);
            System.out.println("");
        }
    }
}
