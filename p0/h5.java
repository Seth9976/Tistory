package p0;

import androidx.compose.material.ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h5 extends ContinuationImpl {
    public long o;
    public Object p;
    public final ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1 q;
    public int r;

    public h5(ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1 modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$10, Continuation continuation0) {
        this.q = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.onPostFling-RZ2iAVY(0L, 0L, this);
    }
}

