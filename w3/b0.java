package w3;

import androidx.datastore.core.FileReadScope;
import java.io.FileInputStream;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b0 extends ContinuationImpl {
    public Object o;
    public FileInputStream p;
    public Object q;
    public final FileReadScope r;
    public int s;

    public b0(FileReadScope fileReadScope0, Continuation continuation0) {
        this.r = fileReadScope0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return FileReadScope.a(this.r, this);
    }
}

