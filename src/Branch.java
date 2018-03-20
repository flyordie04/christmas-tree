public class Branch implements Chars{
    @Override
    public void spaces(int ilosc){
        for(int i=0;i<ilosc;i++){
            System.out.print(" ");
        }
    }
    @Override
    public void needle(int ilosc) {
        for (int k = 0; k < ilosc; k++) {
            System.out.print("X");
        }
    }
}
