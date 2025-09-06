package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import w3.o0;
import w3.p0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u001E\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001A&\u0010\u0004\u001A\u00020\u0005\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0006\u001A\u0002H\u0001H\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"readData", "T", "Landroidx/datastore/core/StorageConnection;", "(Landroidx/datastore/core/StorageConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "", "value", "(Landroidx/datastore/core/StorageConnection;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class StorageConnectionKt {
    @Nullable
    public static final Object readData(@NotNull StorageConnection storageConnection0, @NotNull Continuation continuation0) {
        return storageConnection0.readScope(new o0(3, null), continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
    }

    @Nullable
    public static final Object writeData(@NotNull StorageConnection storageConnection0, Object object0, @NotNull Continuation continuation0) {
        Object object1 = storageConnection0.writeScope(new p0(object0, null), continuation0);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }
}

