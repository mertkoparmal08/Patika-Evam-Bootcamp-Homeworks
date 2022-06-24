package services;

public class LowBalanceException extends Exception{ // Exception oluþturuldu.
    String message; // getMessage metodu için String Deðiþken.
    
    //Constructor
    public LowBalanceException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }


}
