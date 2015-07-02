package fr.arolla.jam.webapp.repository;

import fr.arolla.jam.webapp.WebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebApplication.class, loader = SpringApplicationContextLoader.class)
@WebIntegrationTest(value = "server.port=9090")
public class EmployeeRepositoryTests {

    @Autowired
    EmployeeRepository repository;

    @Test
    public void simpleCountTest() throws Exception {
        assertTrue(repository.count() > 0);
    }

    @Test
    public void firstEmployeeNickNameTest() throws Exception {
        assertEquals("johndoe", repository.findOne(0L).getNickname());
    }
}
