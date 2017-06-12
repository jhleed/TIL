package stream;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by james on 2017. 6. 12..
 */
public class StreamTutorialTest {

    @Test
    public void getAvgUsingStream() throws Exception {
        StreamTutorial tutorial = new StreamTutorial();
        assertEquals(250.0, tutorial.getAvgUsingStream());
    }

    @Test
    public void getAvgOldVersion() throws Exception {
        StreamTutorial tutorial = new StreamTutorial();
        assertEquals(250.0, tutorial.getAvgOldVersion());
    }
}