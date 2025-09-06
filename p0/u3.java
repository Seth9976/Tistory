package p0;

import androidx.compose.material.DrawerKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class u3 extends ContinuationImpl {
    public long o;
    public Object p;
    public final DrawerKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1 q;
    public int r;

    public u3(DrawerKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1 drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$10, Continuation continuation0) {
        this.q = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.onPreFling-QWom1Mo(0L, this);
    }
}

