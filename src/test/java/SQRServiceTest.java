import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {


    @Test
    public void calculationTheNumberOfSquaresInGivenRange() {

        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.numberOfSquaresFallingWithinTheRange(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculationTheNumberOfSquaresWithoutRange() {

        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.numberOfSquaresFallingWithinTheRange(0, 0);

        Assertions.assertEquals(expected, actual);
    }
}
