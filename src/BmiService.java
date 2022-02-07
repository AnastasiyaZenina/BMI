public class BmiService {
    public float calculate(float weight, float height) {
        float m = weight;
        float h = height * height;
        float BMI = m / (h / 10_000);
        return BMI;
    }
}
