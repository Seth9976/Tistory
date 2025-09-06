package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001C\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007\b\u0000¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00028\u0000H¦@¢\u0006\u0002\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00052\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0086@¢\u0006\u0002\u0010\u000BJ\u001C\u0010\b\u001A\u00020\u00052\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\rH¦@¢\u0006\u0002\u0010\u000EJ\u001C\u0010\b\u001A\u00020\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/sequences/SequenceScope;", "T", "", "()V", "yield", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "elements", "", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "iterator", "", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.3")
@RestrictsSuspension
public abstract class SequenceScope {
    @Nullable
    public abstract Object yield(Object arg1, @NotNull Continuation arg2);

    @Nullable
    public final Object yieldAll(@NotNull Iterable iterable0, @NotNull Continuation continuation0) {
        if(iterable0 instanceof Collection && ((Collection)iterable0).isEmpty()) {
            return Unit.INSTANCE;
        }
        Object object0 = this.yieldAll(iterable0.iterator(), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public abstract Object yieldAll(@NotNull Iterator arg1, @NotNull Continuation arg2);

    @Nullable
    public final Object yieldAll(@NotNull Sequence sequence0, @NotNull Continuation continuation0) {
        Object object0 = this.yieldAll(sequence0.iterator(), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

