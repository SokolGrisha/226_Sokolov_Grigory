import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestFileRead {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream("./1half/Laba9/src/Text.txt"), StandardCharsets.UTF_8));
        String text = "";
        while ((text = reader.readLine()) != null) {
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            String test = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(test + " " + test.equals("¿·‚"));
        }
    }
}
