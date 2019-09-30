package overriding;

public class B extends A {

    int i;

    @Override
    public void show() {

        super.show();
        System.out.println("in B");
    }
}
