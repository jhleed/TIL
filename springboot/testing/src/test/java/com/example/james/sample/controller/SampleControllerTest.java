package com.example.james.sample.controller;

import com.example.james.sample.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleControllerTest {

    @Autowired
    private SampleController controller;


    @Test
    public void testX() {
        String id = "598a78df29f7a6e75f01f12c";
        User user = controller.testX(id);
        assertEquals(id, user.getId());
    }
}