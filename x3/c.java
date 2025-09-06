package x3;

import androidx.datastore.core.okio.OkioReadScope;
import androidx.datastore.core.okio.OkioStorageConnection;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class c extends ContinuationImpl {
    public OkioStorageConnection o;
    public OkioReadScope p;
    public boolean q;
    public Object r;
    public final OkioStorageConnection s;
    public int t;

    public c(OkioStorageConnection okioStorageConnection0, Continuation continuation0) {
        this.s = okioStorageConnection0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.readScope(null, this);
    }
}

