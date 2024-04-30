public class RewardValue {
    private final double cashValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return convertToMiles(cashValue);
    }
}
