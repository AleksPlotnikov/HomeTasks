import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class DZ1Test {

    @Test
    void recursiveMethod_DoNotEquals() {
        int a = 10;
        int b = 15;
        int result = DZ1.recursiveMethod(a, b);
        Assertions.assertEquals(5, result);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    void recursiveMethod_Time() {
        int a = 3;
        int b = 7;
        int result2 = DZ1.recursiveMethod(a, b);
        Assertions.assertEquals(1, result2);
    }

    @Test
    void recursiveMethod() {
        int a = 1;
        int b = 0;
        int result = DZ1.recursiveMethod(a, b);
        Assertions.assertEquals(1,result);
    }
    @Test
    void recursiveMethodNull(){
        int a = 0;
        int b = 0;
        int result = DZ1.recursiveMethod(a, b);
        Assertions.assertEquals(0, result);
    }
}
