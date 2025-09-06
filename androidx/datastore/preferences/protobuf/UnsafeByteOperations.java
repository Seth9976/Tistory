package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

public final class UnsafeByteOperations {
    public static ByteString unsafeWrap(ByteBuffer byteBuffer0) {
        return ByteString.f(byteBuffer0);
    }

    public static ByteString unsafeWrap(byte[] arr_b) {
        return new q(arr_b);
    }

    public static ByteString unsafeWrap(byte[] arr_b, int v, int v1) {
        return new o(arr_b, v, v1);
    }

    public static void unsafeWriteTo(ByteString byteString0, ByteOutput byteOutput0) throws IOException {
        byteString0.g(byteOutput0);
    }
}

