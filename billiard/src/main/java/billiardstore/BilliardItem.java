package billiardstore;

abstract public class BilliardItem {
    private final String idItem;
    private String name;
    private int price;

    public BilliardItem(String idItem, String name, int price) {
        this.idItem = idItem;
        this.name = name;
        this.price = price;
    }

    public final String getIdItem() {
        return idItem;
    }

    public final String getName() {
        return name;
    }

    public final int getPrice() {
        return price;
    }

    abstract void displayItem();

    public final void setName(String name) {
        this.name = name;
    }

    public final void setPrice(int price) {
        this.price = price;
    }

}
