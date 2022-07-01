import Threads.ReadThread;
import Threads.WriteThread;

public class Main {
    public static void main(String[] args) {
        //Yazma ve Okuma için yeni nesneler
        WriteThread writeThread = new WriteThread();
        ReadThread readThread = new ReadThread();

        //Yazma ve Okuma Çalıştırma
        writeThread.run();
        readThread.run();
    }
}
