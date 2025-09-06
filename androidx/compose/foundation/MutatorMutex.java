package androidx.compose.foundation;

import androidx.compose.foundation.layout.b4;
import androidx.compose.runtime.Stable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex.DefaultImpls;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.r2;
import u.s2;
import u.t2;

@Stable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\n\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u001C\u0010\t\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000BJW\u0010\u0010\u001A\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u00042\u0006\u0010\r\u001A\u00028\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00052\'\u0010\t\u001A#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000E¢\u0006\u0002\b\u000FH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001E\u0010\u0015\u001A\u00020\u00142\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0013H\u0001¢\u0006\u0004\b\u0019\u0010\u0003¨\u0006\u001B"}, d2 = {"Landroidx/compose/foundation/MutatorMutex;", "", "<init>", "()V", "R", "Landroidx/compose/foundation/MutatePriority;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "mutate", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "", "tryMutate", "(Lkotlin/jvm/functions/Function0;)Z", "tryLock", "()Z", "unlock", "u/r2", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MutatorMutex {
    public static final int $stable;
    public final AtomicReference a;
    public final Mutex b;

    public MutatorMutex() {
        this.a = new AtomicReference(null);
        this.b = MutexKt.Mutex$default(false, 1, null);
    }

    public static final void access$tryMutateOrCancel(MutatorMutex mutatorMutex0, r2 r20) {
        while(true) {
            AtomicReference atomicReference0 = mutatorMutex0.a;
            r2 r21 = (r2)atomicReference0.get();
            if(r21 != null && r20.a.compareTo(r21.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if(atomicReference0.compareAndSet(r21, r20)) {
                    if(r21 != null) {
                        b4 b40 = new b4("Mutation interrupted", 3);
                        r21.b.cancel(b40);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == r21);
        }
    }

    @Nullable
    public final Object mutate(@NotNull MutatePriority mutatePriority0, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        return CoroutineScopeKt.coroutineScope(new s2(mutatePriority0, this, function10, null), continuation0);
    }

    public static Object mutate$default(MutatorMutex mutatorMutex0, MutatePriority mutatePriority0, Function1 function10, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return mutatorMutex0.mutate(mutatePriority0, function10, continuation0);
    }

    @Nullable
    public final Object mutateWith(Object object0, @NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return CoroutineScopeKt.coroutineScope(new t2(mutatePriority0, this, function20, object0, null), continuation0);
    }

    public static Object mutateWith$default(MutatorMutex mutatorMutex0, Object object0, MutatePriority mutatePriority0, Function2 function20, Continuation continuation0, int v, Object object1) {
        if((v & 2) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return mutatorMutex0.mutateWith(object0, mutatePriority0, function20, continuation0);
    }

    @PublishedApi
    public final boolean tryLock() {
        return DefaultImpls.tryLock$default(this.b, null, 1, null);
    }

    public final boolean tryMutate(@NotNull Function0 function00) {
        if(this.tryLock()) {
            try {
                function00.invoke();
                return true;
            }
            finally {
                this.unlock();
            }
        }
        return false;
    }

    @PublishedApi
    public final void unlock() {
        DefaultImpls.unlock$default(this.b, null, 1, null);
    }
}

