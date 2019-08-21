package builder;

import java.util.List;

public class Name {

    private final String firstName;
    private final List<String> middleNames;
    private final String surName;

    private Name(Builder builder) {
        this.firstName = builder.firstName;
        this.middleNames = builder.middleNames;
        this.surName = builder.surName;
    }

    public static class Builder {

        private String firstName;
        private List<String> middleNames;
        private String surName;

        public Builder firstName(String firstname) {
            this.firstName = firstname;
            return this;
        }

        public Builder middleName(List<String> middlenames) {
            this.middleNames = middlenames;
            return this;
        }

        public Builder surName(String surnamae) {
            this.surName = surnamae;
            return this;
        }

        public Name build() {
            return new Name (this);
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public List<String> getMiddlenames() {
        return middleNames;
    }

    public String getSurnamae() {
        return surName;
    }


}
