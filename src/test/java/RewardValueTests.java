import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class RewardValueTests {
    static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;;

    final double cashValue = 100;
    final int miles = 10000;
    RewardValue rewardValueWithCash;
    RewardValue rewardValueWithMiles;

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
        rewardValueWithCash = new RewardValue(cashValue);
        rewardValueWithMiles = new RewardValue(miles);
    }

    @Test
    void create_with_cash_value() {
        assertEquals(cashValue, rewardValueWithCash.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        assertEquals(miles, rewardValueWithMiles.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        assertEquals((int) (cashValue / MILES_TO_CASH_CONVERSION_RATE), rewardValueWithCash.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        assertEquals(miles * MILES_TO_CASH_CONVERSION_RATE, rewardValueWithMiles.getCashValue());
    }
}
