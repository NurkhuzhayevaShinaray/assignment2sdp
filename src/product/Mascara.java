package product;

public class Mascara implements CosmeticProduct {
    private final String name;
    private final String shade;
    private final String brand;

    public Mascara(String name, String shade, String brand){
        this.name = name;
        this.shade = shade;
        this.brand = brand;
    }

    @Override
    public String getDetails() {
        return "Mascara-" + shade + "," + name;
    }

    @Override
    public void apply() {
        System.out.println(brand + " " + getDetails());
    }
}
