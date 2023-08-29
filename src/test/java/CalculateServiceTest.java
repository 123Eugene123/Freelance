import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.CalculateService;

public class CalculateServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void restMonthService(int expected, int income, int expenses) {
        CalculateService service = new CalculateService();
        int actual = service.calculate(income, expenses);

        Assertions.assertEquals(expected, actual);
    }
}
