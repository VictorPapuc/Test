package builder;

public class Account {

    private final int id;
    private final String email;
    private final Adress adress;
    private final Name name;

    private Account(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.adress = builder.adress;
        this.email = builder.email;
    }

    public static class Builder {

        private int id;
        private String email;
        private Adress adress;
        private Name name;

        public Builder id(final int id) {
            this.id = id;
            return this;
        }

        public Builder email(final String email) {
            this.email = email;
            return this;
        }

        public Builder adress(final Adress adress) {
            this.adress = adress;
            return this;
        }

        public Builder name(final Name name) {
            this.name = name;
            return this;
        }

        public Account build() {

            return new Account(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Adress getAdress() {
        return adress;
    }

    public Name getName() {
        return name;
    }

}
