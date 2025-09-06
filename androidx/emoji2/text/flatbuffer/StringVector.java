package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class StringVector extends BaseVector {
    public final Utf8 d;

    public StringVector() {
        this.d = Utf8.getDefault();
    }

    public StringVector __assign(int v, int v1, ByteBuffer byteBuffer0) {
        this.__reset(v, v1, byteBuffer0);
        return this;
    }

    public String get(int v) {
        return Table.__string(this.__element(v), this.bb, this.d);
    }
}

