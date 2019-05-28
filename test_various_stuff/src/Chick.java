import javax.xml.bind.SchemaOutputResolver;

public class Chick {


    public void dothis(boolean hungry) {


        if (hungry) {
            int biteOfCheese = 2;
            {
                boolean teenyBit = true;
                System.out.println(biteOfCheese);
            }
        }


    }


    int i3, i4;

    String s1, s2;


    String s3 = "sss", s4 = "ss", s9 = "ssss";

    {
        System.out.println(s1 + s2 + s3 + s4 + s9);
    }


    public int ss(int r) {
        return r;
    }


    private String chick = "Chick";

    {
        System.out.println("Setting field");
        System.out.println(chick);
    }

    public Chick() {

        chick = "Tommy";
        System.out.println("Setting Constuctor");
    }

    public static void main(String[] args) {


        Chick chic = new Chick();
        {
            System.out.println(chic.chick);
        }


    }
}
