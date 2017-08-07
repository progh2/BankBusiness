package kr.hs.emirim.unittest.bankbusiness.test;

import org.junit.Test;

import kr.hs.emirim.unittest.bankbusiness.main.Account;

public class AccountTest {

	@Test
	public void testCreateAccount() throws Exception {
		Account account = new Account();
		if( account == null ) {
			throw new Exception("계좌 생성 실패!");
		}
	}
}
