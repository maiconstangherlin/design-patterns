package strategy;

public class TransportationToAirport {

    private Double kilometersTraveled;
    private Double totalCost;
    private Strategy meansTransporte;

    public TransportationToAirport(Strategy meansTransporte) {
        this.meansTransporte = meansTransporte;
    }

    public void calculateCosts() {
        totalCost = meansTransporte.calculateCosts(kilometersTraveled);
    }
}