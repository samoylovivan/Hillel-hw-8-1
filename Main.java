package ivan.samoylov;

public class Main {

    public static void main(String[] args) {
       
        for(int i = 1; i < 30; i++){
            System.out.print(numFibonacci(i) + " ");
        }
    }

    public static int numFibonacci(int i) {
        if (i == 1) return 1;
        if (i == 2) return 1;
        return numFibonacci(i - 1) + numFibonacci(i - 2);
    }
}
