package javafundamentals.lessons.lesson4.flight;

public class Passanger {
    private int checkedBags;
    private int freebags;

    private double perBagfee;


  public  Passanger(){

  }

    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }



    public Passanger(int freebags) {
        this(freebags > 1 ? 25.0d : 50.0d);
        this.freebags = freebags;
    }


    public Passanger(int freebags, int checkedBags) {
        this(freebags);  //cand sunt doua this si nu mai stie care plm si trebuie sa pui this la inceputul clasei
        this.checkedBags = checkedBags;

    }


    public Passanger(double perBagfee) {
        this.perBagfee = perBagfee;
    }

}
