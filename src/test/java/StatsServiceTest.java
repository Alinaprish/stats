import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;



public class StatsServiceTest {

    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.salesAmount(salse);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSumError() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 150;
        long actual = service.salesAmount(salse);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.average(salse);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageError() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 25;
        long actual = service.average(salse);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaximumSalseMonth() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.maximumSales(salse);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaximumSalseMonthError() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 10;
        long actual = service.maximumSales(salse);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinimumSalseMonth() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.minimumSales(salse);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinimumSalseMonthError() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 10;
        long actual = service.minimumSales(salse);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthsLessThanAverage() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.LessThanAverage(salse);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthsLessThanAverageError() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 10;
        long actual = service.LessThanAverage(salse);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthsAboveThanAverage() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.AboveThanAverage(salse);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthsAboveThanAverageError() {
        StatsService service = new StatsService();

        long[] salse = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 10;
        long actual = service.AboveThanAverage(salse);

        Assertions.assertEquals(expected, actual);
    }
}

