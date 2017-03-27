package construct;

/**
 * @author zmz
 */
public class ConcreteBuilder2 implements Builder{
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.Add("部件2A");
    }

    @Override
    public void buildPartB() {
        product.Add("部件2B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
