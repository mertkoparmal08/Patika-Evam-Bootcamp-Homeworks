package classes;

import java.util.Date; //Date De�i�keni i�in import kullan�ld�.

public class Payment {
	
	//Private De�i�kenler ve Constructer Metotlar Olu�turuldu
	
	private int id;
    private boolean status;
    private Date paymentDate;
    private int memberAccountId;
    private double amount;

    public Payment() {
    	
    }
    //Constructer
    
	public Payment(int id, boolean status, Date paymentDate, int memberAccountId, double amount) {
		this.id = id;
		this.status = status;
		this.paymentDate = paymentDate;
		this.memberAccountId = memberAccountId;
		this.amount = amount;
	}
	
	//Getter ve Setter'lar Olu�turuldu.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getMemberAccountId() {
		return memberAccountId;
	}

	public void setMemberAccountId(int memberAccountId) {
		this.memberAccountId = memberAccountId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
    
    
}
