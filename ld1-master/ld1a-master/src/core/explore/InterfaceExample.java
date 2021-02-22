package core.explore;

interface DebitCard {
	int cardNo = 123456789;
	// public void withdraw();
	// public abstract void withdraw();
	abstract void withdraw();
	public void test();
}
interface CreditCard {
	// public void withdraw();
	// public abstract void withdraw();
	// void pay();
	abstract public void pay();
}

//interface NetBanking extends DebitCard, CreditCard{
//	public void openFixedDeposit();
//
//}

interface NetBanking {
public void openFixedDeposit();
public void test();
}

 class BankAccount implements DebitCard, NetBanking {

	@Override
	public void withdraw() {
		System.out.println("Withdraw from ATM");
	}

	@Override
	public void openFixedDeposit() {
		System.out.println("Open fixed deposit!");

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceExample {
	static public void main(String[] args) {
//		 DebitCard hdfcCard = new DeibitCard();
//		DebitCard hdfcCard = null;
//		hdfcCard = new BankAccount();
//		hdfcCard.withdraw();
//		hdfcCard.openFixedDeposit();

		NetBanking netBanking = null;
		netBanking = new BankAccount();
		//netBanking.withdraw();
		netBanking.openFixedDeposit();
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.withdraw();
		bankAccount.openFixedDeposit();
		
		// System.out.println(NetBanking.cardNo);
		// System.out.println(bankAccount.cardNo);
		// System.out.println(DebitCard.cardNo);
	}
}
