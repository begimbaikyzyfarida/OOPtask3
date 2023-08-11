public class Phone {
    private String brand;
    private String version;
    private String screen;
    private String memory;
    private String price;

    public Phone(String brand, String version, String screen) {
        this.brand = brand;
        this.version = version;
        this.screen = screen;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public String getScreen() {
        return screen;
    }
    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMemory() {
        return memory;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;

    }
}
