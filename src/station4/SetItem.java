import java.util.ArrayList;

public class SetItem extends Item{
    public ArrayList<Item> items = new ArrayList<Item>();
    public String getName(){
        return this.name + "(" + String.join(",", items.stream().map(Item::getName).toList()) + ")";
    }
}
