public class Right{

    private Branch branch = new Branch();

    public void rightTree(int wysokosc){

        for (int i = 0; i < wysokosc; i++) {
            branch.needle( i + 1);
            branch.spaces(wysokosc - i);
            System.out.println(" ");
        }
        for (int i = wysokosc; i >0; i--) {
            branch.needle( i - 1);
            branch.spaces(wysokosc + i);
            System.out.println(" ");
        }
    }
}
