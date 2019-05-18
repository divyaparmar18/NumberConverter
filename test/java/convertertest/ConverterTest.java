package convertertest;

import converter.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class ConverterTest {
    @Test
    public void theNumberShouldBeTheSumOfElements() {
        List<Integer> numbers = Arrays.asList(2,10,12);
        assertEquals(24, SumOfNumbers.getTotal(numbers));
    }
    @Test
    public void theNumberShouldBeSeperatedAndTGiveItsDigitsInArray() {
        List<Integer> actual = Arrays.asList(4,3,2);
        assertEquals(actual, SplitNumber.getDigits("234"));
    }
    @Test
    public void theListShouldBeThePowersOfEight() {
        List<Integer> expected = Arrays.asList(1,8,64);
        assertEquals(expected, PowersOfNumber.getPowers(8,3));
    }
    @Test
    public void theListShouldBeContainingTheMultiplicationOfElements() {
        List<Integer> expected = Arrays.asList(10,30,100);
        List<Integer>   digitsList = Arrays.asList(5,6,10);
        List<Integer> powersList = Arrays.asList(2,5,10);
        assertEquals(expected, DotProductCalculator.getProduct(digitsList,powersList));
    }

}


