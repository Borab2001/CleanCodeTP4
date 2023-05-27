package pizza;

public class Main {
    public static void main(String[] args) {
        Pizza quattreFromages = new Pizza("Quattre Fromages", 11);

        DeliveryPlanFactory factory = new DeliveryPlanFactory();
        System.out.println("Prix de la livraison Quattre Fromages TO GO : "+factory.priceCalculatorFor(DeliveryPlan.TO_GO).priceFor(quattreFromages));
        System.out.println("Prix de la livraison Quattre Fromages IN PARIS : "+factory.priceCalculatorFor(DeliveryPlan.IN_PARIS).priceFor(quattreFromages));
        System.out.println("Prix de la livraison Quattre Fromages OUT PARIS : "+factory.priceCalculatorFor(DeliveryPlan.OUTSIDE_PARIS).priceFor(quattreFromages));

        Pizza chevreMiel = new Pizza("Chèvre Miel", 12.99);
        System.out.println("Prix de la livraison Chèvre Miel TO GO : "+DeliveryPlan02.TO_GO.getCost(chevreMiel));
        System.out.println("Prix de la livraison Chèvre Miel IN PARIS : "+DeliveryPlan02.IN_PARIS.getCost(chevreMiel));
        System.out.println("Prix de la livraison Chèvre Miel OUT PARIS : "+DeliveryPlan02.OUTSIDE_PARIS.getCost(chevreMiel));

        Pizza Regina = new Pizza("Regina", 11.5);
        System.out.println("Prix de la livraison Regina "+DeliveryPlan03.TO_GO.getLabel()+":"+DeliveryPlan03.TO_GO.getDeliveryPrice().apply(Regina));
        System.out.println("Prix de la livraison Regina "+DeliveryPlan03.IN_PARIS.getLabel()+":"+DeliveryPlan03.IN_PARIS.getDeliveryPrice().apply(Regina));
        System.out.println("Prix de la livraison Regina "+DeliveryPlan03.OUTSIDE_PARIS.getLabel()+":"+DeliveryPlan03.OUTSIDE_PARIS.getDeliveryPrice().apply(Regina));

    }
}
