package androidx.paging;

import androidx.arch.core.util.Function;
import i1.b;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.r;

@Deprecated(message = "PageKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @ReplaceWith(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\n\b\'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004+,-.B\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080@\u00A2\u0006\u0004\b\n\u0010\u000BJ1\u0010\u0011\u001A\u00020\u00102\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000EH&\u00A2\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001A\u00020\u00102\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H&\u00A2\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001A\u00020\u00102\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H&\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001B\u001A\u00028\u00002\u0006\u0010\u0018\u001A\u00028\u0001H\u0010\u00A2\u0006\u0004\b\u0019\u0010\u001AJC\u0010 \u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u001C*\u00020\u00012\u001E\u0010\u001F\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u001E0\u001D\u00A2\u0006\u0004\b \u0010!JC\u0010 \u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u001C*\u00020\u00012\u001E\u0010\u001F\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u001E0\"\u00A2\u0006\u0004\b \u0010#J7\u0010$\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u001C*\u00020\u00012\u0012\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001D\u00A2\u0006\u0004\b$\u0010!J7\u0010$\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u001C*\u00020\u00012\u0012\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\"\u00A2\u0006\u0004\b$\u0010#R \u0010&\u001A\u00020%8\u0010X\u0090D\u00A2\u0006\u0012\n\u0004\b&\u0010\'\u0012\u0004\b*\u0010\u0006\u001A\u0004\b(\u0010)\u00A8\u0006/"}, d2 = {"Landroidx/paging/PageKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "<init>", "()V", "Landroidx/paging/DataSource$Params;", "params", "Landroidx/paging/DataSource$BaseResult;", "load$paging_common_release", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "callback", "", "loadInitial", "(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;)V", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "(Landroidx/paging/PageKeyedDataSource$LoadParams;Landroidx/paging/PageKeyedDataSource$LoadCallback;)V", "loadAfter", "item", "getKeyInternal$paging_common_release", "(Ljava/lang/Object;)Ljava/lang/Object;", "getKeyInternal", "ToValue", "Landroidx/arch/core/util/Function;", "", "function", "mapByPage", "(Landroidx/arch/core/util/Function;)Landroidx/paging/PageKeyedDataSource;", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Landroidx/paging/PageKeyedDataSource;", "map", "", "supportsPageDropping", "Z", "getSupportsPageDropping$paging_common_release", "()Z", "getSupportsPageDropping$paging_common_release$annotations", "LoadCallback", "LoadInitialCallback", "LoadInitialParams", "LoadParams", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPageKeyedDataSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageKeyedDataSource.jvm.kt\nandroidx/paging/PageKeyedDataSource\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,351:1\n314#2,11:352\n314#2,11:363\n314#2,11:374\n1549#3:385\n1620#3,3:386\n1549#3:389\n1620#3,3:390\n*S KotlinDebug\n*F\n+ 1 PageKeyedDataSource.jvm.kt\nandroidx/paging/PageKeyedDataSource\n*L\n202#1:352,11\n236#1:363,11\n241#1:374,11\n344#1:385\n344#1:386,3\n349#1:389\n349#1:390,3\n*E\n"})
public abstract class PageKeyedDataSource extends DataSource {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001A\u00020\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00030\b2\b\u0010\t\u001A\u0004\u0018\u00018\u0002H&¢\u0006\u0002\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadCallback;", "Key", "Value", "", "()V", "onResult", "", "data", "", "adjacentPageKey", "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class LoadCallback {
        public abstract void onResult(@NotNull List arg1, @Nullable Object arg2);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J/\u0010\u0005\u001A\u00020\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00030\b2\b\u0010\t\u001A\u0004\u0018\u00018\u00022\b\u0010\n\u001A\u0004\u0018\u00018\u0002H&¢\u0006\u0002\u0010\u000BJ?\u0010\u0005\u001A\u00020\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00030\b2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\r2\b\u0010\t\u001A\u0004\u0018\u00018\u00022\b\u0010\n\u001A\u0004\u0018\u00018\u0002H&¢\u0006\u0002\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "Key", "Value", "", "()V", "onResult", "", "data", "", "previousPageKey", "nextPageKey", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "position", "", "totalCount", "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class LoadInitialCallback {
        public abstract void onResult(@NotNull List arg1, int arg2, int arg3, @Nullable Object arg4, @Nullable Object arg5);

        public abstract void onResult(@NotNull List arg1, @Nullable Object arg2, @Nullable Object arg3);
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0010\u0010\u0005\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Key", "", "requestedLoadSize", "", "placeholdersEnabled", "", "(IZ)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class LoadInitialParams {
        @JvmField
        public final boolean placeholdersEnabled;
        @JvmField
        public final int requestedLoadSize;

        public LoadInitialParams(int v, boolean z) {
            this.requestedLoadSize = v;
            this.placeholdersEnabled = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00028\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0003\u001A\u00028\u00028\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\u0004\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadParams;", "Key", "", "key", "requestedLoadSize", "", "(Ljava/lang/Object;I)V", "Ljava/lang/Object;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class LoadParams {
        @JvmField
        @NotNull
        public final Object key;
        @JvmField
        public final int requestedLoadSize;

        public LoadParams(@NotNull Object object0, int v) {
            Intrinsics.checkNotNullParameter(object0, "key");
            super();
            this.key = object0;
            this.requestedLoadSize = v;
        }
    }

    public static final int e;

    public PageKeyedDataSource() {
        super(KeyType.PAGE_KEYED);
    }

    public final Object a(LoadParams pageKeyedDataSource$LoadParams0, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        this.loadAfter(pageKeyedDataSource$LoadParams0, PageKeyedDataSource.access$continuationAsCallback(this, cancellableContinuationImpl0, true));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    public static final LoadCallback access$continuationAsCallback(PageKeyedDataSource pageKeyedDataSource0, CancellableContinuation cancellableContinuation0, boolean z) {
        pageKeyedDataSource0.getClass();
        return new PageKeyedDataSource.continuationAsCallback.1(cancellableContinuation0, z);
    }

    public static final Object access$loadAfter(PageKeyedDataSource pageKeyedDataSource0, LoadParams pageKeyedDataSource$LoadParams0, Continuation continuation0) {
        return pageKeyedDataSource0.a(pageKeyedDataSource$LoadParams0, continuation0);
    }

    public static final Object access$loadBefore(PageKeyedDataSource pageKeyedDataSource0, LoadParams pageKeyedDataSource$LoadParams0, Continuation continuation0) {
        return pageKeyedDataSource0.b(pageKeyedDataSource$LoadParams0, continuation0);
    }

    public static final Object access$loadInitial(PageKeyedDataSource pageKeyedDataSource0, LoadInitialParams pageKeyedDataSource$LoadInitialParams0, Continuation continuation0) {
        return pageKeyedDataSource0.c(pageKeyedDataSource$LoadInitialParams0, continuation0);
    }

    public final Object b(LoadParams pageKeyedDataSource$LoadParams0, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        this.loadBefore(pageKeyedDataSource$LoadParams0, PageKeyedDataSource.access$continuationAsCallback(this, cancellableContinuationImpl0, false));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    public final Object c(LoadInitialParams pageKeyedDataSource$LoadInitialParams0, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        this.loadInitial(pageKeyedDataSource$LoadInitialParams0, new PageKeyedDataSource.loadInitial.2.1(cancellableContinuationImpl0));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    @Override  // androidx.paging.DataSource
    @NotNull
    public Object getKeyInternal$paging_common_release(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override  // androidx.paging.DataSource
    public boolean getSupportsPageDropping$paging_common_release() {
        return false;
    }

    public static void getSupportsPageDropping$paging_common_release$annotations() {
    }

    @Override  // androidx.paging.DataSource
    @Nullable
    public final Object load$paging_common_release(@NotNull Params dataSource$Params0, @NotNull Continuation continuation0) {
        if(dataSource$Params0.getType$paging_common_release() == LoadType.REFRESH) {
            return this.c(new LoadInitialParams(dataSource$Params0.getInitialLoadSize(), dataSource$Params0.getPlaceholdersEnabled()), continuation0);
        }
        if(dataSource$Params0.getKey() == null) {
            return BaseResult.Companion.empty$paging_common_release();
        }
        if(dataSource$Params0.getType$paging_common_release() == LoadType.PREPEND) {
            return this.b(new LoadParams(dataSource$Params0.getKey(), dataSource$Params0.getPageSize()), continuation0);
        }
        if(dataSource$Params0.getType$paging_common_release() != LoadType.APPEND) {
            throw new IllegalArgumentException("Unsupported type " + dataSource$Params0.getType$paging_common_release());
        }
        return this.a(new LoadParams(dataSource$Params0.getKey(), dataSource$Params0.getPageSize()), continuation0);
    }

    public abstract void loadAfter(@NotNull LoadParams arg1, @NotNull LoadCallback arg2);

    public abstract void loadBefore(@NotNull LoadParams arg1, @NotNull LoadCallback arg2);

    public abstract void loadInitial(@NotNull LoadInitialParams arg1, @NotNull LoadInitialCallback arg2);

    @Override  // androidx.paging.DataSource
    public DataSource map(Function function0) {
        return this.map(function0);
    }

    @Override  // androidx.paging.DataSource
    public DataSource map(Function1 function10) {
        return this.map(function10);
    }

    @NotNull
    public final PageKeyedDataSource map(@NotNull Function function0) {
        Intrinsics.checkNotNullParameter(function0, "function");
        return this.mapByPage(new r(function0, 2));
    }

    @NotNull
    public final PageKeyedDataSource map(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        return this.mapByPage(new b(function10, 12));
    }

    @Override  // androidx.paging.DataSource
    public DataSource mapByPage(Function function0) {
        return this.mapByPage(function0);
    }

    @Override  // androidx.paging.DataSource
    public DataSource mapByPage(Function1 function10) {
        return this.mapByPage(function10);
    }

    @NotNull
    public final PageKeyedDataSource mapByPage(@NotNull Function function0) {
        Intrinsics.checkNotNullParameter(function0, "function");
        return new WrapperPageKeyedDataSource(this, function0);
    }

    @NotNull
    public final PageKeyedDataSource mapByPage(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        return this.mapByPage(new b(function10, 11));
    }
}

