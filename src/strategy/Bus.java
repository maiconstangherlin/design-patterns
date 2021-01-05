package strategy;

public class Bus implements Strategy {

    @Override
    public Double calculateCosts(Double kilometersTraveled) {
        final Double VALUE_KILOMETER_BUS = 0.9D;
        final Double FIXED_DISCOUNT = 0.1D;

        Double totalCost = kilometersTraveled * VALUE_KILOMETER_BUS * FIXED_DISCOUNT;
        return totalCost;
    }

}
