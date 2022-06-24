package classes;

public class Response {
	
	//Private Deðiþkenler ve Constructer Metotlar Oluþturuldu
	
	private String code;
	private String date;
	  
	public Response() {
	  
	}

	public Response(String code, String date) {
		this.code = code;
		this.date = date;
	}
	
	//Getter ve Setter'lar Oluþturuldu.

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
