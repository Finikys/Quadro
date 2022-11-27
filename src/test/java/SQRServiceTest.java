import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import ru.netology.sqr.quadro.services.SQRService;


public class SQRServiceTest {

    @Test
    public void testValidCount() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcBonus(200, 300);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void secondTestValidCount() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcBonus(200, 500);

        Assertions.assertEquals(expected, actual);


    }


}
