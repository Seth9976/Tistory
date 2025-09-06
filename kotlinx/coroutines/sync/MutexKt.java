package kotlinx.coroutines.sync;

import dg.f;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0017\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001AD\u0010\n\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\bH\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"", "locked", "Lkotlinx/coroutines/sync/Mutex;", "Mutex", "(Z)Lkotlinx/coroutines/sync/Mutex;", "T", "", "owner", "Lkotlin/Function0;", "action", "withLock", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class MutexKt {
    public static final Symbol a;
    public static final Symbol b;

    static {
        MutexKt.a = new Symbol("NO_OWNER");
        MutexKt.b = new Symbol("ALREADY_LOCKED_BY_OWNER");
    }

    @NotNull
    public static final Mutex Mutex(boolean z) {
        return new MutexImpl(z);
    }

    public static Mutex Mutex$default(boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return MutexKt.Mutex(z);
    }

    public static final Symbol access$getON_LOCK_ALREADY_LOCKED_BY_OWNER$p() {
        return MutexKt.b;
    }

    @Nullable
    public static final Object withLock(@NotNull Mutex mutex0, @Nullable Object object0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        f f0;
        if(continuation0 instanceof f) {
            f0 = (f)continuation0;
            int v = f0.s;
            if((v & 0x80000000) == 0) {
                f0 = new f(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                f0.s = v ^ 0x80000000;
            }
        }
        else {
            f0 = new f(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object1 = f0.r;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(f0.s) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                f0.o = mutex0;
                f0.p = object0;
                f0.q = function00;
                f0.s = 1;
                if(mutex0.lock(object0, f0) == object2) {
                    return object2;
                }
                break;
            }
            case 1: {
                function00 = f0.q;
                object0 = f0.p;
                mutex0 = f0.o;
                ResultKt.throwOnFailure(object1);
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
            mutex0.unlock(object0);
        }
    }

    public static Object withLock$default(Mutex mutex0, Object object0, Function0 function00, Continuation continuation0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = null;
        }
        mutex0.lock(object0, continuation0);
        try {
            return function00.invoke();
        }
        finally {
            mutex0.unlock(object0);
        }
    }
}

