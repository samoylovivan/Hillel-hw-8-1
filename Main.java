package ivan.samoylov;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibonacci(2));
        for(int i = 1; i < 30; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int i) {
        if (i == 1) return 1;
        if (i == 2) return 1;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }
}