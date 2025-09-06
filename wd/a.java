package wd;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

public final class a extends ByteArrayOutputStream {
    public final byte[] a() {
        byte[] arr_b = this.buf;
        Intrinsics.checkNotNullExpressionValue(arr_b, "buf");
        return arr_b;
    }
}

