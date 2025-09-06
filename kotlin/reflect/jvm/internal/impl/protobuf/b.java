package kotlin.reflect.jvm.internal.impl.protobuf;

public final class b {
    public final MessageLite a;
    public final int b;

    public b(MessageLite messageLite0, int v) {
        this.a = messageLite0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof b ? this.a == ((b)object0).a && this.b == ((b)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 0xFFFF + this.b;
    }
}

