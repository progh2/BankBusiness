package kr.hs.emirim.unittest.bankbusiness.test;

public class AccountTest {

	public void testCreateAccount() {
		Account account = new Account();
		if( account == null ) {
			throw new Exception("���� ���� ����!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
