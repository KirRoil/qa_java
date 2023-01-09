import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Cat;
import com.example.Feline;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;

    @Test
    public void getCatSound() {
        Cat cat = new Cat(feline);
        String expectedResult = "Мяу";
        assertEquals(cat.getSound(), expectedResult);
    }

    @Test
    public void getCatMeat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedEatMeat, cat.getFood());
    }
}