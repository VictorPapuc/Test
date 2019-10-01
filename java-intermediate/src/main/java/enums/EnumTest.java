package enums;

public enum EnumTest {

    bucky("nice", "22"),
    kelsey("cutie", "10"),
    julia("bigmistake", "12");

    private final String desc;
    private final String y;

    EnumTest(String description, String year) {
        this.desc = description;
        this.y = year;
    }


    public String getDesc() {
        return desc;
    }

    public String getYear() {
        return y;
    }
}
