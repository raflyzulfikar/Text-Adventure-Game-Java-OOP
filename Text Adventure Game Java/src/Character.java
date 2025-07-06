//NAMA: RAFLY ZULFIKAR ALKAUTSAR
//NIM: 102022400192
//KELAS: SI-48-08

public class Character {
    String name; //Nama karakter
    int health; //Poin kesehatan karakter
    int XP; //Poin yang didapat oleh pemain Ketika menyelesaikan tantangan
    String item;

    //Menginisialisasi atribut karakter
    Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.XP = 0; //XP awalnya itu 0
        this.item = ""; //Item awalnya masih kosong
    }

    //Mengurangi poin kesehatan karakter
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }   
    }

    //Menambahkan poin XP
    public void addXP(int additionalXP) {
        this.XP += additionalXP;
    }

    //Mengembalikan nama karakter
    public String getName() {
        return name;
    }

    //Mengembalikan poin kesehatan karakter
    public int getHealth() {
        return health;
    }

    //Mengembalikan XP karakter
    public int getXP() {
        return XP;
    }

    //Mengembalikan item karakter
    public String getItem() {
        return item;
    }

    //mengatur item dari karakter
    public void setItem(String item) {
        this.item = item;
    }
}