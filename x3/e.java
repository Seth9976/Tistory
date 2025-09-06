package x3;

import androidx.datastore.core.okio.OkioWriteScope;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.BufferedSink;
import okio.FileHandle;

public final class e extends ContinuationImpl {
    public FileHandle o;
    public FileHandle p;
    public BufferedSink q;
    public Object r;
    public final OkioWriteScope s;
    public int t;

    public e(OkioWriteScope okioWriteScope0, Continuation continuation0) {
        this.s = okioWriteScope0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.writeData(null, this);
    }
}

