package classes;

public class MemberAccount {
	
	//Private De�i�kenler ve Constructer Metotlar Olu�turuldu
	
	private int id;
    private String name;
    private String surname;
    private double balance;
    private String memberCode;
    private int phoneNumber;

    public MemberAccount() {

    }
    
    //Constructer
	public MemberAccount(int id, String name, String surname, double balance, String memberCode, int phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.balance = balance;
		this.memberCode = memberCode;
		this.phoneNumber = phoneNumber;
	}
	
	//Getter ve Setter'lar Olu�turuldu.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
	
    
}
