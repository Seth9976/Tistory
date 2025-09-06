package x3;

import androidx.datastore.core.okio.OkioStorageConnection;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.Path;

public final class d extends ContinuationImpl {
    public OkioStorageConnection o;
    public Object p;
    public Path q;
    public Object r;
    public Object s;
    public final OkioStorageConnection t;
    public int u;

    public d(OkioStorageConnection okioStorageConnection0, Continuation continuation0) {
        this.t = okioStorageConnection0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.writeScope(null, this);
    }
}

