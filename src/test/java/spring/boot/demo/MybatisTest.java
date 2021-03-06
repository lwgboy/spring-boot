package spring.boot.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.zxf.model.User;
import com.springboot.zxf.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

	@Autowired
	private UserService userservice;

	@Test
	public void readTest() {
		System.out.println(userservice.queryAllUser());
	}

	@Test
	public void writeTest() {
		System.out.println(userservice.save(new User()));
	}

}
