package brands;

import product.CosmeticProduct;

public interface CosmeticBrandFactory {

    CosmeticProduct createFoundation();
    CosmeticProduct createMascara();
    CosmeticProduct createLipstick();
}
