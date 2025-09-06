package androidx.datastore.preferences.protobuf;

public final class o extends q {
    public final int e;
    public final int f;

    public o(byte[] arr_b, int v, int v1) {
        super(arr_b);
        ByteString.c(v, v + v1, arr_b.length);
        this.e = v;
        this.f = v1;
    }

    @Override  // androidx.datastore.preferences.protobuf.q
    public final byte byteAt(int v) {
        ByteString.b(v, this.f);
        return this.d[this.e + v];
    }

    @Override  // androidx.datastore.preferences.protobuf.q
    public final void copyToInternal(byte[] arr_b, int v, int v1, int v2) {
        System.arraycopy(this.d, this.e + v, arr_b, v1, v2);
    }

    @Override  // androidx.datastore.preferences.protobuf.q
    public final byte e(int v) {
        return this.d[this.e + v];
    }

    @Override  // androidx.datastore.preferences.protobuf.q
    public final int i() {
        return this.e;
    }

    @Override  // androidx.datastore.preferences.protobuf.q
    public final int size() {
        return this.f;
    }
}

