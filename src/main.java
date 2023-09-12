public class main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        int index = service.calculate(height, weight);
        System.out.println(index);
    }
}
