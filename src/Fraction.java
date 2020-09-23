public class Fraction {
    private int num;
    private int denum;
    Fraction(int num, int denum){
        this.num = num;
        this.denum = denum;
    }

    public String toString(){
        return this.num + "/" + this.denum;
    }
}
