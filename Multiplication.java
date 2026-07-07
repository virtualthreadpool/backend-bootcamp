package CalcyEnhance;

public class Multiplication extends CalculatorEx{
    public Multiplication(double fno, double sno) {
        super(fno, sno);
    }
    void multiplication() {
        double result = getFno() * getSno();
        System.out.println("Multiplication Result = " + result);
    }
    @Override double calculate()
    {
        return 0;
    }

}
