package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

public final class d implements Sequence {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final Lambda d;

    public d(CharSequence charSequence0, int v, int v1, Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Intrinsics.checkNotNullParameter(function20, "getNextMatch");
        super();
        this.a = charSequence0;
        this.b = v;
        this.c = v1;
        this.d = (Lambda)function20;
    }

    @Override  // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new DelimitedRangesSequence.iterator.1(this);
    }
}

