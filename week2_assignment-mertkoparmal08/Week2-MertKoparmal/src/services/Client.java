package services;

import java.util.Date; //Date De�i�keni i�in import kullan�ld�.
import classes.Response;

public interface Client {
	
	//Response de�er d�necek olan metod
	Response payment(int invoceType, String memberCode, double balance,double amount) throws LowBalanceException;
	
	Response check(int invoiceType,String memberCode);
	
    Response check(int invoiceType, String memberCode, double amount, Date invoiceDate);
    
    Response cancelPayment(int invoiceType, String memberCode, double amount,int paymentId,Date invoiceDate);
}
