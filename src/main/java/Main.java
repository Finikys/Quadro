import ru.netology.sqr.quadro.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int total = service.calcBonus(200, 300);
        System.out.println(total);


    }
}