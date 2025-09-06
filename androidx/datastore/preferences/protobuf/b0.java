package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

public final class b0 extends a0 {
    public final ByteBuffer i;
    public final int j;

    public b0(ByteBuffer byteBuffer0) {
        super(byteBuffer0.array(), byteBuffer0.position() + byteBuffer0.arrayOffset(), byteBuffer0.remaining());
        this.i = byteBuffer0;
        this.j = byteBuffer0.position();
    }

    @Override  // androidx.datastore.preferences.protobuf.a0
    public final void flush() {
        this.i.position(this.getTotalBytesWritten() + this.j);
    }
}

