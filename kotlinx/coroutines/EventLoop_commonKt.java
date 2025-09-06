package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0017\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0017\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003*\u001E\b\u0002\u0010\b\u001A\u0004\b\u0000\u0010\u0006\"\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0012\u0004\u0012\u00028\u00000\u0007¨\u0006\t"}, d2 = {"", "timeMillis", "delayToNanos", "(J)J", "timeNanos", "delayNanosToMillis", "T", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class EventLoop_commonKt {
    public static final Symbol a;
    public static final Symbol b;

    static {
        EventLoop_commonKt.a = new Symbol("REMOVED_TASK");
        EventLoop_commonKt.b = new Symbol("CLOSED_EMPTY");
    }

    public static final Symbol access$getCLOSED_EMPTY$p() {
        return EventLoop_commonKt.b;
    }

    public static final Symbol access$getDISPOSED_TASK$p() {
        return EventLoop_commonKt.a;
    }

    public static final long delayNanosToMillis(long v) [...] // Inlined contents

    public static final long delayToNanos(long v) {
        if(v > 0L) {
            return v < 0x8637BD05AF6L ? 1000000L * v : 0x7FFFFFFFFFFFFFFFL;
        }
        return 0L;
    }
}

