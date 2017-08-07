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
		assertNotEquals("계좌 생성 실패!", null, account );
	}
	
	@Test
	public void testGetBalance() throws Exception {
		assertEquals("계좌 조회 실패!", 10000, account.getBalance());
		
		account = new Account(20000);
		assertEquals("계좌 조회 실패!", 20000, account.getBalance());
		
		account = new Account(0);
		assertEquals("계좌 조회 실패!", 0, account.getBalance());
	}
}
