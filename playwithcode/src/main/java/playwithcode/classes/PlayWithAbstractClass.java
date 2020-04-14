package playwithcode.classes;

import org.jetbrains.annotations.NotNull;
import playwithcode.interfaces.PlayWithInteface;

public abstract class PlayWithAbstractClass implements PlayWithInteface {

    public void startMethod(@NotNull String inputMessage) {
        inputMessage.equals("Method Begins");
        System.out.printf(inputMessage);
    }

}
