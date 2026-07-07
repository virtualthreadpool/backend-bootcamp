package CalcyEnhance;

public class Subtraction extends CalculatorEx{
    public Subtraction(double fno, double sno) {
        super(fno, sno);
    }

    @Override
    double calculate() {
        return 0;
    }

    void subtraction() {
        double result = getFno() - getSno();
        System.out.println("Subtraction Result = " + result);
    }



    }

