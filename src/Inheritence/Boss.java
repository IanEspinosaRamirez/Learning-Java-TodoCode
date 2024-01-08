package Inheritence;

public class Boss extends Person {
    int bossID;
    String bossDepartament;

    public Boss() {
    }

    public Boss(String name, String lastname, int age, String address, String phone, int bossID, String bossDepartament) {
        super(name, lastname, age, address, phone);
        this.bossID = bossID;
        this.bossDepartament = bossDepartament;
    }

    public int getBossID() {
        return bossID;
    }

    public void setBossID(int bossID) {
        this.bossID = bossID;
    }

    public String getBossDepartament() {
        return bossDepartament;
    }

    public void setBossDepartament(String bossDepartament) {
        this.bossDepartament = bossDepartament;
    }
}