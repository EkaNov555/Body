public class BmiService {
    public int calculate(double height, double weight) {
        double MassEffect = weight / (height * height);
        int result = (int) MassEffect;
        return result;
    }
}
