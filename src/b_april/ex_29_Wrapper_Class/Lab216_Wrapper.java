package b_april.ex_29_Wrapper_Class;

public class Lab216_Wrapper {
    public static void main(String[] args) {

        Mobile.switchOnData();

        Mobile samsung = new Mobile("Samsung", "Galaxy S24 Ultra", 200000.899);
        Mobile realme = new Mobile("RealMe", "GT 6T", 30000.00);

        realme.setPrice(35000.99);

    }
}

class Mobile extends OldPhone {

    private String brand;
    private String model;
    private Double price;
    public static String serviceProvider = "Airtel";

    Mobile() {
        System.out.println("DC");
    }

    Mobile(String brand, String model, Double price) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    void display() {
        System.out.println(this.brand + this.model + this.price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    static void switchOnData() {
        System.out.println("Data turned on and the service provider is " + serviceProvider);
    }

    @Override
    void sendMessage()
    {
        System.out.println("Only sending Messages with images");
    }

    void changeFeature(String supportVideo)
    {
        System.out.println("Support video");
    }
    void changeFeature(int supportAudio)
    {
        System.out.println("Support video");
    }

}
class OldPhone implements SimCard
{
    void sendMessage()
    {
        System.out.println("Only sending Messages");
    }
    @Override
    public void enterCard()
    {
        System.out.println("Enter JIO Sim card");
    }
}

interface SimCard
{
    void enterCard();
}