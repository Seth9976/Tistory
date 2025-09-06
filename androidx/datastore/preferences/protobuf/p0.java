package androidx.datastore.preferences.protobuf;

public final class p0 {
    public final MessageLite a;
    public final int b;

    public p0(int v, MessageLite messageLite0) {
        this.a = messageLite0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof p0 ? this.a == ((p0)object0).a && this.b == ((p0)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 0xFFFF + this.b;
    }
}

