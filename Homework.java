public class Homework {
    public static void main(String[] args) {
        int a = 365;
        a = a / 100;
        System.out.println(a);

        int q = 365;
        q = (q % 100) / 10;
        System.out.println(q);

        int w = 365;
        w = w % 10;
        System.out.println(w);

    }
}
