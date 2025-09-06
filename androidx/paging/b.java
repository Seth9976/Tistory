package androidx.paging;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

public final class b {
    public final ReentrantLock a;
    public final MutableStateFlow b;
    public final a c;

    public b() {
        this.a = new ReentrantLock();
        this.b = StateFlowKt.MutableStateFlow(LoadStates.Companion.getIDLE());
        this.c = new a();
    }

    public final Object a(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        try {
            this.a.lock();
            Object object0 = function10.invoke(this.c);
            LoadState loadState0 = this.c.b(LoadType.REFRESH);
            LoadState loadState1 = this.c.b(LoadType.APPEND);
            LoadStates loadStates0 = new LoadStates(loadState0, this.c.b(LoadType.PREPEND), loadState1);
            this.b.setValue(loadStates0);
            return object0;
        }
        finally {
            this.a.unlock();
        }
    }
}

