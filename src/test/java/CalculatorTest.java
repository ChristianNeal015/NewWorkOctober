import calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int x = 3;
        int y = 4;

        int expected = 7;
        int actual = calculator.add(x,y);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void subtract() {
        Calculator calculator1 = new Calculator();
        int a = 8;
        int b = 5;

        int expected = 3;
        int actual = calculator1.subtract(a,b);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void multiply() {
        Calculator calculator2 = new Calculator();
        double d = 4;
        double e = 4;

        double expected = 16;
        double actual = calculator2.multiply(d,e);

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void divide() {
        Calculator calculator3 = new Calculator();
        double f = 16;
        double g = 2;

        double expected = 8;
        double actual = calculator3.divide(f,g);

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void square() {
        Calculator calculator4 = new Calculator();
        int h = 9;


        int expected = 81;
        int actual = calculator4.square(h);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void squareRoot() {
        double i = 81;
        Calculator calculator5 = new Calculator();
        double expected = 9;
        double actual = calculator5.squareRoot(i);

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void exponents() {
        double j = 5;
        double k = 4;
        Calculator calculator6 = new Calculator();

        double expected = 625;
        double actual = calculator6.exponents(j,k);

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void sineMethod() {
    double l = 90;
    Calculator calculator7 = new Calculator();

    double expected = Math.sin(1);
    double actual = calculator7.sineMethod(1);

    Assert.assertEquals(expected, actual, 0.0);
    }
}

