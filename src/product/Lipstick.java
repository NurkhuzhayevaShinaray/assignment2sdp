package product;

public class Lipstick implements CosmeticProduct{
    private final String name;
    private final String shade;
    private final String brand;

    public Lipstick(String name,String shade, String brand){
        this.name = name;
        this.shade = shade;
        this.brand = brand;
    }

    @Override
    public String getDetails() {
        return "Lipstick-" + shade + "," + name;
    }

    @Override
    public void apply() {
        System.out.println(brand +" " + getDetails());
    }
}
