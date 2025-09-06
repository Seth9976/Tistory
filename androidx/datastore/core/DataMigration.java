package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000E\u0010\u0003\u001A\u00020\u0004H¦@¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00028\u0000H¦@¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00028\u0000H¦@¢\u0006\u0002\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/datastore/core/DataMigration;", "T", "", "cleanUp", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migrate", "currentData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldMigrate", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface DataMigration {
    @Nullable
    Object cleanUp(@NotNull Continuation arg1);

    @Nullable
    Object migrate(Object arg1, @NotNull Continuation arg2);

    @Nullable
    Object shouldMigrate(Object arg1, @NotNull Continuation arg2);
}

