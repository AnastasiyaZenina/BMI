public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 57;
        float height = 163;
        float BMI = service.calculate(weight, height);
        System.out.println(" Индекс массы тела :" + BMI);
    }
}
