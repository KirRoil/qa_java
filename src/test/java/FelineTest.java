import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void getFelineFamily() {
        String expectedResult = "Кошачьи";
        assertEquals(feline.getFamily(), expectedResult);
    }

    @Test
    public void getFeline() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));

    }
}
