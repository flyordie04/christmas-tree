public class Left {
    private Branch branch = new Branch();
    public void leftTree(int wysokosc){

        for (int i = 0; i < wysokosc; i++) {
            branch.spaces( wysokosc - 1 - i);
            branch.needle(i + 1);
            System.out.println(" ");
        }
        for (int i = wysokosc; i >0; i--) {
            branch.spaces( wysokosc - i + 1 );
            branch.needle(i - 1);
            System.out.println(" ");
        }
    }
}
