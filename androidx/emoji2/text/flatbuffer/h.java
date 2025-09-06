package androidx.emoji2.text.flatbuffer;

import kotlin.jvm.internal.Intrinsics;

public final class h extends IllegalArgumentException {
    public h(int v, int v1) {
        super("Unpaired surrogate at index " + v + " of " + v1);
    }

    public h(String s) {
        Intrinsics.checkNotNullParameter(s, "msg");
        super(s);
    }
}

