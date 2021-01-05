package strategy;

public class TransportationToAirport {

    private Double kilometersTraveled;
    private Double totalCost;
    private MeansTransporte meansTransporte;

    public TransportationToAirport(MeansTransporte meansTransporte) {
        this.meansTransporte = meansTransporte;
    }

    public void calculateCosts() {

        if (meansTransporte.type.equals("CAR")) {
            final Double VALUE_KILOMETER_CAR = 1.5D;
            totalCost = kilometersTraveled * VALUE_KILOMETER_CAR;
        } else if (meansTransporte.type.equals("BUS")) {
            final Double VALUE_KILOMETER_BUS = 0.9D;
            final Double FIXED_DISCOUNT = 0.1D;

            totalCost = kilometersTraveled * VALUE_KILOMETER_BUS;
            totalCost *= FIXED_DISCOUNT;
        }

        // Other rules
    }
}