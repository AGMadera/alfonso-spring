package org.unitec;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AlfonsoApplication.class)
@WebAppConfiguration
@EnableAutoConfiguration
@ComponentScan
public class AlfonsoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
