package androidx.emoji2.text;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class x implements MetadataListReader.OpenTypeReader {
    public final byte[] a;
    public final ByteBuffer b;
    public final InputStream c;
    public long d;

    public x(InputStream inputStream0) {
        this.d = 0L;
        this.c = inputStream0;
        byte[] arr_b = new byte[4];
        this.a = arr_b;
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        this.b = byteBuffer0;
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
    }

    public final void a(int v) {
        if(this.c.read(this.a, 0, v) != v) {
            throw new IOException("read failed");
        }
        this.d += (long)v;
    }

    @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public final long getPosition() {
        return this.d;
    }

    @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public final int readTag() {
        this.b.position(0);
        this.a(4);
        return this.b.getInt();
    }

    @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public final long readUnsignedInt() {
        this.b.position(0);
        this.a(4);
        return ((long)this.b.getInt()) & 0xFFFFFFFFL;
    }

    @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public final int readUnsignedShort() {
        this.b.position(0);
        this.a(2);
        return this.b.getShort() & 0xFFFF;
    }

    @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public final void skip(int v) {
        while(v > 0) {
            int v1 = (int)this.c.skip(((long)v));
            if(v1 < 1) {
                throw new IOException("Skip didn\'t move at least 1 byte forward");
            }
            v -= v1;
            this.d += (long)v1;
        }
    }
}

