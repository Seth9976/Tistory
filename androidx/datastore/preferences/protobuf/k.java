package androidx.datastore.preferences.protobuf;

import java.util.NoSuchElementException;

public final class k extends m {
    public int a;
    public final int b;
    public final ByteString c;

    public k(ByteString byteString0) {
        this.c = byteString0;
        this.a = 0;
        this.b = byteString0.size();
    }

    @Override
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString$ByteIterator
    public final byte nextByte() {
        int v = this.a;
        if(v >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = v + 1;
        return this.c.e(v);
    }
}

