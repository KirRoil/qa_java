import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Params {
    private final boolean isHasMane;
    private final String sex;
    @Mock
    private Feline feline;

    public Params(boolean isHasMane, String sex) {
        this.isHasMane = isHasMane;
        this.sex = sex;

    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1} {3}")
    public static Object[][] getSumData() {
        return new Object[][]{
                {true, "Самец"},
                {false, "Самка"},
                {false, "Неопределен"}
        };
    }

    @Test
    public void lionGenderTest() throws Exception {

        try {
            Lion lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            assertEquals(isHasMane, actual);
        } catch (Exception ex) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", ex.getMessage());
        }
    }

}