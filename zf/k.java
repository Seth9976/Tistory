package zf;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ThreadContextElement;

public final class k {
    public final CoroutineContext a;
    public final Object[] b;
    public final ThreadContextElement[] c;
    public int d;

    public k(CoroutineContext coroutineContext0, int v) {
        this.a = coroutineContext0;
        this.b = new Object[v];
        this.c = new ThreadContextElement[v];
    }
}

