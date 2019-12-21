import Projetgit.Calcul;
import org.junit.Assert;


import static org.junit.Assert.*;

public class CalculTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void add() {
        int expected = 6;

        int actual = Calcul.Addition(3, 3);

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void addPositiveAndNegativeNumber(){
        int expected = 0;

        int actual = (int) Calcul.Addition(-3, 3);

        Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void addNegativeAndNegativeNumber(){
        int expected = -6;

        int actual = Calcul.Addition(-3, -3);

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void multiply() {
        int expected = 4;

        int actual = (int) Calcul.Multiplication(2, 2);

        Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void multiplyPositiveAndNegativeNumber(){
        int expected = -9;

        int actual = Calcul.Multiplication(-3, 3);

        Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void multiplyNegativeAndNegativeNumber(){
        int expected = 9;

        int actual = Calcul.Multiplication(-3, -3);

        Assert.assertEquals(actual, expected);
    }
}