package workshop;

import org.junit.Assert;
import org.junit.Test;
import workshop.calculator.nCalculator;

public class nCalculatorTest {

    // AC: sum
    // +ve num plus +ve num should returns +ve num
    // -ve num plus -ve num should return -ve num
    // +ve num larger than -ve num return +ve num
    // +ve num smaller than -ve num return -ve num

    @Test
    public void testingSumMethod_positivePlusPositive_shouldReturnPositiveNumber() {

        // Arrange
        nCalculator calc = new nCalculator();
        int positiveInputOne = 1;
        int positiveInputTwo = 100;

        // Act
        int output = calc.sum(positiveInputOne, positiveInputTwo);

        // Assert
        Assert.assertTrue(output > 0);

    }

    @Test
    public void testingSumMethod_negativePlusNegative_shouldReturnNegativeNumber() {

        // Arrange
        nCalculator calc = new nCalculator();
        int positiveInputOne = -1;
        int positiveInputTwo = -100;

        // Act
        int output = calc.sum(positiveInputOne, positiveInputTwo);

        // Assert
        Assert.assertTrue(output < 0);

    }

    @Test
    public void testingSumMethod_positiveNumLargerThanNegativeNum_shouldReturnPositiveNumber() {

        // Arrange
        nCalculator calc = new nCalculator();
        int positiveInputOne = 1000;
        int positiveInputTwo = -100;

        // Act
        int output = calc.sum(positiveInputOne, positiveInputTwo);

        // Assert
        Assert.assertTrue(output > 0);

    }

    @Test
    public void testingSumMethod_positiveNumSmallerThanNegativeNum_shouldReturnNegativeNumber() {

        // Arrange
        nCalculator calc = new nCalculator();
        int positiveInputOne = 10;
        int positiveInputTwo = -100;

        // Act
        int output = calc.sum(positiveInputOne, positiveInputTwo);

        // Assert
        Assert.assertTrue(output < 0);

    }

}
