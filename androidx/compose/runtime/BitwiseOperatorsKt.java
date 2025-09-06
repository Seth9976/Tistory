package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001A\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0080\f\u001A\u0015\u0010\u0003\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0080\f¨\u0006\u0004"}, d2 = {"rol", "", "other", "ror", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class BitwiseOperatorsKt {
    public static final int rol(int v, int v1) {
        return Integer.rotateLeft(v, v1);
    }

    public static final int ror(int v, int v1) {
        return Integer.rotateRight(v, v1);
    }
}

