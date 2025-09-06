package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.contracts.ExperimentalContracts;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\u001AH\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00010\u0006H\u0081\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"withTryLock", "R", "Lkotlinx/coroutines/sync/Mutex;", "owner", "", "block", "Lkotlin/Function1;", "", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class MutexUtilsKt {
    @ExperimentalContracts
    public static final Object withTryLock(@NotNull Mutex mutex0, @Nullable Object object0, @NotNull Function1 function10) {
        Object object1;
        Intrinsics.checkNotNullParameter(mutex0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        boolean z = mutex0.tryLock(object0);
        try {
            object1 = function10.invoke(Boolean.valueOf(z));
        }
        catch(Throwable throwable0) {
            if(z) {
                mutex0.unlock(object0);
            }
            throw throwable0;
        }
        if(z) {
            mutex0.unlock(object0);
        }
        return object1;
    }

    public static Object withTryLock$default(Mutex mutex0, Object object0, Function1 function10, int v, Object object1) {
        Object object2;
        if((v & 1) != 0) {
            object0 = null;
        }
        Intrinsics.checkNotNullParameter(mutex0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        boolean z = mutex0.tryLock(object0);
        try {
            object2 = function10.invoke(Boolean.valueOf(z));
        }
        catch(Throwable throwable0) {
            if(z) {
                mutex0.unlock(object0);
            }
            throw throwable0;
        }
        if(z) {
            mutex0.unlock(object0);
        }
        return object2;
    }
}

