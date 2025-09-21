package factory;
import product.CosmeticProduct;
import product.Foundation;

public class FoundationFactory implements CosmeticFactory{

    @Override
    public CosmeticProduct createProduct(String name, String shade) {
        return new Foundation(name,shade);
    }
}
