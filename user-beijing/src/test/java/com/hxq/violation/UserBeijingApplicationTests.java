package com.hxq.violation;

import com.hxq.violation.bean.Police;
import com.hxq.violation.service.CarerService;
import com.hxq.violation.service.PoliceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserBeijingApplicationTests {

	@Autowired
	private CarerService carerService;
	@Autowired
	private PoliceService policeService;
	@Test
	public void contextLoads() {
//		Carer carer=carerService.findCarerByIdPass(11111,"chebei");
//		System.out.println(carer.toString());

		Police police=policeService.findPoliceByIdPass(96321,"jiingbei");
		System.out.println(police);
	}

}
