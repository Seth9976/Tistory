package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

public final class n implements ByteArrayCopier {
    @Override  // androidx.datastore.preferences.protobuf.ByteString$ByteArrayCopier
    public final byte[] copyFrom(byte[] arr_b, int v, int v1) {
        return Arrays.copyOfRange(arr_b, v, v1 + v);
    }
}

