package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void recordPaymentDetails() {
		System.out.println("Download Invoice");
		
	}
public static void main(String[] args) {
	Amazon am=new Amazon();
	am.cardPayments();
	am.upiPayments();
	am.recordPaymentDetails();
}
}
