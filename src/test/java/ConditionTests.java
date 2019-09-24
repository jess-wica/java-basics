import com.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConditionTests {
    private Main main;

    @Before
    public void setup() {
        main = new Main();
    }

    @Test
    public void shouldReturn_One_When_null_IsProvided() {
        //Arrange
        String input = null;

        //Act
        String result = main.condition(input);

        //Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("One", result);
    }

    @Test
    public void shouldReturn_Two_When_Number_IsProvided() {
        //Arrange
        String input = "Number";

        //Act
        String result = main.condition(input);

        //Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("Two", result);
    }

    @Test
    public void shouldReturn_Three_When_Another_IsProvided() {
        //Arrange
        String input = "Another";

        //Act
        String result = main.condition(input);

        //Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("Three", result);
    }

    @Test
    public void shouldReturn_Four_When_EmptyString_IsProvided() {
        //Arrange
        String input = "";

        //Act
        String result = main.condition(input);

        //Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("Four", result);
    }
}
