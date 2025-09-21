package product;

public class Mascara implements CosmeticProduct {
    private final String name;
    private final String shade;

    public Mascara(String name, String shade){
        this.name = name;
        this.shade = shade;
    }

    @Override
    public String getDetails() {
        return "Mascara-" + shade + "," + name;
    }

    @Override
    public void apply() {
    }
}
