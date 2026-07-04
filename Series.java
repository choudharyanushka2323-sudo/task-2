public class Series {
    public static void main(String[] args) {
        int a = 0, b = 1, i = 0, c;
        System.out.println(a);
        System.out.println(b);

        while (i <= 10) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }
    }
}
