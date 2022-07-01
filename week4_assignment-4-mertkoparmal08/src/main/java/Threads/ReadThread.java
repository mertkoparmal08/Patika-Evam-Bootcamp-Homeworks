package Threads;

import Services.JsonService;

import java.io.IOException;

//Runnable implementasyonu
public class ReadThread implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Dosya Okunuyor!");
            Thread.sleep(3000);
            System.out.println("Dosya Okundu!");
            JsonService jsonService = new JsonService();
        }catch (InterruptedException | IOException exception){
            exception.printStackTrace();
        }
    }
}
