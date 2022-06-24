package services;

public class LowBalanceException extends Exception{ // Exception olu�turuldu.
    String message; // getMessage metodu i�in String De�i�ken.
    
    //Constructor
    public LowBalanceException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }


}
