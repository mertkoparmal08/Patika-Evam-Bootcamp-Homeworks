package services;

import classes.MemberAccount;

public class MemberServices {
	
	public static void create(MemberAccount member){
        System.out.println("Hesap olu�turuldu.");
    }
    public static void read(){
        System.out.println("�ye Bilgileri.");
    }
    public static void update(MemberAccount member,MemberAccount newMember){
        System.out.println("�ye G�ncellendi.");
    }
    public static void delete(MemberAccount member){
        System.out.println("�ye Silindi.");
    }
}
