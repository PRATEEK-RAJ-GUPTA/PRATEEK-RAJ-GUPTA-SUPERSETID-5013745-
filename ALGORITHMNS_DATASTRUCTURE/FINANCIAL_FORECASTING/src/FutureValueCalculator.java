public class FutureValueCalculator {

    public static double calculateFutureValue(double initialValue, double growthRate, int periods) {
        if (periods == 0) {
            return initialValue;
        }
        
        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, periods - 1);
    }
    public static void main(String[] args) {
        double initialValue = 1000.0; 
        double growthRate = 0.05;     
        int periods = 5;              

        double futureValue = calculateFutureValue(initialValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods: $" + futureValue);
    }
}
