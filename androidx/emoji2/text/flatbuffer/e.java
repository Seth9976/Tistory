package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.util.Comparator;

public final class e implements Comparator {
    public final ByteBuffer a;
    public final Table b;

    public e(Table table0, ByteBuffer byteBuffer0) {
        this.b = table0;
        this.a = byteBuffer0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return this.b.keysCompare(((Integer)object0), ((Integer)object1), this.a);
    }
}

