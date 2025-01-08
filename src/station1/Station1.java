import java.util.ArrayList;
import java.util.Arrays;

public class Station1 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう

    }

    public static ArrayList<String> q1() {
        // 問題1: ここから
        return new ArrayList<>(Arrays.asList("Tech", "Train"));
        // 問題1: ここまで
    }

    public static int q2(ArrayList<String> list, ArrayList<String> searchWords) {
        // 問題2: ここから
        return searchWords.stream()
            .filter(word -> list.contains(word))
            .toList()
            .size();
        // 問題2: ここまで
    }
}
