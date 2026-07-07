package CalcyEnhance;

public class Division extends CalculatorEx{

    public Division(double fno, double sno) {
        super(fno, sno);
    }
    void division() {
        double result = getFno() / getSno();
        System.out.println("Addition Result = " + result);
    }
    @Override double calculate()
    {
        return 0;
    }

}
