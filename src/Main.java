public class Main {
    public static void main(String[] args) {
      
        Fraction fac = new Fraction(10,5.8);
        fac.toString();
        System.out.print(fac + " = ");
        double res = fac.cal();
        System.out.println(res);
    }
}
