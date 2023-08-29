import ru.netology.services.CalculateService;

public class Main {
    public static void main(String[] args) {
        CalculateService service = new CalculateService();
        int days = service.calculate(100_000, 60_000);
        System.out.println(days);

    }
}
