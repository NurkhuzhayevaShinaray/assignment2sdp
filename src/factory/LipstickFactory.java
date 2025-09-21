package factory;
import product.CosmeticProduct;
import product.Lipstick;

public class LipstickFactory implements CosmeticFactory{

    @Override
    public CosmeticProduct createProduct(String name, String shade,String brand) {
        return new Lipstick(name, shade,brand);
    }
}
