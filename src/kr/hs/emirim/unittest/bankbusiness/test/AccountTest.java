package kr.hs.emirim.unittest.bankbusiness.test;

import kr.hs.emirim.unittest.bankbusiness.main.Account;

public class AccountTest {

	public void testCreateAccount() throws Exception {
		Account account = new Account();
		if( account == null ) {
			throw new Exception("���� ���� ����!");
		}
	}
	
	public static void main(String[] args) {
		AccountTest test = new AccountTest();
		try {
			test.testCreateAccount();
		} catch (Exception e) {
			System.out.println("����(X)");
			e.printStackTrace();
			return;
		}
		System.out.println("����(O)");
	}

}
