package androidx.paging;

import a5.b;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B#\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0017¢\u0006\u0004\b\u000F\u0010\u0010J*\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001A\u0004\u0018\u00018\u00002\u0012\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0014\u0010!\u001A\u00020\u001E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010 ¨\u0006\""}, d2 = {"Landroidx/paging/LegacyPagingSource;", "", "Key", "Value", "Landroidx/paging/PagingSource;", "Landroidx/paging/CompatLegacyPagingSource;", "Lkotlin/coroutines/CoroutineContext;", "fetchContext", "Landroidx/paging/DataSource;", "dataSource", "<init>", "(Lkotlin/coroutines/CoroutineContext;Landroidx/paging/DataSource;)V", "", "pageSize", "", "setPageSize", "(I)V", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Object;", "h", "Landroidx/paging/DataSource;", "getDataSource$paging_common_release", "()Landroidx/paging/DataSource;", "", "getJumpingSupported", "()Z", "jumpingSupported", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLegacyPagingSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPagingSource.jvm.kt\nandroidx/paging/LegacyPagingSource\n+ 2 PagingState.kt\nandroidx/paging/PagingState\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n142#2,8:149\n1#3:157\n*S KotlinDebug\n*F\n+ 1 LegacyPagingSource.jvm.kt\nandroidx/paging/LegacyPagingSource\n*L\n128#1:149,8\n*E\n"})
public final class LegacyPagingSource extends PagingSource implements CompatLegacyPagingSource {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[KeyType.values().length];
            try {
                arr_v[KeyType.POSITIONAL.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyType.PAGE_KEYED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyType.ITEM_KEYED.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final CoroutineContext g;
    public final DataSource h;
    public int i;

    public LegacyPagingSource(@NotNull CoroutineContext coroutineContext0, @NotNull DataSource dataSource0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "fetchContext");
        Intrinsics.checkNotNullParameter(dataSource0, "dataSource");
        super();
        this.g = coroutineContext0;
        this.h = dataSource0;
        this.i = 0x80000000;
        dataSource0.addInvalidatedCallback(new q(this));
        this.registerInvalidatedCallback(new s(this));
    }

    @NotNull
    public final DataSource getDataSource$paging_common_release() {
        return this.h;
    }

    @Override  // androidx.paging.PagingSource
    public boolean getJumpingSupported() {
        return this.h.getType$paging_common_release() == KeyType.POSITIONAL;
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object getRefreshKey(@NotNull PagingState pagingState0) {
        Integer integer1;
        Intrinsics.checkNotNullParameter(pagingState0, "state");
        DataSource dataSource0 = this.h;
        switch(WhenMappings.$EnumSwitchMapping$0[dataSource0.getType$paging_common_release().ordinal()]) {
            case 1: {
                Integer integer0 = pagingState0.getAnchorPosition();
                if(integer0 != null) {
                    int v = integer0.intValue();
                    int v1 = v - PagingState.access$getLeadingPlaceholderCount$p(pagingState0);
                    for(int v2 = 0; v2 < CollectionsKt__CollectionsKt.getLastIndex(pagingState0.getPages()) && v1 > CollectionsKt__CollectionsKt.getLastIndex(((Page)pagingState0.getPages().get(v2)).getData()); ++v2) {
                        v1 -= ((Page)pagingState0.getPages().get(v2)).getData().size();
                    }
                    Page pagingSource$LoadResult$Page0 = pagingState0.closestPageToPosition(v);
                    if(pagingSource$LoadResult$Page0 == null) {
                        integer1 = 0;
                    }
                    else {
                        integer1 = pagingSource$LoadResult$Page0.getPrevKey();
                        if(integer1 == null) {
                            integer1 = 0;
                        }
                    }
                    Intrinsics.checkNotNull(integer1, "null cannot be cast to non-null type kotlin.Int");
                    return (int)(((int)integer1) + v1);
                }
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                Integer integer2 = pagingState0.getAnchorPosition();
                if(integer2 != null) {
                    Object object0 = pagingState0.closestItemToPosition(integer2.intValue());
                    if(object0 != null) {
                        return dataSource0.getKeyInternal$paging_common_release(object0);
                    }
                }
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull LoadParams pagingSource$LoadParams0, @NotNull Continuation continuation0) {
        LoadType loadType0;
        if(pagingSource$LoadParams0 instanceof Refresh) {
            loadType0 = LoadType.REFRESH;
        }
        else if(pagingSource$LoadParams0 instanceof Append) {
            loadType0 = LoadType.APPEND;
        }
        else if(pagingSource$LoadParams0 instanceof Prepend) {
            loadType0 = LoadType.PREPEND;
        }
        else {
            throw new NoWhenBranchMatchedException();
        }
        if(this.i == 0x80000000) {
            System.out.println("WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould\'ve been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.i = !(pagingSource$LoadParams0 instanceof Refresh) || pagingSource$LoadParams0.getLoadSize() % 3 != 0 ? pagingSource$LoadParams0.getLoadSize() : pagingSource$LoadParams0.getLoadSize() / 3;
        }
        t t0 = new t(this, new Params(loadType0, pagingSource$LoadParams0.getKey(), pagingSource$LoadParams0.getLoadSize(), pagingSource$LoadParams0.getPlaceholdersEnabled(), this.i), pagingSource$LoadParams0, null);
        return BuildersKt.withContext(this.g, t0, continuation0);
    }

    @Override  // androidx.paging.CompatLegacyPagingSource
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setPageSize(int v) {
        if(this.i != 0x80000000 && v != this.i) {
            throw new IllegalStateException(b.p(new StringBuilder("Page size is already set to "), this.i, '.').toString());
        }
        this.i = v;
    }
}

