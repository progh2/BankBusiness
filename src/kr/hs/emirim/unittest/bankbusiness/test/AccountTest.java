package kr.hs.emirim.unittest.bankbusiness.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;
import kr.hs.emirim.unittest.bankbusiness.main.Account;

public class AccountTest {

	Account account;
	
	@Before
	public void setUp() {
		account = new Account(10000);
	}
	
	@Test
	public void testCreateAccount() throws Exception {
		assertNotEquals("���� ���� ����!", null, account );
	}
	
	@Test
	public void testGetBalance() throws Exception {
		assertEquals("���� ��ȸ ����!", 10000, account.getBalance());
		
		account = new Account(20000);
		assertEquals("���� ��ȸ ����!", 20000, account.getBalance());
		
		account = new Account(0);
		assertEquals("���� ��ȸ ����!", 0, account.getBalance());
	}
}
