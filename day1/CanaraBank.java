package week4.day1;

public abstract class CanaraBank implements Payments {
	public void cashOnDelivery() {
		System.out.println("Cash on delivery is applicablefor dairy products");
		}
public void upiPayments() {
	System.out.println("Done through BHIM");

	}
	public void cardPayments() {
		System.out.println("Card Payment is > 2000 rupees");
		
	}
	public void internetBanking() {
		System.out.println("Access Internet Banking & Mobile Banking");
		
	}
	public abstract void recordPaymentDetails();
}
