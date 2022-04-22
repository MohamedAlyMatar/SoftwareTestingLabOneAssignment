import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class P69ATest {

    @Test
    void allVectorsAreZero(){
        P69A test = new P69A();
        assertEquals("Yes", test.checkEquilibrium(0,0,0));
    }

    @Test
    void allVectorsAreNonZero(){
        P69A test = new P69A();
        assertEquals("No", test.checkEquilibrium(1,-3,5));
    }

    @Test
    void xVectorsAreNonZero(){
        P69A test = new P69A();
        assertEquals("No", test.checkEquilibrium(1,0,0));
    }

    @Test
    void yVectorsAreNonZero(){
        P69A test = new P69A();
        assertEquals("No", test.checkEquilibrium(0,1,0));
    }

    @Test
    void zVectorsAreNonZero(){
        P69A test = new P69A();
        assertEquals("No", test.checkEquilibrium(0,0,1));
    }

}
