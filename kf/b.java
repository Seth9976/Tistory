package kf;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import kotlin.sequences.DropTakeSequence;
import kotlin.sequences.Sequence;

public final class b implements DropTakeSequence, Sequence {
    public static final b a;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.sequences.DropTakeSequence
    public final Sequence drop(int v) {
        return b.a;
    }

    @Override  // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return EmptyIterator.INSTANCE;
    }

    @Override  // kotlin.sequences.DropTakeSequence
    public final Sequence take(int v) {
        return b.a;
    }
}

