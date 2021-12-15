import com.ibm.bank.AccountsFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {
		
		Bank s1 = AccountsFactory.openAccount("Lili", "Savings");
		try {
			s1.withdraw(100);
		} catch (BalanceException e) {
//			e.printStackTrace(); // For developers to trouble shoot problem
//			System.out.println(e);	// For logging to audit application behaviour
			System.out.println(e.getMessage()); // For end users
		}
	}
}
