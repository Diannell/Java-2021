public class CW3 {
    public static void main(String[] args){
        byte a = 7;
        System.out.println(Integer.toBinaryString(a));
        a = (byte) (a>>1);
        System.out.println(Integer.toBinaryString(a));
        a = (byte) (a>>1);
        System.out.println(Integer.toBinaryString(a));
        a = (byte) (a>>1);
        System.out.println(Integer.toBinaryString(a));
    }
}
