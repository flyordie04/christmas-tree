public class Up {

    private Branch branch = new Branch();

    public void upTree(int wysokosc) {

        for (int i = 0; i < wysokosc; i++) {
            branch.spaces(wysokosc - i - 1);
            branch.needle(i * 2 + 1);
            System.out.println(" ");
        }
    }
}

