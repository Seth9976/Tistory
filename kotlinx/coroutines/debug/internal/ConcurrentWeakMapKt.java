package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Symbol;
import wf.k;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ConcurrentWeakMapKt {
    public static final Symbol a;
    public static final k b;
    public static final k c;

    static {
        ConcurrentWeakMapKt.a = new Symbol("REHASH");
        ConcurrentWeakMapKt.b = new k(null);
        ConcurrentWeakMapKt.c = new k(Boolean.TRUE);
    }

    public static final k access$mark(Object object0) {
        if(object0 == null) {
            return ConcurrentWeakMapKt.b;
        }
        return Intrinsics.areEqual(object0, Boolean.TRUE) ? ConcurrentWeakMapKt.c : new k(object0);
    }

    public static final Void access$noImpl() {
        throw new UnsupportedOperationException("not implemented");
    }
}

