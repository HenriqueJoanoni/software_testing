package TDD;

/**
 * Tickets for a charity run, which are sold online, cost €15 each.
 * A handling fee of €1.25 is added to the price of each ticket.
 * Runners can also choose to have a commemorative t-shirt which costs another €12.
 * T-shirts can be posted or collected.
 * Where t-shirts are posted, an additional cost of €3.95 is applied to the transaction.
 * Up to three tickets can be bought in each online transaction.
 * Where 2 tickets are bought a 5% discount applies to the transaction and where 3 tickets are bought a 10% discount applies.
 * Note however, the handling fee and the postage costs are fixed and do not receive any discount.
 * <p>
 * Using TFD write the tests and the calculateTicketCost method to return the cost of the tickets based on the user’s selections.
 */
public class CharityRunRickets {
    private static final double TICKET_PRICE = 15.00;
    private static final double HANDLING_FEE = 1.25;
    private static final double TSHIRT_PRICE = 12.00;
    private static final double POSTAGE_COST = 3.95;

    public static double TicketCost(int numberOfTickets, boolean wantsTShirt, boolean wantsPostage) {
        if (numberOfTickets < 1 || numberOfTickets > 3) {
            throw new IllegalArgumentException("Número de ingressos deve ser entre 1 e 3.");
        }

        double totalCost = 0.0;

        totalCost += numberOfTickets * TICKET_PRICE;

        totalCost += numberOfTickets * HANDLING_FEE;

        if (numberOfTickets == 2) {
            totalCost *= 0.95;
        } else if (numberOfTickets == 3) {
            totalCost *= 0.90;
        }

        if (wantsTShirt) {
            totalCost += TSHIRT_PRICE;
        }

        if (wantsPostage && wantsTShirt) {
            totalCost += POSTAGE_COST;
        }

        return totalCost;
    }

}
