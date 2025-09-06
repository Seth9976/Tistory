package w3;

import androidx.datastore.core.FileWriteScope;
import java.io.FileOutputStream;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class f0 extends ContinuationImpl {
    public FileOutputStream o;
    public FileOutputStream p;
    public Object q;
    public final FileWriteScope r;
    public int s;

    public f0(FileWriteScope fileWriteScope0, Continuation continuation0) {
        this.r = fileWriteScope0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.writeData(null, this);
    }
}

