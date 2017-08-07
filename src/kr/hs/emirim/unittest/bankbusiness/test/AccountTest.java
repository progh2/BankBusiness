package kr.hs.emirim.unittest.bankbusiness.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import kr.hs.emirim.unittest.bankbusiness.main.Account;

public class AccountTest {

	@Test
	public void testCreateAccount() throws Exception {
		Account account = new Account();
		if( account == null ) {
			fail("���� ���� ����!");
		}
	}
	
	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		if(account.getBalance() != 10000) {
			fail("���� ��ȸ ����!");
		}
	}

}
