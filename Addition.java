package CalcyEnhance;

public class Addition extends CalculatorEx{

    public Addition(double fno, double sno) {
        super(fno, sno);
    }

    void addition() {
        double result = getFno() + getSno();
        System.out.println("Addition Result = " + result);
    }
    @Override double calculate()
    {
        return 0;
    }
}


