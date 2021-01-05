package strategy;

public class Car implements Strategy {

    @Override
    public Double calculateCosts(Double kilometersTraveled) {
        final Double VALUE_KILOMETER_CAR = 1.5D;
        Double totalCost = kilometersTraveled * VALUE_KILOMETER_CAR;

        return totalCost;
    }

}
