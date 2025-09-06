package w3;

import androidx.datastore.core.MultiProcessCoordinator;
import java.io.FileInputStream;
import java.nio.channels.FileLock;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

public final class i0 extends ContinuationImpl {
    public Mutex o;
    public FileInputStream p;
    public FileLock q;
    public boolean r;
    public Object s;
    public final MultiProcessCoordinator t;
    public int u;

    public i0(MultiProcessCoordinator multiProcessCoordinator0, Continuation continuation0) {
        this.t = multiProcessCoordinator0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.tryLock(null, this);
    }
}

