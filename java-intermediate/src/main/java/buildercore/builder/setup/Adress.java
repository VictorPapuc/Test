package buildercore.builder.setup;

public class Adress {


    private final int houseNumber;
    private final String street;
    private final String zipCode;
    private final String city;

    private Adress(Builder builder) {
        this.city = builder.city;
        this.zipCode = builder.zipCode;
        this.street = builder.street;
        this.houseNumber = builder.houseNumber;

    }

    public static class Builder {

        private int houseNumber;
        private String street;
        private String zipCode;
        private String city;


        public Builder houseNumber(int houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Adress build() {
            return new Adress(this);
        }
    }


    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }


}
