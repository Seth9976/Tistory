package androidx.datastore.preferences.protobuf;

public abstract class m implements ByteIterator {
    @Override
    public final Object next() {
        return this.nextByte();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

