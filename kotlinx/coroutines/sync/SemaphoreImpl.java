package kotlinx.coroutines.sync;

import androidx.compose.foundation.text.selection.g1;
import dg.g;
import dg.h;
import dg.j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000B\u001A\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000B\u001A\u00020\n2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\n0\rH\u0005¢\u0006\u0004\b\u000B\u0010\u000FJ%\u0010\u0014\u001A\u00020\n2\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u00102\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001A\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u000B\u0010\u001C\u001A\u00020\u001B8\u0002X\u0082\u0004R\u000B\u0010\u001E\u001A\u00020\u001D8\u0002X\u0082\u0004R\u000B\u0010\u001F\u001A\u00020\u001D8\u0002X\u0082\u0004R\u0011\u0010\"\u001A\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004R\u0011\u0010#\u001A\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Semaphore;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "tryAcquire", "()Z", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuation;", "waiter", "(Lkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "", "ignoredParam", "onAcquireRegFunction", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "release", "()V", "getAvailablePermits", "()I", "availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "enqIdx", "Lkotlinx/atomicfu/AtomicRef;", "Ldg/j;", "head", "tail", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n205#1,10:411\n205#1,10:421\n1#2:398\n332#3,12:399\n72#4,3:431\n46#4,8:434\n72#4,3:445\n46#4,8:448\n375#5:442\n375#5:443\n367#5:444\n378#5:456\n367#5:457\n375#5:458\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n197#1:411,10\n221#1:421,10\n187#1:399,12\n289#1:431,3\n289#1:434,8\n322#1:445,3\n322#1:448,8\n293#1:442\n299#1:443\n313#1:444\n328#1:456\n334#1:457\n337#1:458\n*E\n"})
public class SemaphoreImpl implements Semaphore {
    @Volatile
    private volatile int _availablePermits;
    public final int a;
    public final g1 b;
    public static final AtomicReferenceFieldUpdater c;
    public static final AtomicLongFieldUpdater d;
    @Volatile
    private volatile long deqIdx;
    public static final AtomicReferenceFieldUpdater e;
    @Volatile
    private volatile long enqIdx;
    public static final AtomicLongFieldUpdater f;
    public static final AtomicIntegerFieldUpdater g;
    @Volatile
    @Nullable
    private volatile Object head;
    @Volatile
    @Nullable
    private volatile Object tail;

    static {
        SemaphoreImpl.c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head");
        SemaphoreImpl.d = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");
        SemaphoreImpl.e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");
        SemaphoreImpl.f = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");
        SemaphoreImpl.g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");
    }

