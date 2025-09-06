package lf;

import java.util.Spliterators;
import java.util.function.Supplier;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class a implements Supplier {
    public final Sequence a;

    public a(Sequence sequence0) {
        this.a = sequence0;
    }

    @Override
    public final Object get() {
        Intrinsics.checkNotNullParameter(this.a, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(this.a.iterator(), 16);
    }
}

