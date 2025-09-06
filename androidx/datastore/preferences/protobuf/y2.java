package androidx.datastore.preferences.protobuf;

import java.util.NoSuchElementException;

public final class y2 extends m {
    public final z2 a;
    public ByteIterator b;

    public y2(b3 b30) {
        this.a = new z2(b30);
        this.b = this.a();
    }

    // 去混淆评级： 低(20)
    public final ByteIterator a() {
        return this.a.hasNext() ? this.a.a().iterator() : null;
    }

    @Override
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString$ByteIterator
    public final byte nextByte() {
        ByteIterator byteString$ByteIterator0 = this.b;
        if(byteString$ByteIterator0 == null) {
            throw new NoSuchElementException();
        }
        byte b = byteString$ByteIterator0.nextByte();
        if(!this.b.hasNext()) {
            this.b = this.a();
        }
        return b;
    }
}

