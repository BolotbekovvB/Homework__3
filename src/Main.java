public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.4, 7.5, -6.7, 8.4, -3.4, 6.7, -7.8, 6.4, -8.9, -0.8, -3.5, 8.5, -3.2, 6.1, 1.9};
        boolean negative = false;
        double sum = 0;
        int count = 0;

        for (  double number : numbers ) {
            if (negative && number > 0) {
                sum += number;
                count++;
            } else if (number < 0) {
                negative = true;
            }
        }
        double average = count > 0 ? sum / count : 0;
        System.out.println("Arith-Math "+ average);
    }

}
