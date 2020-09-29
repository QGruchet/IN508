public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Fraction fac = new Fraction(10,5.8);
        fac.toString();
        System.out.println(fac);
        double res = fac.cal();
        System.out.println(res);
    }
}
