import classes.Response;
import services.InvoiceServices;
import services.LowBalanceException;

public class Main {
	public static void main(String[] args) throws LowBalanceException {
		
		InvoiceServices invoiceServices=new InvoiceServices(); //Nesne Oluþtu.
		
        Response response1 = invoiceServices.payment(1,"Mert",15,11);
        
        // Response deðerin kontrolü
        if(response1.getCode().equals("0")){
            System.out.println("Ýþlem Baþarýlý. Olay tarihi : "+response1.getDate());
        }
        else if(response1.getCode().equals("1")){
            System.out.println("Ýþlem Baþarýsýz. Olay tarihi :"+response1.getDate());
        }
        else {
            System.out.println("Hata!");
        }
	}
}
