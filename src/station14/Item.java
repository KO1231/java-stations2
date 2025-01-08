public class Item {
    private final int id;
    private final String name;
    private final int stock;

    public Item(final int id, final String name, final int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    final String getDisplayText() {
        final String stockInfo = stock > 0 ? "In stock" : "Out of stock";
        return name + " (" + stockInfo + ")";
    }
}
