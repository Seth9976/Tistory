package androidx.datastore.preferences.protobuf;

public final class r implements ByteArrayCopier {
    @Override  // androidx.datastore.preferences.protobuf.ByteString$ByteArrayCopier
    public final byte[] copyFrom(byte[] arr_b, int v, int v1) {
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        return arr_b1;
    }
}

