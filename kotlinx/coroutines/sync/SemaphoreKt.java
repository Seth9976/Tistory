package kotlinx.coroutines.sync;

import dg.i;
import dg.j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u001F\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001A8\u0010\t\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00032\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000B"}, d2 = {"", "permits", "acquiredPermits", "Lkotlinx/coroutines/sync/Semaphore;", "Semaphore", "(II)Lkotlinx/coroutines/sync/Semaphore;", "T", "Lkotlin/Function0;", "action", "withPermit", "(Lkotlinx/coroutines/sync/Semaphore;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SemaphoreKt {
    public static final int a;
    public static final Symbol b;
    public static final Symbol c;
    public static final Symbol d;
    public static final Symbol e;
    public static final int f;

    static {
        SemaphoreKt.a = SystemPropsKt.systemProp$default("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        SemaphoreKt.b = new Symbol("PERMIT");
        SemaphoreKt.c = new Symbol("TAKEN");
        SemaphoreKt.d = new Symbol("BROKEN");
        SemaphoreKt.e = new Symbol("CANCELLED");
        SemaphoreKt.f = SystemPropsKt.systemProp$default("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
    }

    @NotNull
    public static final Semaphore Semaphore(int v, int v1) {
        return new SemaphoreImpl(v, v1);
    }

    public static Semaphore Semaphore$default(int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return SemaphoreKt.Semaphore(v, v1);
    }

    public static final j access$createSegment(long v, j j0) {
        return new j(v, j0, 0);
    }

    public static final int access$getMAX_SPIN_CYCLES$p() [...] // 潜在的解密器

    public static final int access$getSEGMENT_SIZE$p() [...] // 潜在的解密器

    @Nullable
    public static final Object withPermit(@NotNull Semaphore semaphore0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        i i0;
        if(continuation0 instanceof i) {
            i0 = (i)continuation0;
            int v = i0.r;
            if((v & 0x80000000) == 0) {
                i0 = new i(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                i0.r = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = i0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                i0.o = semaphore0;
                i0.p = function00;
                i0.r = 1;
                if(semaphore0.acquire(i0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                function00 = i0.p;
                semaphore0 = i0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return function00.invoke();
        }
        finally {
            semaphore0.release();
        }
    }
}

