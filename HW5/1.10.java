import java.util.*;

public class HW5 {
    static Scanner sc = new Scanner(System.in);

    // 1.10
    static void task110(int[] array) {
        String pal = "", temp, s;

        for (int i : array) {
            s = Integer.toString(i);
            temp = new StringBuilder(s).reverse().toString();

            if (s.equals(temp)) {
                if (pal != "") {
                    System.out.println(s);
                    return;
                } else pal = s;
            }
        }

        System.out.println(pal);
    }

}