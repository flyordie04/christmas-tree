public class Down{
    private Branch branch = new Branch();
    public void downTree(int wysokosc){
        for (int i = 0; i < wysokosc; i++) {
            branch.spaces(i);
            branch.needle(wysokosc*2 - i*2 -1);
            System.out.println(" ");
        }
    }
}
