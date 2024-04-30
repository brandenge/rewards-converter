public class RewardValue {
    private double value;
    private long miles;

    RewardValue(double value) {
        this.value = value;
    }

    RewardValue(long miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return this.value;
    }

    public double getMilesValue() {
        return getCashValue() / 0.0035;
    }
}
