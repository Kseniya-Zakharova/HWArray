import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    public void shouldAmount() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.amount(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        assertEquals(expected, actual);
    }

    @Test
    public void avg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.avg(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.minSales(sales);
        long expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.maxSales(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void countHigherAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.countHigherAvg(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void countAboveAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.countAboveAvg(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
}

