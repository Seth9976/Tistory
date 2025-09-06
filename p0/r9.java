package p0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class r9 extends ContinuationImpl {
    public long o;
    public Object p;
    public final androidx.compose.material.SwipeableKt.PreUpPostDownNestedScrollConnection.1 q;
    public int r;

    public r9(androidx.compose.material.SwipeableKt.PreUpPostDownNestedScrollConnection.1 swipeableKt$PreUpPostDownNestedScrollConnection$10, Continuation continuation0) {
        this.q = swipeableKt$PreUpPostDownNestedScrollConnection$10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.onPreFling-QWom1Mo(0L, this);
    }
}

