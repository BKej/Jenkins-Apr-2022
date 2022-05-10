
import org.junit.jupiter.api.*;

public class AppUtils_Test {

    AppUtils app = new AppUtils();

    @Test
    public void add_test1(){
        int actResult = app.add(100,200);
        int expResult = 300;

        Assertions.assertEquals(expResult,actResult);

    }

    @Test
    public void add_test2(){
        int actResult = app.add(100,-200);
        int expResult = -100;

        Assertions.assertEquals(expResult,actResult);
    }

    @Test
    public void add_test3(){
        int actResult = app.add(-100,-200);
        int expResult = -300;

        Assertions.assertEquals(expResult,actResult);
    }

    @Disabled
    public void multiply_test1(){
        int actResult = app.multiply(100,200);
        int expResult = 20000;

        Assertions.assertEquals(expResult,actResult);

    }
}
