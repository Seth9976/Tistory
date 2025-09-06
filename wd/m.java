package wd;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.io.LinesSequence.iterator.1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class m implements Sequence {
    public final BufferedReader a;

    public m(BufferedReader bufferedReader0) {
        Intrinsics.checkNotNullParameter(bufferedReader0, "reader");
        super();
        this.a = bufferedReader0;
    }

    @Override  // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new LinesSequence.iterator.1(this);
    }
}

