package entity;

public class TapAz extends Person{
    private int price;
    private boolean delivered;
    private boolean newproduct;
    private String location;
    private String brand;
    private String contact;

    public TapAz() {
    }

    public TapAz(String name, int id, int price, boolean delivered, boolean newproduct, String location, String brand, String contact) {
        super(name, id);
        this.price = price;
        this.delivered = delivered;
        this.newproduct = newproduct;
        this.location = location;
        this.brand = brand;
        this.contact = contact;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public boolean isNewproduct() {
        return newproduct;
    }

    public void setNewproduct(boolean newproduct) {
        this.newproduct = newproduct;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "TapAz{" +
                "price=" + price +
                ", delivered=" + delivered +
                ", newproduct=" + newproduct +
                ", location='" + location + '\'' +
                ", brand='" + brand + '\'' +
                ", contact=" + contact +
                "} " + super.toString();
    }
}
