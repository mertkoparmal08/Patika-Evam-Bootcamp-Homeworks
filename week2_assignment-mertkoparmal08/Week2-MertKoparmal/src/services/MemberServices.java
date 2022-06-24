package services;

import classes.MemberAccount;

public class MemberServices {
	
	public static void create(MemberAccount member){
        System.out.println("Hesap oluþturuldu.");
    }
    public static void read(){
        System.out.println("Üye Bilgileri.");
    }
    public static void update(MemberAccount member,MemberAccount newMember){
        System.out.println("Üye Güncellendi.");
    }
    public static void delete(MemberAccount member){
        System.out.println("Üye Silindi.");
    }
}
