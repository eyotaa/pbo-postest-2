package billiardstore;

public class Glove extends BilliardItem{
    private String size;
    private String color;

    public Glove(String idItem, String name, int price, String size, String color) {
        super(idItem, name, price);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void displayItem() {
        System.out.println("Glove");
        System.out.println("ID: " + getIdItem());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Size: " + getSize());
        System.out.println("Color: " + getColor());
    }
}
