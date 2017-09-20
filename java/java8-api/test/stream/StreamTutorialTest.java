package stream;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by james on 2017. 6. 12..
 */
public class StreamTutorialTest {


    private StreamTutorial tutorial;

    @Before
    public void setUp(){
        tutorial = new StreamTutorial();
    }

    @Test
    public void getAvgUsingStream() throws Exception {
        tutorial.setEmployees(100,200,300);
        assertEquals(250.0, tutorial.getAvgUsingStream());
    }

    @Test
    public void getAvgOldVersion() throws Exception {
        tutorial.setEmployees(100,200,300);
        assertEquals(250.0, tutorial.getAvgOldVersion());
    }
}