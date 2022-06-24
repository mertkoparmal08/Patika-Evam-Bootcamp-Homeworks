package services;

import java.util.Date;

import classes.Response;

//Client'tan implement edildi.
public class InvoiceServices implements Client{
	public boolean status=true;
	
	@Override
	public Response payment(int billType, String memberCode,double balance, double amount) throws LowBalanceException{
		// Bakiye kontrolüne göre Exception atýyor
		
		if(balance<amount){
            throw new LowBalanceException("Yetersiz Bakiye!");
        }
        else{
            return new Response("0","2022-06-16");
        }
    }
	
	@Override
	public Response check(int billType, String memberCode) {
		return null;
	}

	@Override
	public Response check(int billType, String memberCode, double amount, Date billDate) {
		return null;
	}

	@Override
	public Response cancelPayment(int billType, String memberCode, double amount, int paymentId, Date billDate) {
		return null;
	}
}
	