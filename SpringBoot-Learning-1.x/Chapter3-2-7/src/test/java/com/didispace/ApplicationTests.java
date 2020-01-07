package com.didispace;

import com.didispace.domain.User;
import com.didispace.domain.UserMapper;
import com.test.entity.AvTrackerItem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	@Rollback
	public void findByName() throws Exception {
//		userMapper.insert("AAA", 20);
		User u = userMapper.findByName("112");
		System.out.println("user age "+u.getAge()+ "----user name " +u.getName());
//		Assert.assertEquals(20, u.getAge().intValue());
	}
	@Test
	public void test(){
		AvTrackerItem avTrackerItem =new AvTrackerItem();
		AvTrackerItem build = avTrackerItem.builder().id(18L).avProfit(new BigDecimal(99.00)).build();

	}





	@Test
	public void tyestt(){

		String s = "2017-06-22 10:55";
		String[] s1 = s.split(" ");
		System.out.println(s1);

		System.out.println(s1[1]);
		System.out.println(s1[0]);


		Byte b= 0;
		System.out.println(b.toString());
	}
}