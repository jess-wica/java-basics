import com.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ComplexMapTests {
    private Main main;

    @Before
    public void setup() {
        main = new Main();
    }

    @Test
    public void shouldReturnEmptyMapFor_null_key_and_item_Provided() {
        //Arrange

        //Act
        Map<String, List<String>> result = main.complexMaps(null, null);

        //Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void shouldReturnEmptyMapFor_null_key_Provided() {
        //Arrange

        //Act
        Map<String, List<String>> result = main.complexMaps(null, "Test");

        //Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void shouldReturnEmptyMapFor_null_item_Provided() {
        //Arrange

        //Act
        Map<String, List<String>> result = main.complexMaps("Test", null);

        //Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void shouldReturnMapWithKeySetToListOfOneElement() {
        //Arrange

        //Act
        Map<String, List<String>> result = main.complexMaps("key", "One");

        //Assert
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.get("key"));
        Assert.assertEquals(new String[] {"One"}, result.get("key").toArray());
    }

    @Test
    public void shouldReturnMapWithKeySetToListOfElements() {
        //Arrange

        //Act
        Map<String, List<String>> result = main.complexMaps("key", "One", "Two");

        //Assert
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.get("key"));
        Assert.assertEquals(new String[] {"One", "Two"}, result.get("key").toArray());
    }

}
