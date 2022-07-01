package Services;

import Models.Student;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonService {

    //Bir öğrenci oluşturduk
    Student student = new Student();

    public JsonService() throws IOException{
        //JSON dosyasını tanımladık
        String jsonData = new String(Files.readAllBytes(Paths.get("Student.JSON")));

        //JSONArray ile array'a aldık
        JSONArray jsonArray = new JSONArray(jsonData);

        //For ile dosya içinde dolaştık
        for (int i=0; i<jsonArray.size(); i++){

            //Dosya içindekini arr adındaki bir String'e tanımladık.
            String arr=jsonArray.get(i).toString();
            JSONObject object = new JSONObject(arr);

            //Döngü ile her adı ad ile soyadı soyad ile yaşı yaş ile eşitledik.
            String name = (String) object.get("İsim");
            String surname = (String) object.get("Soyisim");
            int age = (int) object.get("Yaş");

            //Ekrana bastırdık.
            System.out.println("İsim: " + name);
            System.out.println("Soyisim: " + surname);
            System.out.println("Yaş: " + age);

        }

    }
}
