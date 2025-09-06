package androidx.paging;

import androidx.annotation.CheckResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.y0;
import s4.z0;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000B\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001IJ\u0017\u0010\t\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\n\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00060\n\u00A2\u0006\u0004\b\r\u0010\fJ-\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00010\u000F*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000E2\u0006\u0010\u0005\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00042\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000EH\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u001B\u0010\u001B\u001A\u00020\u001A2\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00010\u0018\u00A2\u0006\u0004\b\u001B\u0010\u001CJ%\u0010\u001F\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00182\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001F\u0010 J%\u0010&\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#2\b\u0010\"\u001A\u0004\u0018\u00010!H\u0000\u00A2\u0006\u0004\b$\u0010%R,\u0010,\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000E0\'8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R$\u00102\u001A\u00020\u00062\u0006\u0010-\u001A\u00020\u00068\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R&\u00108\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001D038\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107R$\u0010>\u001A\u0002092\u0006\u0010-\u001A\u0002098\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R\u0014\u0010@\u001A\u00020\u00068@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b?\u00101R$\u0010E\u001A\u00020\u00062\u0006\u0010A\u001A\u00020\u00068@@@X\u0080\u000E\u00A2\u0006\f\u001A\u0004\bB\u00101\"\u0004\bC\u0010DR$\u0010H\u001A\u00020\u00062\u0006\u0010A\u001A\u00020\u00068@@@X\u0080\u000E\u00A2\u0006\f\u001A\u0004\bF\u00101\"\u0004\bG\u0010D\u00A8\u0006J"}, d2 = {"Landroidx/paging/PageFetcherSnapshotState;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "", "generationId$paging_common_release", "(Landroidx/paging/LoadType;)I", "generationId", "Lkotlinx/coroutines/flow/Flow;", "consumePrependGenerationIdAsFlow", "()Lkotlinx/coroutines/flow/Flow;", "consumeAppendGenerationIdAsFlow", "Landroidx/paging/PagingSource$LoadResult$Page;", "Landroidx/paging/PageEvent;", "toPageEvent$paging_common_release", "(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/LoadType;)Landroidx/paging/PageEvent;", "toPageEvent", "loadId", "page", "", "insert", "(ILandroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;)Z", "Landroidx/paging/PageEvent$Drop;", "event", "", "drop", "(Landroidx/paging/PageEvent$Drop;)V", "Landroidx/paging/ViewportHint;", "hint", "dropEventOrNull", "(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)Landroidx/paging/PageEvent$Drop;", "Landroidx/paging/ViewportHint$Access;", "viewportHint", "Landroidx/paging/PagingState;", "currentPagingState$paging_common_release", "(Landroidx/paging/ViewportHint$Access;)Landroidx/paging/PagingState;", "currentPagingState", "", "c", "Ljava/util/List;", "getPages$paging_common_release", "()Ljava/util/List;", "pages", "<set-?>", "d", "I", "getInitialPageIndex$paging_common_release", "()I", "initialPageIndex", "", "k", "Ljava/util/Map;", "getFailedHintsByLoadType$paging_common_release", "()Ljava/util/Map;", "failedHintsByLoadType", "Landroidx/paging/MutableLoadStateCollection;", "l", "Landroidx/paging/MutableLoadStateCollection;", "getSourceLoadStates$paging_common_release", "()Landroidx/paging/MutableLoadStateCollection;", "sourceLoadStates", "getStorageCount$paging_common_release", "storageCount", "value", "getPlaceholdersBefore$paging_common_release", "setPlaceholdersBefore$paging_common_release", "(I)V", "placeholdersBefore", "getPlaceholdersAfter$paging_common_release", "setPlaceholdersAfter$paging_common_release", "placeholdersAfter", "Holder", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPageFetcherSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n1#2:397\n*E\n"})
public final class PageFetcherSnapshotState {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\u000F\u001A\u00028\u0004\"\u0004\b\u0004\u0010\b2-\u0010\u000E\u001A)\u0012\u001F\u0012\u001D\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00040\tH\u0086H¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/paging/PageFetcherSnapshotState$Holder;", "", "Key", "Value", "Landroidx/paging/PagingConfig;", "config", "<init>", "(Landroidx/paging/PagingConfig;)V", "T", "Lkotlin/Function1;", "Landroidx/paging/PageFetcherSnapshotState;", "Lkotlin/ParameterName;", "name", "state", "block", "withLock", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPageFetcherSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,396:1\n120#2,10:397\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n*L\n390#1:397,10\n*E\n"})
    public static final class Holder {
        public final Mutex a;
        public final PageFetcherSnapshotState b;

