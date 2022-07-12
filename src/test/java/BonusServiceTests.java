import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class BonusServiceTests {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/bonus_tests.csv")

    public void shouldCalculateBonuses(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}