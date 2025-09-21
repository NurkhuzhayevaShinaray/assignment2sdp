package factory;
import product.CosmeticProduct;
import product.Mascara;

public class MascaraFactory implements CosmeticFactory{

    public CosmeticProduct createProduct(String name, String shade) {
        return new Mascara(name, shade);
    }
}
