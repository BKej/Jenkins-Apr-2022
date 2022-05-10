
import org.junit.jupiter.api.*;

public class JUnitFunctionalTest {

    /*
    Login
    Book a Ticket
    Check- in
    Cancel Ticket
    Logout
     */

    //run only once at the beginning of the class (before any tests are run)
    @BeforeAll
    public static void loadTestData(){
        //clear old test data
        //setup new test data for current run
        System.out.println("Initialising Test Data..");
    }

    //runs before every test
    @BeforeEach
    public void login(){
        //launch your browser eg. using Selenium webdriver
        //enter URL
        //enter id, pasword and login
        System.out.println("Login in progress...");
    }

    @Test
    public void bookTicket(){
        System.out.println("Booking a ticket");
    }

    @Test
    public void checkIn(){
        System.out.println("Checking in....");
    }

    @Test
    public void cancelTicket(){
        System.out.println("Cancelling ticket...");
    }

    //runs after every test
    @AfterEach
    public void logout(){
        //click on logout button
        //close the browser
        System.out.println("Application logging out....");
    }

    @AfterAll
    //run only once at the end of the class (after all the tests are run)
    public static void testDown(){
        //closing database connections etc
        System.out.println("Completed running all test..");
    }




}
