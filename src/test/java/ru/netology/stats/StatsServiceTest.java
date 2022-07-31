package ru.netology.stats;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] sales = {8, 15, 23, 1, 9, 35, 14, 16, 19, 18, 21, 23};

    // @ParameterizedTest
    // @CsvSource({
    // "8,15,23,8,9,13,14,16,19,18,21,23, 3",
    //     "17,15,23,11,9,13,14,16,19,18,18,23,4"
    // })
    @Test
    void TestSumSales() {
        StatsService service = new StatsService();
        int expected = 202;
        int actual = service.sumSales(sales);
        assertEquals(actual, expected);
    }

    @Test
    void TestSumAverage() {
        StatsService service = new StatsService();
        double expected = 16.83;
        double actual = service.sumAverage(sales);
        assertEquals(actual, expected);
    }

    @Test
    void TestMaxSales() {
        StatsService service = new StatsService();
        int expected = 6;
        int actual = service.maxSales(sales);
        assertEquals(actual, expected);
    }

    @Test
    void TestMinSales() {
        StatsService service = new StatsService();
        int expected = 4;
        int actual = service.minSales(sales);
        assertEquals(actual, expected);
    }

    @Test
    void TestBelowAverageSales() {
        StatsService service = new StatsService();
        int expected = 6;
        int actual = service.belowAverageSales(sales);
        assertEquals(actual, expected);
    }

    @Test
    void TestAboveAverageSales() {
        StatsService service = new StatsService();
        int expected = 6;
        int actual = service.aboveAverageSales(sales);
        assertEquals(actual, expected);
    }

}
