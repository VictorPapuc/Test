package buildercore.builder.code;


import buildercore.builder.setup.Account;
import buildercore.builder.setup.Adress;
import buildercore.builder.setup.Name;
import com.google.common.collect.ImmutableList;

public class App {

    public static void main(String[] args) {

        Name name = new Name.Builder()
                .firstName("philip")
                .middleName(ImmutableList.of("peter"))
                .surName("starrit")
                .build();

        Adress adress = new Adress.Builder()
                .city("Suceava")
                .houseNumber(26)
                .street("Biruinew")
                .zipCode("21221")
                .build();


        Account account = new Account.Builder()
                .adress(adress)
                .email("bakak@gnauk.com")
                .name(name)
                .id(12).build();
    }
}
