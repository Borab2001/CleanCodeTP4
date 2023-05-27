package pizza;

public class InParisDeliveryCalculator implements  DeliveryPlanCalculator{
    @Override
    public double priceFor(Pizza pizza) {
        return pizza.getPrice()*1.05;
    }
}
