package Threads;

import Services.JsonService;

import java.io.IOException;

public class WriteThread implements Runnable{

    static boolean isRead = false;

    @Override
    public void run() {
        try {
            if(isRead == true){
                Thread.sleep(3000);
                JsonService jsonService = new JsonService();
            }
        }catch (InterruptedException | IOException exception){
            exception.printStackTrace();
        }
    }
}
