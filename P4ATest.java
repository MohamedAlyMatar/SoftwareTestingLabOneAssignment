import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class P4ATest {
    @Test
    void twoAsWeightIsInvalid(){
        P4A test = new P4A();
        assertEquals("No", test.check(2));
    }

    @Test
    void OddWeightIsInvalid(){
        P4A test = new P4A();
        assertEquals("No", test.check(555));
    }

    @Test
    void EvenWeightIsValid(){
        P4A test = new P4A();
        assertEquals("Yes", test.check(400));
    }

    @Test
    void NegativeWeightTest(){
        P4A test = new P4A();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    test.check(-1);
                });
    }
}
