public class Main {
    public static void main(String[] args) {
        BmiService calc = new BmiService();
        double weight = 79.6;
        double height = 1.81;
//  weight - вес в килограммах
//  height - рост в метрах
        double bmi = calc.calculate(weight, height);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
