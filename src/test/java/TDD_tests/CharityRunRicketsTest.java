package TDD_tests;

import TDD.CharityRunRickets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharityRunRicketsTest {

    @Test
    public void testSingleTicketWithoutTShirtAndWithoutPostage() {
        assertEquals(16.25, CharityRunRickets.TicketCost(1, false, false));
    }

    @Test
    public void testSingleTicketWithTShirtAndWithoutPostage() {
        assertEquals(28.25, CharityRunRickets.TicketCost(1, true, false));
    }

    @Test
    public void testSingleTicketWithTShirtAndWithPostage() {
        assertEquals(32.20, CharityRunRickets.TicketCost(1, true, true));
    }

    @Test
    public void testTwoTicketsWithoutTShirtAndWithoutPostage() {
        assertEquals(30.875, CharityRunRickets.TicketCost(2, false, false));
    }

    @Test
    public void testTwoTicketsWithTShirtAndWithoutPostage() {
        assertEquals(42.875, CharityRunRickets.TicketCost(2, true, false));
    }

    @Test
    public void testTwoTicketsWithTShirtAndWithPostage() {
        assertEquals(46.825, CharityRunRickets.TicketCost(2, true, true));
    }

    @Test
    public void testThreeTicketsWithoutTShirtAndWithoutPostage() {
        assertEquals(43.875, CharityRunRickets.TicketCost(3, false, false));
    }

    @Test
    public void testThreeTicketsWithTShirtAndWithoutPostage() {
        assertEquals(55.875, CharityRunRickets.TicketCost(3, true, false));
    }

    @Test
    public void testThreeTicketsWithTShirtAndWithPostage() {
        assertEquals(59.825, CharityRunRickets.TicketCost(3, true, true));
    }
}