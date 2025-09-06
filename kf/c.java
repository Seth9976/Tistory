package kf;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.GeneratorSequence.iterator.1;
import kotlin.sequences.Sequence;

public final class c implements Sequence {
    public final Function0 a;
    public final Function1 b;

    public c(Function0 function00, Function1 function10) {
        Intrinsics.checkNotNullParameter(function00, "getInitialValue");
        Intrinsics.checkNotNullParameter(function10, "getNextValue");
        super();
        this.a = function00;
        this.b = function10;
    }

    @Override  // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new GeneratorSequence.iterator.1(this);
    }
}

