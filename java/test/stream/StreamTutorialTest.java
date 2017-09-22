package stream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StreamTutorialTest {
    private StreamTutorial tutorial;

    @Before
    public void setUp(){
        tutorial = new StreamTutorial();
    }

    @Test
    public void getAvgUsingStream() throws Exception {
        tutorial.setEmployees(100,200,300);
        assertTrue(250.0 == tutorial.getAvgUsingStream());
    }

    @Test
    public void getAvgOldVersion() throws Exception {
        tutorial.setEmployees(100,200,300);
        assertTrue(250.0 == tutorial.getAvgOldVersion());
    }
}