package androidx.paging;

import androidx.activity.c0;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u0019\u001A\u001BB[\u0012(\u0010\u0007\u001A$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\b\u0010\b\u001A\u0004\u0018\u00018\u0000\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0016\b\u0002\u0010\f\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000B¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0018\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u001C"}, d2 = {"Landroidx/paging/PageFetcher;", "", "Key", "Value", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "initialKey", "Landroidx/paging/PagingConfig;", "config", "Landroidx/paging/RemoteMediator;", "remoteMediator", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/paging/PagingConfig;Landroidx/paging/RemoteMediator;)V", "", "refresh", "()V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "f", "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "flow", "s4/g0", "PagerHintReceiver", "PagerUiReceiver", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPageFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher\n+ 2 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n*L\n1#1,256:1\n32#2,10:257\n*S KotlinDebug\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher\n*L\n227#1:257,10\n*E\n"})
public final class PageFetcher {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0004B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/paging/PageFetcher$PagerHintReceiver;", "", "Key", "Value", "Landroidx/paging/HintReceiver;", "Landroidx/paging/PageFetcherSnapshot;", "pageFetcherSnapshot", "<init>", "(Landroidx/paging/PageFetcher;Landroidx/paging/PageFetcherSnapshot;)V", "Landroidx/paging/ViewportHint;", "viewportHint", "", "accessHint", "(Landroidx/paging/ViewportHint;)V", "a", "Landroidx/paging/PageFetcherSnapshot;", "getPageFetcherSnapshot$paging_common_release", "()Landroidx/paging/PageFetcherSnapshot;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public final class PagerHintReceiver implements HintReceiver {
        public final PageFetcherSnapshot a;

        public PagerHintReceiver(@NotNull PageFetcherSnapshot pageFetcherSnapshot0) {
            Intrinsics.checkNotNullParameter(pageFetcherSnapshot0, "pageFetcherSnapshot");
            super();
            this.a = pageFetcherSnapshot0;
        }

        @Override  // androidx.paging.HintReceiver
        public void accessHint(@NotNull ViewportHint viewportHint0) {
            Intrinsics.checkNotNullParameter(viewportHint0, "viewportHint");
            this.a.accessHint(viewportHint0);
        }

        @VisibleForTesting
        @NotNull
        public final PageFetcherSnapshot getPageFetcherSnapshot$paging_common_release() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/paging/PageFetcher$PagerUiReceiver;", "Landroidx/paging/UiReceiver;", "Landroidx/paging/ConflatedEventBus;", "", "retryEventBus", "<init>", "(Landroidx/paging/PageFetcher;Landroidx/paging/ConflatedEventBus;)V", "retry", "()V", "refresh", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public final class PagerUiReceiver implements UiReceiver {
        public final ConflatedEventBus a;
        public final PageFetcher b;

        public PagerUiReceiver(@NotNull ConflatedEventBus conflatedEventBus0) {
            Intrinsics.checkNotNullParameter(conflatedEventBus0, "retryEventBus");
            this.b = pageFetcher0;
            super();
            this.a = conflatedEventBus0;
        }

        @Override  // androidx.paging.UiReceiver
        public void refresh() {
            this.b.refresh();
        }

        @Override  // androidx.paging.UiReceiver
        public void retry() {
            this.a.send(Unit.INSTANCE);
        }
    }

    public final Function1 a;
    public final Object b;
    public final PagingConfig c;
    public final ConflatedEventBus d;
    public final ConflatedEventBus e;
    public final Flow f;

    public PageFetcher(@NotNull Function1 function10, @Nullable Object object0, @NotNull PagingConfig pagingConfig0, @Nullable RemoteMediator remoteMediator0) {
        Intrinsics.checkNotNullParameter(function10, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(pagingConfig0, "config");
        super();
        this.a = function10;
        this.b = object0;
        this.c = pagingConfig0;
        this.d = new ConflatedEventBus(null, 1, null);
        this.e = new ConflatedEventBus(null, 1, null);
        this.f = SimpleChannelFlowKt.simpleChannelFlow(new j0(remoteMediator0, this, null));
    }

    public PageFetcher(Function1 function10, Object object0, PagingConfig pagingConfig0, RemoteMediator remoteMediator0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            remoteMediator0 = null;
        }
        this(function10, object0, pagingConfig0, remoteMediator0);
    }

    public static final Object access$generateNewPagingSource(PageFetcher pageFetcher0, PagingSource pagingSource0, Continuation continuation0) {
        s4.j0 j00;
        pageFetcher0.getClass();
        if(continuation0 instanceof s4.j0) {
            j00 = (s4.j0)continuation0;
            int v = j00.s;
            if((v & 0x80000000) == 0) {
                j00 = new s4.j0(pageFetcher0, continuation0);
            }
            else {
                j00.s = v ^ 0x80000000;
            }
        }
        else {
            j00 = new s4.j0(pageFetcher0, continuation0);
        }
        Object object0 = j00.q;
        PagingSource pagingSource1 = a.getCOROUTINE_SUSPENDED();
        switch(j00.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                j00.o = pageFetcher0;
                j00.p = pagingSource0;
                j00.s = 1;
                object0 = pageFetcher0.a.invoke(j00);
                if(object0 == pagingSource1) {
                    return pagingSource1;
                }
                break;
            }
            case 1: {
                pagingSource0 = j00.p;
                pageFetcher0 = j00.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        pagingSource1 = (PagingSource)object0;
        if(pagingSource1 instanceof CompatLegacyPagingSource) {
            ((CompatLegacyPagingSource)pagingSource1).setPageSize(pageFetcher0.c.pageSize);
        }
        if(pagingSource1 == pagingSource0) {
            throw new IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
        }
        pagingSource1.registerInvalidatedCallback(new c0(0, pageFetcher0, PageFetcher.class, "invalidate", "invalidate()V", 0, 15));
        if(pagingSource0 != null) {
            pagingSource0.unregisterInvalidatedCallback(new c0(0, pageFetcher0, PageFetcher.class, "invalidate", "invalidate()V", 0, 16));
        }
        if(pagingSource0 != null) {
            pagingSource0.invalidate();
        }
        PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
        if(pagingLogger0.isLoggable(3)) {
            pagingLogger0.log(3, "Generated new PagingSource " + pagingSource1, null);
        }
        return pagingSource1;
    }

    public static final Flow access$injectRemoteEvents(PageFetcher pageFetcher0, PageFetcherSnapshot pageFetcherSnapshot0, Job job0, RemoteMediatorAccessor remoteMediatorAccessor0) {
        pageFetcher0.getClass();
        return remoteMediatorAccessor0 == null ? pageFetcherSnapshot0.getPageEventFlow() : CancelableChannelFlowKt.cancelableChannelFlow(job0, new k0(remoteMediatorAccessor0, pageFetcherSnapshot0, new MutableLoadStateCollection(), null));
    }

    public static final void access$invalidate(PageFetcher pageFetcher0) {
        pageFetcher0.d.send(Boolean.FALSE);
    }

    @NotNull
    public final Flow getFlow() {
        return this.f;
    }

    public final void refresh() {
        this.d.send(Boolean.TRUE);
    }
}

