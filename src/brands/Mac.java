package brands;
import product.Foundation;
import product.Mascara;
import product.Lipstick;
import product.CosmeticProduct;

public class Mac implements CosmeticBrandFactory{
    private static final String BRAND = "Mac";

    @Override
    public CosmeticProduct createFoundation() {
        return new Foundation("Studio fix fluid","NC25");
    }
    @Override
    public CosmeticProduct createMascara() {
        return new Mascara("M·A·CStack","chestnut stack");
    }
    @Override
    public CosmeticProduct createLipstick() {
        return new Lipstick("M·A·Cximal Silky","mull it to the max");
    }
}
