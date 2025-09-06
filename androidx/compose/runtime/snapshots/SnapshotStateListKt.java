package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotStateListKt {
    public static final Object a;

    static {
        SnapshotStateListKt.a = new Object();
    }

    public static final Void access$invalidIteratorSet() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    public static final Void access$modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final void access$validateRange(int v, int v1) {
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("index (" + v + ") is out of bound of [0, " + v1 + ')');
        }
    }
}

