import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class Bicycle {
    // Using AtomicInteger for thread-safe counter
    private static final AtomicInteger counter = new AtomicInteger(0);
    private final String name;
    private final String tag;

    public Bicycle(String name, String tag) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.tag = Objects.requireNonNull(tag, "Tag cannot be null");
        counter.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    // Static method to get the current counter value
    public static int getCounter() {
        return counter.get();
    }

    @Override
    public String toString() {
        return "Bicycle{name='" + name + "', tag='" + tag + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return Objects.equals(name, bicycle.name) && Objects.equals(tag, bicycle.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tag);
    }
}
