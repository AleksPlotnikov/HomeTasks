import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class DZ1Test {

    @Test
    void recursiveMethod_DoNotEquals() {
        int a = 10; int b = 15;
        DZ1.recursiveMethod(b, a % b);
        Assertions.assertNotEquals(a,b,"Ok");
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    void recursiveMethod_Time() {

    }

    @Test
    void recursiveMethod() {
        int a = 10; int b = 15;
        if (b == 0 | a == 0){
            System.out.println("a или b равно нулю");
        }
        else
            System.out.println("a или b не равно нулю");
    }
    }
