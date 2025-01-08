import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Station11 {

    public static void q1(Path inputFile, Path outputFile) {
        // ここから
        final int data;
        try{
            data = Integer.parseInt(Files.readString(inputFile));
        } catch (IOException | NumberFormatException e) {
            System.out.println("読み込みに失敗しました");
            return;
        }

        try {
            Files.writeString(outputFile, String.valueOf(data * 2), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("書き込みに失敗しました");
        }
        // ここまで
    }
}
