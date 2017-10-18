package factorymethod;

import org.junit.Test;

import java.util.List;
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

    @Test
    public void test_list_empty() {
        List<Object> list = List.of();
        assertEquals(0, list.size());
    }

    @Test
    public void test_list_values() {
        List<String> list = List.of("2", "1", "4");
        assertEquals(3, list.size());
        assertEquals("1", list.get(1));
        assertEquals("2", list.get(0));
        assertEquals("4", list.get(2));
    }

}