    public SemaphoreImpl(int v, int v1) {
        this.a = v;
        if(v <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + v).toString());
        }
        if(v1 < 0 || v1 > v) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + v).toString());
        }
        j j0 = new j(0L, null, 2);
        this.head = j0;
        this.tail = j0;
        this._availablePermits = v - v1;
        this.b = new g1(this, 21);
    }

    public final Object a(Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0));
        try {
            if(!this.b(cancellableContinuationImpl0)) {
                this.acquire(cancellableContinuationImpl0);
            }
        }
        catch(Throwable throwable0) {
            cancellableContinuationImpl0.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw throwable0;
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static final Object access$acquireSlowPath(SemaphoreImpl semaphoreImpl0, Continuation continuation0) {
        return semaphoreImpl0.a(continuation0);
    }

    @Override  // kotlinx.coroutines.sync.Semaphore
    @Nullable
    public Object acquire(@NotNull Continuation continuation0) {
        do {
            int v = SemaphoreImpl.g.getAndDecrement(this);
        }
        while(v > this.a);
        if(v > 0) {
            return Unit.INSTANCE;
        }
        Unit unit0 = this.a(continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public final void acquire(@NotNull CancellableContinuation cancellableContinuation0) {
        do {
            do {
                int v = SemaphoreImpl.g.getAndDecrement(this);
            }
            while(v > this.a);
            if(v > 0) {
                cancellableContinuation0.resume(Unit.INSTANCE, this.b);
                return;
            }
            Intrinsics.checkNotNull(cancellableContinuation0, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
        }
        while(!this.b(((Waiter)cancellableContinuation0)));
    }

    public final boolean b(Waiter waiter0) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = SemaphoreImpl.e;
        j j0 = (j)atomicReferenceFieldUpdater0.get(this);
        long v = SemaphoreImpl.f.getAndIncrement(this);
        g g0 = g.a;
        while(true) {
            object0 = ConcurrentLinkedListKt.findSegmentInternal(j0, v / 16L, g0);
            if(SegmentOrClosed.isClosed-impl(object0)) {
                goto label_22;
            }
            Segment segment0 = SegmentOrClosed.getSegment-impl(object0);
            while(true) {
                Segment segment1 = (Segment)atomicReferenceFieldUpdater0.get(this);
                if(segment1.id >= segment0.id) {
                    goto label_22;
                }
                if(!segment0.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, segment1, segment0)) {
                        if(!segment1.decPointers$kotlinx_coroutines_core()) {
                            goto label_22;
                        }
                        segment1.remove();
                        goto label_22;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == segment1);
                if(segment0.decPointers$kotlinx_coroutines_core()) {
                    segment0.remove();
                }
            }
        }
        j j1 = (j)SegmentOrClosed.getSegment-impl(object0);
        AtomicReferenceArray atomicReferenceArray0 = j1.d;
        goto label_24;
    label_22:
        j1 = (j)SegmentOrClosed.getSegment-impl(object0);
        atomicReferenceArray0 = j1.d;
        do {
        label_24:
            if(atomicReferenceArray0.compareAndSet(((int)(v % 16L)), null, waiter0)) {
                waiter0.invokeOnCancellation(j1, ((int)(v % 16L)));
                return true;
            }
        }
        while(atomicReferenceArray0.get(((int)(v % 16L))) == null);
        Symbol symbol0 = SemaphoreKt.access$getPERMIT$p();
        Symbol symbol1 = SemaphoreKt.access$getTAKEN$p();
        AtomicReferenceArray atomicReferenceArray1 = j1.d;
        do {
            if(atomicReferenceArray1.compareAndSet(((int)(v % 16L)), symbol0, symbol1)) {
                if(waiter0 instanceof CancellableContinuation) {
                    Intrinsics.checkNotNull(waiter0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((CancellableContinuation)waiter0).resume(Unit.INSTANCE, this.b);
                    return true;
                }
                if(!(waiter0 instanceof SelectInstance)) {
                    throw new IllegalStateException(("unexpected: " + waiter0).toString());
                }
                ((SelectInstance)waiter0).selectInRegistrationPhase(Unit.INSTANCE);
                return true;
            }
        }
        while(atomicReferenceArray1.get(((int)(v % 16L))) == symbol0);
        return false;
    }

    @Override  // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
        return Math.max(SemaphoreImpl.g.get(this), 0);
    }

    public final void onAcquireRegFunction(@NotNull SelectInstance selectInstance0, @Nullable Object object0) {
        do {
            do {
                int v = SemaphoreImpl.g.getAndDecrement(this);
            }
            while(v > this.a);
            if(v > 0) {
                selectInstance0.selectInRegistrationPhase(Unit.INSTANCE);
                return;
            }
            Intrinsics.checkNotNull(selectInstance0, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
        }
        while(!this.b(((Waiter)selectInstance0)));
    }

    @Override  // kotlinx.coroutines.sync.Semaphore
    public void release() {
        Object object0;
        int v1;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0;
        while(true) {
            atomicIntegerFieldUpdater0 = SemaphoreImpl.g;
            int v = atomicIntegerFieldUpdater0.getAndIncrement(this);
            v1 = this.a;
            if(v >= v1) {
                break;
            }
            if(v >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = SemaphoreImpl.c;
            j j0 = (j)atomicReferenceFieldUpdater0.get(this);
            long v2 = SemaphoreImpl.d.getAndIncrement(this);
            h h0 = h.a;
        alab1:
            while(true) {
                object0 = ConcurrentLinkedListKt.findSegmentInternal(j0, v2 / 16L, h0);
                if(SegmentOrClosed.isClosed-impl(object0)) {
                    break;
                }
                Segment segment0 = SegmentOrClosed.getSegment-impl(object0);
                while(true) {
                    Segment segment1 = (Segment)atomicReferenceFieldUpdater0.get(this);
                    if(segment1.id >= segment0.id) {
                        break alab1;
                    }
                    if(!segment0.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        if(atomicReferenceFieldUpdater0.compareAndSet(this, segment1, segment0)) {
                            if(segment1.decPointers$kotlinx_coroutines_core()) {
                                segment1.remove();
                            }
                            break alab1;
                        }
                    }
                    while(atomicReferenceFieldUpdater0.get(this) == segment1);
                    if(segment0.decPointers$kotlinx_coroutines_core()) {
                        segment0.remove();
                    }
                }
            }
            j j1 = (j)SegmentOrClosed.getSegment-impl(object0);
            j1.cleanPrev();
            boolean z = false;
            if(Long.compare(j1.id, v2 / 16L) <= 0) {
                int v3 = (int)(v2 % 16L);
                AtomicReferenceArray atomicReferenceArray0 = j1.d;
                Object object1 = atomicReferenceArray0.getAndSet(v3, SemaphoreKt.b);
                if(object1 == null) {
                    int v4 = 0;
                    while(v4 < 100) {
                        if(atomicReferenceArray0.get(v3) != SemaphoreKt.c) {
                            ++v4;
                            continue;
                        }
                        z = true;
                        goto label_60;
                    }
                    Symbol symbol0 = SemaphoreKt.b;
                    Symbol symbol1 = SemaphoreKt.d;
                    do {
                        if(atomicReferenceArray0.compareAndSet(v3, symbol0, symbol1)) {
                            z = true;
                            break;
                        }
                    }
                    while(atomicReferenceArray0.get(v3) == symbol0);
                    z = !z;
                }
                else if(object1 != SemaphoreKt.e) {
                    if(object1 instanceof CancellableContinuation) {
                        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                        Object object2 = ((CancellableContinuation)object1).tryResume(Unit.INSTANCE, null, this.b);
                        if(object2 != null) {
                            ((CancellableContinuation)object1).completeResume(object2);
                            z = true;
                        }
                    }
                    else {
                        if(!(object1 instanceof SelectInstance)) {
                            throw new IllegalStateException(("unexpected: " + object1).toString());
                        }
                        z = ((SelectInstance)object1).trySelect(this, Unit.INSTANCE);
                    }
                }
            }
        label_60:
            if(z) {
                return;
            }
        }
        do {
            int v5 = atomicIntegerFieldUpdater0.get(this);
        }
        while(v5 > v1 && !atomicIntegerFieldUpdater0.compareAndSet(this, v5, v1));
        throw new IllegalStateException(("The number of released permits cannot be greater than " + v1).toString());
    }

    @Override  // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
        while(true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = SemaphoreImpl.g;
            int v = atomicIntegerFieldUpdater0.get(this);
            int v1 = this.a;
            if(v > v1) {
                do {
                    int v2 = atomicIntegerFieldUpdater0.get(this);
                }
                while(v2 > v1 && !atomicIntegerFieldUpdater0.compareAndSet(this, v2, v1));
            }
            else {
                if(v <= 0) {
                    return false;
                }
                if(atomicIntegerFieldUpdater0.compareAndSet(this, v, v - 1)) {
                    break;
                }
            }
        }
        return true;
    }
}

