package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.datastore.preferences.protobuf.z2;

public final class j implements ByteIterator {
    public final z2 a;
    public h b;
    public int c;

    public j(k k0) {
        z2 z20 = new z2(k0);
        this.a = z20;
        this.b = new h(z20.b());
        this.c = k0.a;
    }

    @Override
    public final boolean hasNext() {
        return this.c > 0;
    }

    @Override
    public final Object next() {
        return this.nextByte();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator
    public final byte nextByte() {
        if(!this.b.hasNext()) {
            this.b = new h(this.a.b());
        }
        --this.c;
        return this.b.nextByte();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

