package services;

import java.util.Date; //Date Deðiþkeni için import kullanýldý.
import classes.Response;

public interface Client {
	
	//Response deðer dönecek olan metod
	Response payment(int invoceType, String memberCode, double balance,double amount) throws LowBalanceException;
	
	Response check(int invoiceType,String memberCode);
	
    Response check(int invoiceType, String memberCode, double amount, Date invoiceDate);
    
    Response cancelPayment(int invoiceType, String memberCode, double amount,int paymentId,Date invoiceDate);
}
