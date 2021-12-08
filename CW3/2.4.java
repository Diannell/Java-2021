import java.util.Scanner;

public class CW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m= sc.nextInt();
        System.out.println(Integer.toBinaryString(n) + " " + Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(n^1<<m));
    }
}
