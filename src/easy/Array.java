package easy;

public class Array {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n+1; i++) {
            for (int j = 0; j <=n-i; j++) {
                System.out.print("j");
            }
            System.out.println("i");
        }
    }
}
