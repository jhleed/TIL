package example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyContextContainerTest {

    @Test
    public void test_apply_annotations() throws InstantiationException, IllegalAccessException {
        MyContextContainer demo = new MyContextContainer();

        //Annotation 처리가 된 MyObject 객체를 받아옴
        MyObject obj = demo.get(MyObject.class);

        assertEquals("My name is JDM.", obj.getName());
        assertEquals("This is StringInjector.", obj.getDefaultValue());
        assertNull(obj.getInvalidType());
    }

    @Test
    public void test_default(){
        //Annotation이 적용되지 않으면 전부 null이 나온다.
        MyObject obj = new MyObject();
        assertNull(obj.getName());
        assertNull(obj.getDefaultValue());
        assertNull(obj.getInvalidType());
    }

}