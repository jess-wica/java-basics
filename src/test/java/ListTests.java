import com.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ListTests {
    private Main main;

    @Before
    public void setup() {
        main = new Main();
    }

    @Test
    public void shouldReturnEmptyListFor_null_Provided() {
        //Arrange

        //Act
        List<String> result = main.lists(null);

        //Assert
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(new String[]{}, result.toArray());
    }

    @Test
    public void shouldReturnListWithOneItem() {
        //Arrange

        //Act
        List<String> result = main.lists("One");

        //Assert
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(new String[] {"One"}, result.toArray());
    }

    @Test
    public void shouldReturnListOfItems() {
        //Arrange

        //Act
        List<String> result = main.lists("One", "Two", "Three");

        //Assert
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(new String[] {"One", "Two", "Three"}, result.toArray());
    }

}
