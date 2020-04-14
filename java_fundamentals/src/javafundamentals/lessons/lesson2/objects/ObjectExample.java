package javafundamentals.lessons.lesson2.objects;

public class ObjectExample {

    public int value;
    public double values;

    public void getInfo(int value, double values) {
        int i = 3;
        this.value = (int) values;
        this.values = value;
        if (i <value){
            System.out.println(values);
        }
    }
}
