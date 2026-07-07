package CalcyEnhance;

public abstract class CalculatorEx {
    private double fno;
    private double sno;

    public CalculatorEx(double fno, double sno) {
        this.fno = fno;
        this.sno = sno;
    }

    public double getFno() {
        return fno;
    }

    public void setFno(double fno) {
        this.fno = fno;
    }

    public double getSno() {
        return sno;
    }

    public void setSno(double sno) {
        this.sno = sno;
    }
    abstract double calculate();

}
