package product;

public class Lipstick implements CosmeticProduct{
    private final String name;
    private final String shade;

    public Lipstick(String name,String shade){
        this.name = name;
        this.shade = shade;
    }

    @Override
    public String getDetails() {
        return "Lipstick-" + shade + "," + name;
    }

    @Override
    public void apply() {
    }
}
