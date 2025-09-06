package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u001D\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\f8F¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/DataStoreInMemoryCache;", "T", "", "<init>", "()V", "Landroidx/datastore/core/State;", "newState", "tryUpdate", "(Landroidx/datastore/core/State;)Landroidx/datastore/core/State;", "getCurrentState", "()Landroidx/datastore/core/State;", "currentState", "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "flow", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDataStoreInMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreInMemoryCache.kt\nandroidx/datastore/core/DataStoreInMemoryCache\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,79:1\n198#2,5:80\n*S KotlinDebug\n*F\n+ 1 DataStoreInMemoryCache.kt\nandroidx/datastore/core/DataStoreInMemoryCache\n*L\n45#1:80,5\n*E\n"})
public final class DataStoreInMemoryCache {
    public final MutableStateFlow a;

    public DataStoreInMemoryCache() {
        Intrinsics.checkNotNull(UnInitialized.INSTANCE, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.a = StateFlowKt.MutableStateFlow(UnInitialized.INSTANCE);
    }

    @NotNull
    public final State getCurrentState() {
        return (State)this.a.getValue();
    }

    @NotNull
    public final Flow getFlow() {
        return this.a;
    }

    @NotNull
    public final State tryUpdate(@NotNull State state0) {
        State state1;
        Intrinsics.checkNotNullParameter(state0, "newState");
        do {
            MutableStateFlow mutableStateFlow0 = this.a;
            Object object0 = mutableStateFlow0.getValue();
            state1 = (State)object0;
            if((state1 instanceof ReadException ? true : Intrinsics.areEqual(state1, UnInitialized.INSTANCE))) {
                state1 = state0;
            }
            else if(!(state1 instanceof Data)) {
                if(!(state1 instanceof Final)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            else if(state0.getVersion() > state1.getVersion()) {
                state1 = state0;
            }
        }
        while(!mutableStateFlow0.compareAndSet(object0, state1));
        return state1;
    }
}

