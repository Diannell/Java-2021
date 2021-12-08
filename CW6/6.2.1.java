public class CW6 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.matrix_random();
        matrix.print();
        matrix.sort_k("column", 2);
    }
}
