import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    Main testing = new Main();

    @Test
    void controlloStringaFormattata() {
        try {
            OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
            String result = testing.formattaData(data);
            assertEquals("01 marzo 2023", result);
        } catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }

    }
}