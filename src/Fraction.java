public class Fraction {
    private double num;
    private double denum;
    Fraction(double num, double denum){
        this.num = num;
        this.denum = denum;
    }

    public String toString(){
        return this.num + "/" + this.denum;
    }

    public double cal(){
    	return this.num / this.denum;
    }
}
