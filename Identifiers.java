import java.util.UUID;

public interface Identifiers {

    final UUID uuid = UUID.randomUUID();

    static void displayAll(){};
    static void displayOne(){};
}
