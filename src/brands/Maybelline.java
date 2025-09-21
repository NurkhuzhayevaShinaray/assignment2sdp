package brands;
import product.CosmeticProduct;
import product.Foundation;
import product.Mascara;
import product.Lipstick;

public class Maybelline implements CosmeticBrandFactory{
    private static final String BRAND = "Maybelline";

    @Override
    public CosmeticProduct createFoundation() {
        return new Foundation("Fit ME","105","Maybelline");
    }
    @Override
    public CosmeticProduct createMascara() {
        return new Mascara("Lash Sensational Sky High","plum twirlight","Maybelline");
    }
    @Override
    public CosmeticProduct createLipstick() {
        return new Lipstick("Super Stay Matte Ink","charmer","Maybelline");
    }
}
