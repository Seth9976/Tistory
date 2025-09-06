package w3;

import androidx.datastore.core.FileReadScope;
import androidx.datastore.core.FileStorageConnection;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d0 extends ContinuationImpl {
    public FileStorageConnection o;
    public FileReadScope p;
    public boolean q;
    public Object r;
    public final FileStorageConnection s;
    public int t;

    public d0(FileStorageConnection fileStorageConnection0, Continuation continuation0) {
        this.s = fileStorageConnection0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.readScope(null, this);
    }
}

