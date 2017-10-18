package factorymethod;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FactoryMethodTest {

    @Test
    public void test_map_empty() {
        Map<Object, Object> emptyImmutableMap = Map.of();
        assertNotNull(emptyImmutableMap);
        assertEquals(0, emptyImmutableMap.size());
    }

    @Test
    public void test_map_set_some_values() {
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");
        assertNotNull(map);
        assertEquals("one", map.get(1));
    }

}