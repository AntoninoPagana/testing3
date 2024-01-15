import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    }

    public String formattaData(OffsetDateTime data) throws Exception {
        if (data != null) {
            String dataFormattata = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
            return dataFormattata;
        } else {
            throw new Exception();
        }
    }
}
