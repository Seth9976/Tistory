package kotlin.reflect.jvm.internal.impl.protobuf;

public class LazyField extends LazyFieldLite {
    @Override
    public boolean equals(Object object0) {
        return this.getValue().equals(object0);
    }

    public MessageLite getValue() {
        return this.getValue(null);
    }

    @Override
    public int hashCode() {
        return this.getValue().hashCode();
    }

    @Override
    public String toString() {
        return this.getValue().toString();
    }
}

