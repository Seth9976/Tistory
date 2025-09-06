package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w0.w0;
import w0.x0;
import w0.y0;

@Stable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\n\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u001C\u0010\t\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000BJW\u0010\u0010\u001A\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u00042\u0006\u0010\r\u001A\u00028\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00052\'\u0010\t\u001A#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000E¢\u0006\u0002\b\u000FH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001B\u0010\u0015\u001A\u00020\u00142\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/internal/InternalMutatorMutex;", "", "<init>", "()V", "R", "Landroidx/compose/foundation/MutatePriority;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "mutate", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "", "tryMutate", "(Lkotlin/jvm/functions/Function0;)Z", "w0/w0", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InternalMutatorMutex {
    public static final int $stable;
    public final AtomicReference a;
    public final Mutex b;

    public InternalMutatorMutex() {
        this.a = new AtomicReference(null);
        this.b = MutexKt.Mutex$default(false, 1, null);
    }

    public static final void access$tryMutateOrCancel(InternalMutatorMutex internalMutatorMutex0, w0 w00) {
        while(true) {
            AtomicReference atomicReference0 = internalMutatorMutex0.a;
            w0 w01 = (w0)atomicReference0.get();
            if(w01 != null && w00.a.compareTo(w01.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if(atomicReference0.compareAndSet(w01, w00)) {
                    if(w01 != null) {
                        DefaultImpls.cancel$default(w01.b, null, 1, null);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == w01);
        }
    }

    @Nullable
    public final Object mutate(@NotNull MutatePriority mutatePriority0, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        return CoroutineScopeKt.coroutineScope(new x0(mutatePriority0, this, function10, null), continuation0);
    }

    public static Object mutate$default(InternalMutatorMutex internalMutatorMutex0, MutatePriority mutatePriority0, Function1 function10, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return internalMutatorMutex0.mutate(mutatePriority0, function10, continuation0);
    }

    @Nullable
    public final Object mutateWith(Object object0, @NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return CoroutineScopeKt.coroutineScope(new y0(mutatePriority0, this, function20, object0, null), continuation0);
    }

    public static Object mutateWith$default(InternalMutatorMutex internalMutatorMutex0, Object object0, MutatePriority mutatePriority0, Function2 function20, Continuation continuation0, int v, Object object1) {
        if((v & 2) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return internalMutatorMutex0.mutateWith(object0, mutatePriority0, function20, continuation0);
    }

    public final boolean tryMutate(@NotNull Function0 function00) {
        Mutex mutex0 = this.b;
        if(kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(mutex0, null, 1, null)) {
            try {
                function00.invoke();
                return true;
            }
            finally {
                kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex0, null, 1, null);
            }
        }
        return false;
    }
}

