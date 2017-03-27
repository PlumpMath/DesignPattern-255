package construct;

/**
 * @author zmz
 */
public class ConcreteBuilder1 implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.Add("部件1A");
    }

    @Override
    public void buildPartB() {
        product.Add("部件1B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
