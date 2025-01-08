import java.util.ArrayList;

public class SetItem implements Item{
    public String name;
    public ArrayList<SingleItem> items = new ArrayList<SingleItem>();
    public String getName(){
        return this.name + "(" + String.join(",", items.stream().map(Item::getName).toList()) + ")";
    }
}
