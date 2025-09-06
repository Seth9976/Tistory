package w3;

import androidx.datastore.core.FileStorageConnection;
import androidx.datastore.core.FileWriteScope;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class e0 extends ContinuationImpl {
    public FileStorageConnection o;
    public Object p;
    public Object q;
    public FileWriteScope r;
    public Object s;
    public final FileStorageConnection t;
    public int u;

    public e0(FileStorageConnection fileStorageConnection0, Continuation continuation0) {
        this.t = fileStorageConnection0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.writeScope(null, this);
    }
}

