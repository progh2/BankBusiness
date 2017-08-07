package kr.hs.emirim.unittest.bankbusiness.test;

import static org.junit.Assert.fail;

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
		if( account == null ) {
			fail("���� ���� ����!");
		}
	}
	
	@Test
	public void testGetBalance() throws Exception {
		if(account.getBalance() != 10000) {
			fail("���� ��ȸ ����!");
		}
		
		account = new Account(20000);
		if(account.getBalance() != 20000) {
			fail("���� ��ȸ ����!");
		}
		
		account = new Account(0);
		if(account.getBalance() != 0) {
			fail("���� ��ȸ ����!");
		}
	}

}
