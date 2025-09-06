package p0;

import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

public final class c9 extends ContinuationImpl {
    public SnackbarHostState o;
    public String p;
    public String q;
    public SnackbarDuration r;
    public Mutex s;
    public Object t;
    public final SnackbarHostState u;
    public int v;

    public c9(SnackbarHostState snackbarHostState0, Continuation continuation0) {
        this.u = snackbarHostState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.t = object0;
        this.v |= 0x80000000;
        return this.u.showSnackbar(null, null, null, this);
    }
}

