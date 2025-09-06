package androidx.compose.animation.core;

import androidx.compose.foundation.layout.b4;
import androidx.compose.runtime.Stable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.n;
import t.o;
import t.p;

@Stable
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\n\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u001C\u0010\t\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000BJW\u0010\u0010\u001A\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u00042\u0006\u0010\r\u001A\u00028\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00052\'\u0010\t\u001A#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000E¢\u0006\u0002\b\u000FH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex;", "", "<init>", "()V", "R", "Landroidx/compose/animation/core/MutatePriority;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "mutate", "(Landroidx/compose/animation/core/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/animation/core/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t/n", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MutatorMutex {
    public static final int $stable;
    public final AtomicReference a;
    public final Mutex b;

    public MutatorMutex() {
        this.a = new AtomicReference(null);
        this.b = MutexKt.Mutex$default(false, 1, null);
    }

    public static final void access$tryMutateOrCancel(MutatorMutex mutatorMutex0, n n0) {
        while(true) {
            AtomicReference atomicReference0 = mutatorMutex0.a;
            n n1 = (n)atomicReference0.get();
            if(n1 != null && n0.a.compareTo(n1.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if(atomicReference0.compareAndSet(n1, n0)) {
                    if(n1 != null) {
                        b4 b40 = new b4("Mutation interrupted", 2);
                        n1.b.cancel(b40);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == n1);
        }
    }

    @Nullable
    public final Object mutate(@NotNull MutatePriority mutatePriority0, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        return CoroutineScopeKt.coroutineScope(new o(mutatePriority0, this, function10, null), continuation0);
    }

    public static Object mutate$default(MutatorMutex mutatorMutex0, MutatePriority mutatePriority0, Function1 function10, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return mutatorMutex0.mutate(mutatePriority0, function10, continuation0);
    }

    @Nullable
    public final Object mutateWith(Object object0, @NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return CoroutineScopeKt.coroutineScope(new p(mutatePriority0, this, function20, object0, null), continuation0);
    }

    public static Object mutateWith$default(MutatorMutex mutatorMutex0, Object object0, MutatePriority mutatePriority0, Function2 function20, Continuation continuation0, int v, Object object1) {
        if((v & 2) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return mutatorMutex0.mutateWith(object0, mutatePriority0, function20, continuation0);
    }
}

