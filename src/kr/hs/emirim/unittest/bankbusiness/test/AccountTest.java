package kr.hs.emirim.unittest.bankbusiness.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import kr.hs.emirim.unittest.bankbusiness.main.Account;

public class AccountTest {

	@Test
	public void testCreateAccount() throws Exception {
		Account account = new Account();
		if( account == null ) {
			fail("계좌 생성 실패!");
		}
	}
	
	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		if(account.getBalance() != 10000) {
			fail("계좌 조회 실패!");
		}
	}

}
