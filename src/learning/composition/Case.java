package learning.composition;

public class Case {

    private String model;
    private String manufacturer;
    private String powelSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powelSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powelSupply = powelSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowelSupply() {
        return powelSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
