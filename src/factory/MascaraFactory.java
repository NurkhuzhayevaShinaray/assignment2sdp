package factory;
import product.CosmeticProduct;
import product.Mascara;

public class MascaraFactory implements CosmeticFactory{

    public CosmeticProduct createProduct(String name, String shade, String brand) {
        return new Mascara(name, shade, brand);
    }
}
