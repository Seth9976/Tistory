package androidx.paging;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u000212BW\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\n\u0012\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00010\r\u0012\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001A\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001A\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001A\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001A\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR#\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00010\r8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R(\u0010-\u001A\u00020%8\u0006@\u0006X\u0086\u000E¢\u0006\u0018\n\u0004\b&\u0010\'\u0012\u0004\b,\u0010\u0015\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010/\u001A\u00020.8F¢\u0006\u0006\u001A\u0004\b/\u00100¨\u00063"}, d2 = {"Landroidx/paging/LegacyPageFetcher;", "", "K", "V", "Lkotlinx/coroutines/CoroutineScope;", "pagedListScope", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagingSource;", "source", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "fetchDispatcher", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "pageConsumer", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "keyProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/paging/PagedList$Config;Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/LegacyPageFetcher$PageConsumer;Landroidx/paging/LegacyPageFetcher$KeyProvider;)V", "", "trySchedulePrepend", "()V", "tryScheduleAppend", "retry", "detach", "b", "Landroidx/paging/PagedList$Config;", "getConfig", "()Landroidx/paging/PagedList$Config;", "c", "Landroidx/paging/PagingSource;", "getSource", "()Landroidx/paging/PagingSource;", "f", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "getPageConsumer", "()Landroidx/paging/LegacyPageFetcher$PageConsumer;", "Landroidx/paging/PagedList$LoadStateManager;", "i", "Landroidx/paging/PagedList$LoadStateManager;", "getLoadStateManager", "()Landroidx/paging/PagedList$LoadStateManager;", "setLoadStateManager", "(Landroidx/paging/PagedList$LoadStateManager;)V", "getLoadStateManager$annotations", "loadStateManager", "", "isDetached", "()Z", "KeyProvider", "PageConsumer", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LegacyPageFetcher {
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002R\u0014\u0010\u0003\u001A\u0004\u0018\u00018\u0002X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u0004\u0018\u00018\u0002X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/paging/LegacyPageFetcher$KeyProvider;", "K", "", "nextKey", "getNextKey", "()Ljava/lang/Object;", "prevKey", "getPrevKey", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface KeyProvider {
        @Nullable
        Object getNextKey();

        @Nullable
        Object getPrevKey();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002J\"\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0010\u0010\u0007\u001A\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00020\bH&J\u0018\u0010\t\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/paging/LegacyPageFetcher$PageConsumer;", "V", "", "onPageResult", "", "type", "Landroidx/paging/LoadType;", "page", "Landroidx/paging/PagingSource$LoadResult$Page;", "onStateChanged", "", "state", "Landroidx/paging/LoadState;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface PageConsumer {
        boolean onPageResult(@NotNull LoadType arg1, @NotNull Page arg2);

        void onStateChanged(@NotNull LoadType arg1, @NotNull LoadState arg2);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LoadType.values().length];
            try {
                arr_v[LoadType.PREPEND.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.APPEND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final CoroutineScope a;
    public final Config b;
    public final PagingSource c;
    public final CoroutineDispatcher d;
    public final CoroutineDispatcher e;
    public final PageConsumer f;
    public final KeyProvider g;
    public final AtomicBoolean h;
    public LoadStateManager i;

    public LegacyPageFetcher(@NotNull CoroutineScope coroutineScope0, @NotNull Config pagedList$Config0, @NotNull PagingSource pagingSource0, @NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull CoroutineDispatcher coroutineDispatcher1, @NotNull PageConsumer legacyPageFetcher$PageConsumer0, @NotNull KeyProvider legacyPageFetcher$KeyProvider0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "pagedListScope");
        Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
        Intrinsics.checkNotNullParameter(pagingSource0, "source");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(coroutineDispatcher1, "fetchDispatcher");
        Intrinsics.checkNotNullParameter(legacyPageFetcher$PageConsumer0, "pageConsumer");
        Intrinsics.checkNotNullParameter(legacyPageFetcher$KeyProvider0, "keyProvider");
        super();
        this.a = coroutineScope0;
        this.b = pagedList$Config0;
        this.c = pagingSource0;
        this.d = coroutineDispatcher0;
        this.e = coroutineDispatcher1;
        this.f = legacyPageFetcher$PageConsumer0;
        this.g = legacyPageFetcher$KeyProvider0;
        this.h = new AtomicBoolean(false);
        this.i = new LoadStateManager() {
            @Override  // androidx.paging.PagedList$LoadStateManager
            public void onStateChanged(@NotNull LoadType loadType0, @NotNull LoadState loadState0) {
                Intrinsics.checkNotNullParameter(loadType0, "type");
                Intrinsics.checkNotNullParameter(loadState0, "state");
                this.d.getPageConsumer().onStateChanged(loadType0, loadState0);
            }
        };
    }

    public final void a(LoadType loadType0, Page pagingSource$LoadResult$Page0) {
        if(this.isDetached()) {
            return;
        }
        if(this.f.onPageResult(loadType0, pagingSource$LoadResult$Page0)) {
            switch(WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()]) {
                case 1: {
                    this.c();
                    return;
                }
                case 2: {
                    this.b();
                    return;
                }
                default: {
                    throw new IllegalStateException("Can only fetch more during append/prepend");
                }
            }
        }
        this.i.setState(loadType0, (pagingSource$LoadResult$Page0.getData().isEmpty() ? NotLoading.Companion.getComplete$paging_common_release() : NotLoading.Companion.getIncomplete$paging_common_release()));
    }

    public static final void access$onLoadError(LegacyPageFetcher legacyPageFetcher0, LoadType loadType0, Throwable throwable0) {
        if(!legacyPageFetcher0.isDetached()) {
            Error loadState$Error0 = new Error(throwable0);
            legacyPageFetcher0.i.setState(loadType0, loadState$Error0);
        }
    }

    public static final void access$onLoadInvalid(LegacyPageFetcher legacyPageFetcher0) {
        legacyPageFetcher0.c.invalidate();
        legacyPageFetcher0.detach();
    }

    public final void b() {
        Object object0 = this.g.getNextKey();
        if(object0 == null) {
            Page pagingSource$LoadResult$Page0 = Page.Companion.empty$paging_common_release();
            this.a(LoadType.APPEND, pagingSource$LoadResult$Page0);
            return;
        }
        this.i.setState(LoadType.APPEND, Loading.INSTANCE);
        p p0 = new p(this, new Append(object0, this.b.pageSize, this.b.enablePlaceholders), LoadType.APPEND, null);
        BuildersKt.launch$default(this.a, this.e, null, p0, 2, null);
    }

    public final void c() {
        Object object0 = this.g.getPrevKey();
        if(object0 == null) {
            Page pagingSource$LoadResult$Page0 = Page.Companion.empty$paging_common_release();
            this.a(LoadType.PREPEND, pagingSource$LoadResult$Page0);
            return;
        }
        this.i.setState(LoadType.PREPEND, Loading.INSTANCE);
        p p0 = new p(this, new Prepend(object0, this.b.pageSize, this.b.enablePlaceholders), LoadType.PREPEND, null);
        BuildersKt.launch$default(this.a, this.e, null, p0, 2, null);
    }

    public final void detach() {
        this.h.set(true);
    }

    @NotNull
    public final Config getConfig() {
        return this.b;
    }

    @NotNull
    public final LoadStateManager getLoadStateManager() {
        return this.i;
    }

    public static void getLoadStateManager$annotations() {
    }

    @NotNull
    public final PageConsumer getPageConsumer() {
        return this.f;
    }

    @NotNull
    public final PagingSource getSource() {
        return this.c;
    }

    public final boolean isDetached() {
        return this.h.get();
    }

    public final void retry() {
        if(this.i.getStartState() instanceof Error) {
            this.c();
        }
        if(this.i.getEndState() instanceof Error) {
            this.b();
        }
    }

    public final void setLoadStateManager(@NotNull LoadStateManager pagedList$LoadStateManager0) {
        Intrinsics.checkNotNullParameter(pagedList$LoadStateManager0, "<set-?>");
        this.i = pagedList$LoadStateManager0;
    }

    public final void tryScheduleAppend() {
        LoadState loadState0 = this.i.getEndState();
        if(loadState0 instanceof NotLoading && !loadState0.getEndOfPaginationReached()) {
            this.b();
        }
    }

    public final void trySchedulePrepend() {
        LoadState loadState0 = this.i.getStartState();
        if(loadState0 instanceof NotLoading && !loadState0.getEndOfPaginationReached()) {
            this.c();
        }
    }
}

