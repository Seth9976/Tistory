package androidx.datastore.core;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public Serializable o;
    public Iterator p;
    public Object q;
    public final Companion r;
    public int s;

    public b(Companion dataMigrationInitializer$Companion0, Continuation continuation0) {
        this.r = dataMigrationInitializer$Companion0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return Companion.access$runMigrations(this.r, null, null, this);
    }
}

