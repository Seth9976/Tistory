package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001A\u001C\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001A0\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\bH\u0007\u001A2\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\nH\u0007¨\u0006\u000B"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Landroidx/lifecycle/LiveData;", "asLiveData", "timeout", "Ljava/time/Duration;", "context", "Lkotlin/coroutines/CoroutineContext;", "timeoutInMs", "", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "FlowLiveDataConversions")
public final class FlowLiveDataConversions {
    @NotNull
    public static final Flow asFlow(@NotNull LiveData liveData0) {
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        return FlowKt.conflate(FlowKt.callbackFlow(new t(liveData0, null)));
    }

    @JvmOverloads
    @NotNull
    public static final LiveData asLiveData(@NotNull Flow flow0) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        return FlowLiveDataConversions.asLiveData$default(flow0, null, 0L, 3, null);
    }

    @RequiresApi(26)
    @NotNull
    public static final LiveData asLiveData(@NotNull Flow flow0, @NotNull Duration duration0, @NotNull CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(duration0, "timeout");
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        return FlowLiveDataConversions.asLiveData(flow0, coroutineContext0, Api26Impl.INSTANCE.toMillis(duration0));
    }

    @JvmOverloads
    @NotNull
    public static final LiveData asLiveData(@NotNull Flow flow0, @NotNull CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        return FlowLiveDataConversions.asLiveData$default(flow0, coroutineContext0, 0L, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final LiveData asLiveData(@NotNull Flow flow0, @NotNull CoroutineContext coroutineContext0, long v) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        LiveData liveData0 = CoroutineLiveDataKt.liveData(coroutineContext0, v, new u(flow0, null));
        if(flow0 instanceof StateFlow) {
            if(ArchTaskExecutor.getInstance().isMainThread()) {
                liveData0.setValue(((StateFlow)flow0).getValue());
                return liveData0;
            }
            liveData0.postValue(((StateFlow)flow0).getValue());
        }
        return liveData0;
    }

    public static LiveData asLiveData$default(Flow flow0, Duration duration0, CoroutineContext coroutineContext0, int v, Object object0) {
        if((v & 2) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        return FlowLiveDataConversions.asLiveData(flow0, duration0, coroutineContext0);
    }

    public static LiveData asLiveData$default(Flow flow0, CoroutineContext coroutineContext0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v1 & 2) != 0) {
            v = 5000L;
        }
        return FlowLiveDataConversions.asLiveData(flow0, coroutineContext0, v);
    }
}

