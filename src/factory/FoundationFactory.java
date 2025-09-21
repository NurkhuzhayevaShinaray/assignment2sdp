package factory;
import product.CosmeticProduct;
import product.Foundation;

public class FoundationFactory implements CosmeticFactory{

    @Override
    public CosmeticProduct createProduct(String name, String shade, String brand) {
        return new Foundation(name,shade,brand);
    }
}
