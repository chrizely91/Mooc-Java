public interface Saveable {

    public default void save() {}

    public default void delete() {}

    public default void load(String address) {}
}
