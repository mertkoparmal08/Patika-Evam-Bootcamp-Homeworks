import java.util.Scanner;

public class Main {
	
	String s1="Welcome";	//1. Obje
	String s2="Welcome";	//2. Obje
	String s3="Welcome";	//3.Obje
	//Toplam 3 Obje
	
	static String str="code";
	
	static String[] arr= {"Patika","Evam","Bootcamp","code","Java"};
	
	public static String metod(String[] arrCheck) {
		
		String result=" ";
		
		for(String item : arrCheck) {
			if(item.contains("code")) {
				result=item;
			}
		}
		
		if(result==" ") {
			return "Tanımlı Value'yü içeren String değer YOK";
		}else {
			return "Tanımlı Value'yü içeren String değer: " + result;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String[] inArr = new String[5];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("String Giriniz: ");
            
            String scanIn = scan.nextLine();
            inArr[i] = scanIn;
        }
        scan.close();
        
        System.out.println(metod(inArr));
	}
}
