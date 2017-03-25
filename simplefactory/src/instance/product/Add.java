package instance.product;

/**
 * @author zmz
 */
public class Add implements Operation {
    private double _numberA;
    private double _numberB;

    public void setNumber(double A, double B){
        this._numberA = A;
        this._numberB = B;
    }

    @Override
    public double GetResutl() {
        return _numberA+_numberB;
    }
}
