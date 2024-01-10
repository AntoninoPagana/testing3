import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void controlloStringaFormattata() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String actual = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        String expected = "01 marzo 2023";
        assertEquals(expected, actual);
    }
}