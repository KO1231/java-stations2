import java.util.ArrayList;
import java.util.Iterator;

public class Station10 {

    public static void q1(ArrayList<Integer> list) {
        // ここから
        final ArrayList<String> formatted = new ArrayList<String>();
        int maxSize = -1;
        for (int i : list) {
            String f = "%,d".formatted(i);
            formatted.add(f);
            if (f.length() > maxSize) {
                maxSize = f.length();
            }
        }

        final String format = "%" + maxSize + "s";
        formatted.forEach(f -> System.out.println(String.format(format, f)));
        // ここまで
    }
}
