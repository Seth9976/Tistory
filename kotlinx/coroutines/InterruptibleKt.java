package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sf.o0;
import sf.u;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A1\u0010\u0005\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function0;", "block", "runInterruptible", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InterruptibleKt {
    public static final Object access$runInterruptibleInExpectedContext(CoroutineContext coroutineContext0, Function0 function00) {
        try {
            Job job0 = JobKt.getJob(coroutineContext0);
            o0 o00 = new o0(job0);
            o00.c = job0.invokeOnCompletion(true, true, o00);
        alab1:
            while(true) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = o0.d;
                int v = atomicIntegerFieldUpdater0.get(o00);
                switch(v) {
                    case 0: {
                        if(!atomicIntegerFieldUpdater0.compareAndSet(o00, 0, 0)) {
                            break;
                        }
                        break alab1;
                    }
                    case 2: 
                    case 3: {
                        break alab1;
                    }
                    default: {
                        o0.b(v);
                        throw null;
                    }
                }
            }
            try {
                return function00.invoke();
            }
            finally {
                o00.a();
            }
        }
        catch(InterruptedException interruptedException0) {
        }
        throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(interruptedException0);
    }

    @Nullable
    public static final Object runInterruptible(@NotNull CoroutineContext coroutineContext0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        return BuildersKt.withContext(coroutineContext0, new u(function00, null), continuation0);
    }

    public static Object runInterruptible$default(CoroutineContext coroutineContext0, Function0 function00, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        return InterruptibleKt.runInterruptible(coroutineContext0, function00, continuation0);
    }
}

