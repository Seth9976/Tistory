package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AZ\u0010\u0002\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2-\u0010\t\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\n¢\u0006\u0002\b\u000FH\u0007¢\u0006\u0002\u0010\u0010\u001A\\\u0010\u0002\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\u0011\u001A\u00020\u00012-\u0010\t\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\n¢\u0006\u0002\b\u000FH\u0007¢\u0006\u0002\u0010\u0012\u001A,\u0010\u0013\u001A\u00020\u0014\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00152\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0080@¢\u0006\u0002\u0010\u0017\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000*`\b\u0000\u0010\u0018\u001A\u0004\b\u0000\u0010\u0004\")\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\n¢\u0006\u0002\b\u000F2)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\n¢\u0006\u0002\b\u000F¨\u0006\u0019"}, d2 = {"DEFAULT_TIMEOUT", "", "liveData", "Landroidx/lifecycle/LiveData;", "T", "timeout", "Ljava/time/Duration;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/time/Duration;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "timeoutInMs", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "addDisposableSource", "Landroidx/lifecycle/EmittedSource;", "Landroidx/lifecycle/MediatorLiveData;", "source", "(Landroidx/lifecycle/MediatorLiveData;Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Block", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000L;

    @Nullable
    public static final Object addDisposableSource(@NotNull MediatorLiveData mediatorLiveData0, @NotNull LiveData liveData0, @NotNull Continuation continuation0) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new j(mediatorLiveData0, liveData0, null), continuation0);
    }

    @RequiresApi(26)
    @JvmOverloads
    @NotNull
    public static final LiveData liveData(@NotNull Duration duration0, @NotNull CoroutineContext coroutineContext0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(duration0, "timeout");
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        Intrinsics.checkNotNullParameter(function20, "block");
        return new CoroutineLiveData(coroutineContext0, Api26Impl.INSTANCE.toMillis(duration0), function20);
    }

    @RequiresApi(26)
    @JvmOverloads
    @NotNull
    public static final LiveData liveData(@NotNull Duration duration0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(duration0, "timeout");
        Intrinsics.checkNotNullParameter(function20, "block");
        return CoroutineLiveDataKt.liveData$default(duration0, null, function20, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final LiveData liveData(@NotNull CoroutineContext coroutineContext0, long v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        Intrinsics.checkNotNullParameter(function20, "block");
        return new CoroutineLiveData(coroutineContext0, v, function20);
    }

    @JvmOverloads
    @NotNull
    public static final LiveData liveData(@NotNull CoroutineContext coroutineContext0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        Intrinsics.checkNotNullParameter(function20, "block");
        return CoroutineLiveDataKt.liveData$default(coroutineContext0, 0L, function20, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final LiveData liveData(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        return CoroutineLiveDataKt.liveData$default(null, 0L, function20, 3, null);
    }

    public static LiveData liveData$default(Duration duration0, CoroutineContext coroutineContext0, Function2 function20, int v, Object object0) {
        if((v & 2) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        return CoroutineLiveDataKt.liveData(duration0, coroutineContext0, function20);
    }

    public static LiveData liveData$default(CoroutineContext coroutineContext0, long v, Function2 function20, int v1, Object object0) {
        if((v1 & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v1 & 2) != 0) {
            v = 5000L;
        }
        return CoroutineLiveDataKt.liveData(coroutineContext0, v, function20);
    }
}

