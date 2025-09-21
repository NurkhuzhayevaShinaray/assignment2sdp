import brands.CosmeticBrandFactory;
import brands.Mac;
import product.CosmeticProduct;

public class Main {
    public static void main(String[] args) {
        CosmeticBrandFactory macFactory = new Mac();

        CosmeticProduct foundation = macFactory.createFoundation();
        CosmeticProduct mascara = macFactory.createMascara();
        CosmeticProduct lipstick = macFactory.createLipstick();

        foundation.apply();
        mascara.apply();
        lipstick.apply();

        System.out.println(foundation.getDetails());
        System.out.println(mascara.getDetails());
        System.out.println(lipstick.getDetails());
    }
}