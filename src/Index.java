import java.util.Scanner;

public class Index extends Drawing{
public void index(){
    String wybor;
    Scanner odczyt = new Scanner(System.in);

    while(true){
        menu.mainMenu();
        wybor = odczyt.nextLine();
        switch(wybor) {
            case "1":
                up.upTree(height.treeHeight());
                break;
            case "2":
                down.downTree(height.treeHeight());
                break;
            case "3":
                right.rightTree(height.treeHeight());
                break;
            case "4":
                left.leftTree(height.treeHeight());
                break;
            case "5":
                superTree.superTree();
                break;
            case "9": System.exit(0);
            }
        }
    }
}