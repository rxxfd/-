package com.hxq.violation;

import com.hxq.violation.bean.Police;
import com.hxq.violation.service.PoliceService;
import com.hxq.violation.service.ViolationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserShanghaiApplicationTests {

	@Autowired
	private ViolationService violationService;
	@Autowired
	private PoliceService policeService;
	@Test
	public void contextLoads() {
		Police police=policeService.findPoliceByIdPass(2222,"jinghu");
		System.out.println(police);
	}

}
