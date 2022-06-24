package classes;

import java.util.Date; // Date Deðiþkeni için import kullanýldý. 

public class Invoice {
	
	//Private Deðiþkenler ve Constructer Metotlar Oluþturuldu
	
	private int id;
    private double amount;
    private Date processDate;
    private int billType ;
    private String memberCode;
    
    public Invoice() {
    	
    }

	public Invoice(int id, double amount, Date processDate, int billType, String memberCode) {
		super();
		this.id = id;
		this.amount = amount;
		this.processDate = processDate;
		this.billType = billType;
		this.memberCode = memberCode;
	}

	//Getter ve Setter'lar Oluþturuldu.
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public int getBillType() {
		return billType;
	}

	public void setBillType(int billType) {
		this.billType = billType;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
    
    
}
