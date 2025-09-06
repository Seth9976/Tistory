package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00028\u0000H¦@¢\u0006\u0002\u0010\tJ\u001C\u0010\n\u001A\u00020\u000B2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\rH¦@¢\u0006\u0002\u0010\u000ER\u0014\u0010\u0003\u001A\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000FÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "T", "", "latestValue", "getLatestValue", "()Ljava/lang/Object;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSource", "Lkotlinx/coroutines/DisposableHandle;", "source", "Landroidx/lifecycle/LiveData;", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LiveDataScope {
    @Nullable
    Object emit(Object arg1, @NotNull Continuation arg2);

    @Nullable
    Object emitSource(@NotNull LiveData arg1, @NotNull Continuation arg2);

    @Nullable
    Object getLatestValue();
}

