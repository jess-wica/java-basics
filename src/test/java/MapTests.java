import com.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class MapTests {
    private Main main;

    @Before
    public void setup() {
        main = new Main();
    }

    @Test
    public void shouldReturnEmptyMapFor_null_key_and_item_Provided() {
        //Arrange

        //Act
        Map<String, String> result = main.maps(null, null);

        //Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void shouldReturnEmptyMapFor_null_key_Provided() {
        //Arrange

        //Act
        Map<String, String> result = main.maps(null, "Test");

        //Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void shouldReturnEmptyMapFor_null_item_Provided() {
        //Arrange

        //Act
        Map<String, String> result = main.maps("Test", null);

        //Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void shouldReturnMapWithKeySetToOne() {
        //Arrange

        //Act
        Map<String, String> result = main.maps("key", "One");

        //Assert
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.get("key"));
        Assert.assertEquals("One", result.get("key"));
    }

}
