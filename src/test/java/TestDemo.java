
import org.junit.jupiter.api.*;

public class TestDemo {

    @Test
    public void test1(){
        System.out.println("Running Test 1..");
    }

    @Test
    public void test2(){
        System.out.println("Running Test 2..");
    }

    @Test
    public void test3(){
        System.out.println("Running Test 3..");
    }

    @Disabled
    public void test4(){
        System.out.println("Running Test 4..");
    }



}
