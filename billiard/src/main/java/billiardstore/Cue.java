package billiardstore;

public class Cue extends BilliardItem{
    private int length;
    private int weight;

    public Cue(String idItem, String name, int price, int length, int weight) {
        super(idItem, name, price);
        this.length = length;
        this.weight = weight;
    }

    public final int getLength() {
        return length;
    }

    public final int getWeight() {
        return weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    void displayItem() {
        System.out.println("Cue");
        System.out.println("ID: " + getIdItem());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Length: " + getLength() + " cm");
        System.out.println("Weight: " + getWeight() + " gram");
    }
}
