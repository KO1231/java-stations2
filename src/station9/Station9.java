import java.util.ArrayList;
import java.util.Random;

public class Station9 {

    public static String printOrder(ArrayList<Item> itemList, Random random) {
        // ここから
        StringBuilder builder = new StringBuilder();
        
        int total = 0;
        for (Item item : itemList) {
            builder.append("%s %d円\r\n".formatted(item.name, item.price));
            total += item.price;
        }

        builder.append("合計 %d円\r\n".formatted(total));

        int rand = random.nextInt(100); // 0 ~ 99
        if(rand % 50 == 0) {
            builder.append("1等: 全額キャッシュバック");
        }else if(rand % 10 == 0) {
            builder.append("2等: 10%キャッシュバック");
        }
        
        return builder.toString();
        // ここまで
    }
}
