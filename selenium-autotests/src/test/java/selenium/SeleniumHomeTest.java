package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeleniumHomeTest extends SeleniumHome {

    @Before
    public void setUp() throws Exception {
        System.out.println("Starting Test");
    }

    @After
    public void tearDown() throws Exception {

        System.out.println("Ending Test");
    }

    @Test
    public void testGoToSite() throws InterruptedException {
        goToSite();
    }
}