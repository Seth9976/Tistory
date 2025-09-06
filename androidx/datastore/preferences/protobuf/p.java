package androidx.datastore.preferences.protobuf;

public abstract class p extends ByteString {
    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public byte e(int v) {
        return this.byteAt(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final int getTreeDepth() {
        return 0;
    }

    public abstract boolean h(p arg1, int arg2, int arg3);

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final boolean isBalanced() {
        return true;
    }
}

