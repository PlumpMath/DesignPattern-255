package instance.product;

/**
 * @author zmz
 */
public class Div implements Operation{
    private double _numberA;
    private double _numberB;

    public void setNumber(double A, double B){
        this._numberA = A;
        this._numberB = B;
    }

    @Override
    public double GetResutl() {
        if(0==_numberB){
            System.out.println("除数不能为0");
            return 0;
        }else{
            return _numberA/_numberB;
        }
    }
}
