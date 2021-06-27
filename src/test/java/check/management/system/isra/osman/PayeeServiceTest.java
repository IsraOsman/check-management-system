package check.management.system.isra.osman;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

import check.management.system.isra.osman.entity.Payee;
import check.management.system.isra.osman.repository.PayeeRepository;
import check.management.system.isra.osman.service.PayeeService;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PayeeServiceTest {
	
	public static Long testId;  
	
	@Autowired 
	PayeeService service;
	
	@Test
	@Order(1)
	void testSave() {
		Payee pTest = new Payee("test Name"); 
		service.save(pTest);
		testId = pTest.getId();
		assertNotNull(pTest.getId());
	}
	
	@Test
	@Order(2)
	void testGet() {
		Payee expected = new Payee("test Name"); 
		expected.setId(testId);
		Payee payee1 = service.get(testId);
		assertEquals(expected, payee1);
	}
	
	@Test
	@Order(3)
	void testUpdate()
	{
		Payee payee = new Payee("test Name");
		service.save(payee);
		String expected=payee.getPayeeName();
		payee.setPayeeName("testUpdateName");
		service.save(payee);
		String actual = payee.getPayeeName();
		assertNotEquals(actual,expected);
	}
	
	@Test
	@Order(4)
	void testDelete()
	{
		Payee pay = new Payee("test Name3");
		Long id = pay.getId();
		service.delete(id);
		Payee p = service.get(id);
		assertNull(p);	
	}

}
