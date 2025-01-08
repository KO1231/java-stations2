public class Item {
    private final int id = -1;
    private final String name = null;
    private int stock;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int newStock) {
        this.stock = stock;
    }
}
