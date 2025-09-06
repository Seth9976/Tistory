package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000E\u0010\u0007\u001A\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u000E\u0010\n\u001A\u00020\bH¦@¢\u0006\u0002\u0010\tJ2\u0010\u000B\u001A\u0002H\f\"\u0004\b\u0000\u0010\f2\u001C\u0010\r\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000F\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000EH¦@¢\u0006\u0002\u0010\u0010J8\u0010\u0011\u001A\u0002H\f\"\u0004\b\u0000\u0010\f2\"\u0010\r\u001A\u001E\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000F\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H¦@¢\u0006\u0002\u0010\u0014R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/datastore/core/InterProcessCoordinator;", "", "updateNotifications", "Lkotlinx/coroutines/flow/Flow;", "", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/Flow;", "getVersion", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "lock", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface InterProcessCoordinator {
    @NotNull
    Flow getUpdateNotifications();

    @Nullable
    Object getVersion(@NotNull Continuation arg1);

    @Nullable
    Object incrementAndGetVersion(@NotNull Continuation arg1);

    @Nullable
    Object lock(@NotNull Function1 arg1, @NotNull Continuation arg2);

    @Nullable
    Object tryLock(@NotNull Function2 arg1, @NotNull Continuation arg2);
}

