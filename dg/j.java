package dg;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.sync.SemaphoreKt;

public final class j extends Segment {
    public final AtomicReferenceArray d;

    public j(long v, j j0, int v1) {
        super(v, j0, v1);
        this.d = new AtomicReferenceArray(16);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.coroutines.internal.Segment
    public final int getNumberOfSlots() {
        return 16;
    }

    @Override  // kotlinx.coroutines.internal.Segment
    public final void onCancellation(int v, Throwable throwable0, CoroutineContext coroutineContext0) {
        this.d.set(v, SemaphoreKt.access$getCANCELLED$p());
        this.onSlotCleaned();
    }

    @Override
    public final String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + this.hashCode() + ']';
    }
}

