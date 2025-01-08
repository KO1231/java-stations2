import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Station8 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう

    }

    public static HashSet<String> aggregateUserId(ArrayList<Order> orders) {
        // 問題1: ここから
        return orders.stream()
            .map(order -> order.userId)
            .collect(Collectors.toCollection(HashSet::new));
        // 問題1: ここまで
    }

    public static HashMap<String, Integer> aggregateUserAndTotalPrice(ArrayList<Order> orders) {
        // 問題2: ここから
        return new HashMap<>(
            orders.stream()
                .collect(Collectors.groupingBy(
                    order -> order.userId, 
                    Collectors.summingInt(order -> order.totalPrice)
                ))
        );
        // 問題2: ここまで
    }
}
