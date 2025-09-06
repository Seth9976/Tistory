package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;
import s4.k;
import s4.n;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u0010\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000E\u0010\u000FR#\u0010\u0015\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/paging/CachedPageEventFlow;", "", "T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PageEvent;", "src", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)V", "", "close", "()V", "Landroidx/paging/PageEvent$Insert;", "getCachedEvent$paging_common_release", "()Landroidx/paging/PageEvent$Insert;", "getCachedEvent", "e", "Lkotlinx/coroutines/flow/Flow;", "getDownstreamFlow", "()Lkotlinx/coroutines/flow/Flow;", "downstreamFlow", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CachedPageEventFlow {
    public final m a;
    public final MutableSharedFlow b;
    public final SharedFlow c;
    public final Job d;
    public final Flow e;

    public CachedPageEventFlow(@NotNull Flow flow0, @NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(flow0, "src");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        super();
        this.a = new m();
        MutableSharedFlow mutableSharedFlow0 = SharedFlowKt.MutableSharedFlow(1, 0x7FFFFFFF, BufferOverflow.SUSPEND);
        this.b = mutableSharedFlow0;
        this.c = FlowKt.onSubscription(mutableSharedFlow0, new n(this, null));
        s4.m m0 = new s4.m(flow0, this, null);
        Job job0 = BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.LAZY, m0, 1, null);
        job0.invokeOnCompletion(new h1(this, 2));
        this.d = job0;
        this.e = FlowKt.flow(new k(this, null));
    }

    public final void close() {
        DefaultImpls.cancel$default(this.d, null, 1, null);
    }

    @Nullable
    public final Insert getCachedEvent$paging_common_release() {
        PageEvent pageEvent0 = (PageEvent)CollectionsKt___CollectionsKt.firstOrNull(this.a.a.getAsEvents());
        return pageEvent0 == null || !(pageEvent0 instanceof Insert) || ((Insert)pageEvent0).getLoadType() != LoadType.REFRESH ? null : ((Insert)pageEvent0);
    }

    @NotNull
    public final Flow getDownstreamFlow() {
        return this.e;
    }
}

