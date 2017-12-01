package com.ravi.cal.CalculatorTestCase;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

	@Test
    public void twoAndThreeIsFive() throws Exception {
        final int result = new Calculator().add(2, 3);
        assertThat(result, is(5));
    }
    
	@Test
    public void twoAndZeroIsTwo() throws Exception {
        final int result = new Calculator().add(2, 0);
        assertThat(result, is(2));
    }
    
	@Test
    public void twoAndMinusTwoIsZero() throws Exception {
        final int result = new Calculator().add(2, -2);
        assertThat(result, is(0));
    }
    
	@Test
    public void threeMinusTwoIsOne() throws Exception {
        final int result = new Calculator().subtract(3, 2);
        assertThat(result, is(1));
    }
    
	@Test
    public void threeMinusThreeIsZero() throws Exception {
        final int result = new Calculator().subtract(3, 3);
        assertThat(result, is(0));
    }
    
	@Test
    public void threeMinusMinusThreeIsSix() throws Exception {
        final int result = new Calculator().subtract(3, -3);
        assertThat(result, is(6));
    }
    
	@Test
    public void threeXThreeIsNine() throws Exception {
        final int result = new Calculator().multiply(3, 3);
        assertThat(result, is(9));
    }
    
	@Test
    public void threeXZeroIsZero() throws Exception {
        final int result = new Calculator().multiply(3, 0);
        assertThat(result, is(0));
    }
    
	@Test
    public void threeXMinusThreeIsMinusNine() throws Exception {
        final int result = new Calculator().multiply(3, -3);
        assertThat(result, is(-9));
    }
}