        public Holder(@NotNull PagingConfig pagingConfig0) {
            Intrinsics.checkNotNullParameter(pagingConfig0, "config");
            super();
            this.a = MutexKt.Mutex$default(false, 1, null);
            this.b = new PageFetcherSnapshotState(pagingConfig0, null);
        }

        @Nullable
        public final Object withLock(@NotNull Function1 function10, @NotNull Continuation continuation0) {
            Holder pageFetcherSnapshotState$Holder0;
            Mutex mutex0;
            q0 q00;
            if(continuation0 instanceof q0) {
                q00 = (q0)continuation0;
                int v = q00.t;
                if((v & 0x80000000) == 0) {
                    q00 = new q0(this, continuation0);
                }
                else {
                    q00.t = v ^ 0x80000000;
                }
            }
            else {
                q00 = new q0(this, continuation0);
            }
            Object object0 = q00.r;
            Object object1 = a.getCOROUTINE_SUSPENDED();
            switch(q00.t) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    mutex0 = this.a;
                    q00.o = this;
                    q00.p = function10;
                    q00.q = mutex0;
                    q00.t = 1;
                    if(mutex0.lock(null, q00) == object1) {
                        return object1;
                    }
                    pageFetcherSnapshotState$Holder0 = this;
                    break;
                }
                case 1: {
                    Mutex mutex1 = q00.q;
                    Function1 function11 = q00.p;
                    pageFetcherSnapshotState$Holder0 = q00.o;
                    ResultKt.throwOnFailure(object0);
                    mutex0 = mutex1;
                    function10 = function11;
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            try {
                return function10.invoke(pageFetcherSnapshotState$Holder0.b);
            }
            finally {
                mutex0.unlock(null);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LoadType.values().length];
            try {
                arr_v[LoadType.REFRESH.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.PREPEND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.APPEND.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final PagingConfig a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Channel i;
    public final Channel j;
    public final LinkedHashMap k;
    public final MutableLoadStateCollection l;

    public PageFetcherSnapshotState(PagingConfig pagingConfig0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = pagingConfig0;
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        this.c = arrayList0;
        this.i = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.j = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.k = new LinkedHashMap();
        MutableLoadStateCollection mutableLoadStateCollection0 = new MutableLoadStateCollection();
        mutableLoadStateCollection0.set(LoadType.REFRESH, Loading.INSTANCE);
        this.l = mutableLoadStateCollection0;
    }

    @NotNull
    public final Flow consumeAppendGenerationIdAsFlow() {
        return FlowKt.onStart(FlowKt.consumeAsFlow(this.j), new y0(this, null));
    }

    @NotNull
    public final Flow consumePrependGenerationIdAsFlow() {
        return FlowKt.onStart(FlowKt.consumeAsFlow(this.i), new z0(this, null));
    }

    @NotNull
    public final PagingState currentPagingState$paging_common_release(@Nullable Access viewportHint$Access0) {
        ArrayList arrayList0 = this.c;
        List list0 = CollectionsKt___CollectionsKt.toList(arrayList0);
        PagingConfig pagingConfig0 = this.a;
        if(viewportHint$Access0 != null) {
            int v = this.getPlaceholdersBefore$paging_common_release();
            int v1 = -this.d;
            int v2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0) - this.d;
            int v3 = viewportHint$Access0.getPageOffset();
            for(int v4 = v1; v4 < v3; ++v4) {
                v += (v4 <= v2 ? ((Page)arrayList0.get(this.d + v4)).getData().size() : pagingConfig0.pageSize);
            }
            return new PagingState(list0, ((int)(viewportHint$Access0.getPageOffset() >= v1 ? viewportHint$Access0.getIndexInPage() + v : viewportHint$Access0.getIndexInPage() + v - pagingConfig0.pageSize)), pagingConfig0, this.getPlaceholdersBefore$paging_common_release());
        }
        return new PagingState(list0, null, pagingConfig0, this.getPlaceholdersBefore$paging_common_release());
    }

    public final void drop(@NotNull Drop pageEvent$Drop0) {
        Intrinsics.checkNotNullParameter(pageEvent$Drop0, "event");
        ArrayList arrayList0 = this.c;
        if(pageEvent$Drop0.getPageCount() <= arrayList0.size()) {
            this.k.remove(pageEvent$Drop0.getLoadType());
            NotLoading loadState$NotLoading0 = NotLoading.Companion.getIncomplete$paging_common_release();
            this.l.set(pageEvent$Drop0.getLoadType(), loadState$NotLoading0);
            ArrayList arrayList1 = this.b;
            switch(WhenMappings.$EnumSwitchMapping$0[pageEvent$Drop0.getLoadType().ordinal()]) {
                case 2: {
                    int v1 = pageEvent$Drop0.getPageCount();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        arrayList1.remove(0);
                    }
                    this.d -= pageEvent$Drop0.getPageCount();
                    this.setPlaceholdersBefore$paging_common_release(pageEvent$Drop0.getPlaceholdersRemaining());
                    int v3 = this.g + 1;
                    this.g = v3;
                    this.i.trySend-JP2dKIU(v3);
                    return;
                }
                case 3: {
                    int v4 = pageEvent$Drop0.getPageCount();
                    for(int v = 0; v < v4; ++v) {
                        arrayList1.remove(arrayList0.size() - 1);
                    }
                    this.setPlaceholdersAfter$paging_common_release(pageEvent$Drop0.getPlaceholdersRemaining());
                    int v5 = this.h + 1;
                    this.h = v5;
                    this.j.trySend-JP2dKIU(v5);
                    return;
                }
                default: {
                    throw new IllegalArgumentException("cannot drop " + pageEvent$Drop0.getLoadType());
                }
            }
        }
        throw new IllegalStateException(("invalid drop count. have " + arrayList0.size() + " but wanted to drop " + pageEvent$Drop0.getPageCount()).toString());
    }

    @Nullable
    public final Drop dropEventOrNull(@NotNull LoadType loadType0, @NotNull ViewportHint viewportHint0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        Intrinsics.checkNotNullParameter(viewportHint0, "hint");
        PagingConfig pagingConfig0 = this.a;
        if(pagingConfig0.maxSize == 0x7FFFFFFF) {
            return null;
        }
        ArrayList arrayList0 = this.c;
        if(arrayList0.size() <= 2) {
            return null;
        }
        if(this.getStorageCount$paging_common_release() <= pagingConfig0.maxSize) {
            return null;
        }
        if(loadType0 == LoadType.REFRESH) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType0).toString());
        }
        int v = 0;
        int v1 = 0;
        while(v < arrayList0.size() && this.getStorageCount$paging_common_release() - v1 > pagingConfig0.maxSize) {
            int v2 = WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()] == 2 ? ((Page)arrayList0.get(v)).getData().size() : ((Page)arrayList0.get(CollectionsKt__CollectionsKt.getLastIndex(arrayList0) - v)).getData().size();
            if((WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()] == 2 ? viewportHint0.getPresentedItemsBefore() : viewportHint0.getPresentedItemsAfter()) - v1 - v2 < pagingConfig0.prefetchDistance) {
                break;
            }
            v1 += v2;
            ++v;
        }
        if(v != 0) {
            int v3 = WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()] == 2 ? -this.d : CollectionsKt__CollectionsKt.getLastIndex(arrayList0) - this.d - (v - 1);
            int v4 = WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()] == 2 ? v - 1 - this.d : CollectionsKt__CollectionsKt.getLastIndex(arrayList0) - this.d;
            if(pagingConfig0.enablePlaceholders) {
                return loadType0 == LoadType.PREPEND ? new Drop(loadType0, v3, v4, this.getPlaceholdersBefore$paging_common_release() + v1) : new Drop(loadType0, v3, v4, this.getPlaceholdersAfter$paging_common_release() + v1);
            }
            return new Drop(loadType0, v3, v4, 0);
        }
        return null;
    }

    public final int generationId$paging_common_release(@NotNull LoadType loadType0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        switch(WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()]) {
            case 1: {
                throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
            }
            case 2: {
                return this.g;
            }
            case 3: {
                return this.h;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final Map getFailedHintsByLoadType$paging_common_release() {
        return this.k;
    }

    public final int getInitialPageIndex$paging_common_release() {
        return this.d;
    }

    @NotNull
    public final List getPages$paging_common_release() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    public final int getPlaceholdersAfter$paging_common_release() {
        return this.a.enablePlaceholders ? this.f : 0;
    }

    // 去混淆评级： 低(20)
    public final int getPlaceholdersBefore$paging_common_release() {
        return this.a.enablePlaceholders ? this.e : 0;
    }

    @NotNull
    public final MutableLoadStateCollection getSourceLoadStates$paging_common_release() {
        return this.l;
    }

    public final int getStorageCount$paging_common_release() {
        int v = 0;
        for(Object object0: this.c) {
            v += ((Page)object0).getData().size();
        }
        return v;
    }

    @CheckResult
    public final boolean insert(int v, @NotNull LoadType loadType0, @NotNull Page pagingSource$LoadResult$Page0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        Intrinsics.checkNotNullParameter(pagingSource$LoadResult$Page0, "page");
        int v1 = WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()];
        ArrayList arrayList0 = this.b;
        ArrayList arrayList1 = this.c;
        if(v1 != 1) {
            LinkedHashMap linkedHashMap0 = this.k;
            switch(v1) {
                case 2: {
                    if(arrayList1.isEmpty()) {
                        throw new IllegalStateException("should\'ve received an init before prepend");
                    }
                    if(v != this.g) {
                        return false;
                    }
                    arrayList0.add(0, pagingSource$LoadResult$Page0);
                    ++this.d;
                    this.setPlaceholdersBefore$paging_common_release((pagingSource$LoadResult$Page0.getItemsBefore() == 0x80000000 ? c.coerceAtLeast(this.getPlaceholdersBefore$paging_common_release() - pagingSource$LoadResult$Page0.getData().size(), 0) : pagingSource$LoadResult$Page0.getItemsBefore()));
                    linkedHashMap0.remove(LoadType.PREPEND);
                    return true;
                }
                case 3: {
                    if(arrayList1.isEmpty()) {
                        throw new IllegalStateException("should\'ve received an init before append");
                    }
                    if(v != this.h) {
                        return false;
                    }
                    arrayList0.add(pagingSource$LoadResult$Page0);
                    this.setPlaceholdersAfter$paging_common_release((pagingSource$LoadResult$Page0.getItemsAfter() == 0x80000000 ? c.coerceAtLeast(this.getPlaceholdersAfter$paging_common_release() - pagingSource$LoadResult$Page0.getData().size(), 0) : pagingSource$LoadResult$Page0.getItemsAfter()));
                    linkedHashMap0.remove(LoadType.APPEND);
                    return true;
                }
                default: {
                    return true;
                }
            }
        }
        if(!arrayList1.isEmpty()) {
            throw new IllegalStateException("cannot receive multiple init calls");
        }
        if(v != 0) {
            throw new IllegalStateException("init loadId must be the initial value, 0");
        }
        arrayList0.add(pagingSource$LoadResult$Page0);
        this.d = 0;
        this.setPlaceholdersAfter$paging_common_release(pagingSource$LoadResult$Page0.getItemsAfter());
        this.setPlaceholdersBefore$paging_common_release(pagingSource$LoadResult$Page0.getItemsBefore());
        return true;
    }

    public final void setPlaceholdersAfter$paging_common_release(int v) {
        if(v == 0x80000000) {
            v = 0;
        }
        this.f = v;
    }

    public final void setPlaceholdersBefore$paging_common_release(int v) {
        if(v == 0x80000000) {
            v = 0;
        }
        this.e = v;
    }

    @NotNull
    public final PageEvent toPageEvent$paging_common_release(@NotNull Page pagingSource$LoadResult$Page0, @NotNull LoadType loadType0) {
        Intrinsics.checkNotNullParameter(pagingSource$LoadResult$Page0, "<this>");
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        int[] arr_v = WhenMappings.$EnumSwitchMapping$0;
        int v = 0;
        switch(arr_v[loadType0.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                v = -this.d;
                break;
            }
            case 3: {
                v = this.c.size() - this.d - 1;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        List list0 = k.listOf(new TransformablePage(v, pagingSource$LoadResult$Page0.getData()));
        int v1 = arr_v[loadType0.ordinal()];
        MutableLoadStateCollection mutableLoadStateCollection0 = this.l;
        if(v1 != 1) {
            switch(v1) {
                case 2: {
                    int v2 = this.getPlaceholdersBefore$paging_common_release();
                    LoadStates loadStates0 = mutableLoadStateCollection0.snapshot();
                    return Insert.Companion.Prepend(list0, v2, loadStates0, null);
                }
                case 3: {
                    int v3 = this.getPlaceholdersAfter$paging_common_release();
                    LoadStates loadStates1 = mutableLoadStateCollection0.snapshot();
                    return Insert.Companion.Append(list0, v3, loadStates1, null);
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        int v4 = this.getPlaceholdersBefore$paging_common_release();
        int v5 = this.getPlaceholdersAfter$paging_common_release();
        LoadStates loadStates2 = mutableLoadStateCollection0.snapshot();
        return Insert.Companion.Refresh(list0, v4, v5, loadStates2, null);
    }
}

