package product;

public class Foundation implements CosmeticProduct {
    private final String name;
    private final String shade;

    public Foundation(String name, String shade) {
        this.name = name;
        this.shade = shade;
    }

    @Override
    public String getDetails() {
        return "Foundation-" + shade + "," +name;
    }
    @Override
    public void apply() {
    }
}
