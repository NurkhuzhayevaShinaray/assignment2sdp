package factory;

import product.CosmeticProduct;

public interface CosmeticFactory {
    CosmeticProduct createProduct(String name, String shade,String brand);
}
