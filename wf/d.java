package wf;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt;

public final class d extends AbstractMutableSet {
    public final Lambda a;
    public final ConcurrentWeakMap b;

    public d(ConcurrentWeakMap concurrentWeakMap0, Function2 function20) {
        this.b = concurrentWeakMap0;
        super();
        this.a = (Lambda)function20;
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public final boolean add(Object object0) {
        ConcurrentWeakMapKt.access$noImpl();
        throw new KotlinNothingValueException();
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public final int getSize() {
        return this.b.size();
    }

    @Override
    public final Iterator iterator() {
        b b0 = (b)ConcurrentWeakMap.c.get(this.b);
        b0.getClass();
        return new a(b0, ((Function2)this.a));
    }
}

