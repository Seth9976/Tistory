package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import i1.b;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.r;

@Deprecated(message = "PositionalDataSource is deprecated and has been replaced by PagingSource", replaceWith = @ReplaceWith(expression = "PagingSource<Int, T>", imports = {"androidx.paging.PagingSource"}))
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000B\b\'\u0018\u0000 ,*\b\b\u0000\u0010\u0002*\u00020\u00012\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0005,-./0B\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0080@\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001E\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\b\u001A\u00020\rH\u0081@\u00A2\u0006\u0004\b\u000E\u0010\u000FJ%\u0010\u0010\u001A\u00020\u00132\u0006\u0010\b\u001A\u00020\r2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0011H\'\u00A2\u0006\u0004\b\u0010\u0010\u0014J%\u0010\u0017\u001A\u00020\u00132\u0006\u0010\b\u001A\u00020\u00152\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016H\'\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001C\u001A\u00020\u00042\u0006\u0010\u0019\u001A\u00028\u0000H\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001BJ=\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001D*\u00020\u00012\u001E\u0010 \u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001F\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001F0\u001E\u00A2\u0006\u0004\b!\u0010\"J=\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001D*\u00020\u00012\u001E\u0010 \u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001F\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001F0#\u00A2\u0006\u0004\b!\u0010$J1\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001D*\u00020\u00012\u0012\u0010 \u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001E\u00A2\u0006\u0004\b%\u0010\"J1\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001D*\u00020\u00012\u0012\u0010 \u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#\u00A2\u0006\u0004\b%\u0010$R \u0010\'\u001A\u00020&8\u0010X\u0090D\u00A2\u0006\u0012\n\u0004\b\'\u0010(\u0012\u0004\b+\u0010\u0006\u001A\u0004\b)\u0010*\u00A8\u00061"}, d2 = {"Landroidx/paging/PositionalDataSource;", "", "T", "Landroidx/paging/DataSource;", "", "<init>", "()V", "Landroidx/paging/DataSource$Params;", "params", "Landroidx/paging/DataSource$BaseResult;", "load$paging_common_release", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "loadInitial$paging_common_release", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadInitial", "Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "callback", "", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;Landroidx/paging/PositionalDataSource$LoadInitialCallback;)V", "Landroidx/paging/PositionalDataSource$LoadRangeParams;", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "loadRange", "(Landroidx/paging/PositionalDataSource$LoadRangeParams;Landroidx/paging/PositionalDataSource$LoadRangeCallback;)V", "item", "getKeyInternal$paging_common_release", "(Ljava/lang/Object;)Ljava/lang/Integer;", "getKeyInternal", "V", "Landroidx/arch/core/util/Function;", "", "function", "mapByPage", "(Landroidx/arch/core/util/Function;)Landroidx/paging/PositionalDataSource;", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Landroidx/paging/PositionalDataSource;", "map", "", "isContiguous", "Z", "isContiguous$paging_common_release", "()Z", "isContiguous$paging_common_release$annotations", "Companion", "LoadInitialCallback", "LoadInitialParams", "LoadRangeCallback", "LoadRangeParams", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPositionalDataSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionalDataSource.jvm.kt\nandroidx/paging/PositionalDataSource\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,501:1\n314#2,11:502\n314#2,11:513\n1549#3:524\n1620#3,3:525\n1549#3:528\n1620#3,3:529\n*S KotlinDebug\n*F\n+ 1 PositionalDataSource.jvm.kt\nandroidx/paging/PositionalDataSource\n*L\n355#1:502,11\n423#1:513,11\n495#1:524\n495#1:525,3\n499#1:528\n499#1:529,3\n*E\n"})
public abstract class PositionalDataSource extends DataSource {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\'\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/paging/PositionalDataSource$Companion;", "", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "params", "", "totalCount", "computeInitialLoadPosition", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;I)I", "initialLoadPosition", "computeInitialLoadSize", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;II)I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        public final int computeInitialLoadPosition(@NotNull LoadInitialParams positionalDataSource$LoadInitialParams0, int v) {
            Intrinsics.checkNotNullParameter(positionalDataSource$LoadInitialParams0, "params");
            return Math.max(0, Math.min((v - positionalDataSource$LoadInitialParams0.requestedLoadSize + positionalDataSource$LoadInitialParams0.pageSize - 1) / positionalDataSource$LoadInitialParams0.pageSize * positionalDataSource$LoadInitialParams0.pageSize, positionalDataSource$LoadInitialParams0.requestedStartPosition / positionalDataSource$LoadInitialParams0.pageSize * positionalDataSource$LoadInitialParams0.pageSize));
        }

        @JvmStatic
        public final int computeInitialLoadSize(@NotNull LoadInitialParams positionalDataSource$LoadInitialParams0, int v, int v1) {
            Intrinsics.checkNotNullParameter(positionalDataSource$LoadInitialParams0, "params");
            return Math.min(v1 - v, positionalDataSource$LoadInitialParams0.requestedLoadSize);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001E\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\b\u001A\u00020\tH&J&\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\tH&¨\u0006\u000B"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "T", "", "()V", "onResult", "", "data", "", "position", "", "totalCount", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class LoadInitialCallback {
        public abstract void onResult(@NotNull List arg1, int arg2);

        public abstract void onResult(@NotNull List arg1, int arg2, int arg3);
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bR\u0010\u0010\u0005\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001A\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialParams;", "", "requestedStartPosition", "", "requestedLoadSize", "pageSize", "placeholdersEnabled", "", "(IIIZ)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class LoadInitialParams {
        @JvmField
        public final int pageSize;
        @JvmField
        public final boolean placeholdersEnabled;
        @JvmField
        public final int requestedLoadSize;
        @JvmField
        public final int requestedStartPosition;

        public LoadInitialParams(int v, int v1, int v2, boolean z) {
            this.requestedStartPosition = v;
            this.requestedLoadSize = v1;
            this.pageSize = v2;
            this.placeholdersEnabled = z;
            if(v < 0) {
                throw new IllegalStateException(("invalid start position: " + v).toString());
            }
            if(v1 < 0) {
                throw new IllegalStateException(("invalid load size: " + v1).toString());
            }
            if(v2 < 0) {
                throw new IllegalStateException(("invalid page size: " + v2).toString());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u0007H&¨\u0006\b"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "T", "", "()V", "onResult", "", "data", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class LoadRangeCallback {
        public abstract void onResult(@NotNull List arg1);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0004\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeParams;", "", "startPosition", "", "loadSize", "(II)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class LoadRangeParams {
        @JvmField
        public final int loadSize;
        @JvmField
        public final int startPosition;

        public LoadRangeParams(int v, int v1) {
            this.startPosition = v;
            this.loadSize = v1;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        PositionalDataSource.Companion = new Companion(null);
    }

    public PositionalDataSource() {
        super(KeyType.POSITIONAL);
    }

    public final Object a(LoadRangeParams positionalDataSource$LoadRangeParams0, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        this.loadRange(positionalDataSource$LoadRangeParams0, new PositionalDataSource.loadRange.2.1(positionalDataSource$LoadRangeParams0, this, cancellableContinuationImpl0));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    public static final Object access$loadRange(PositionalDataSource positionalDataSource0, LoadRangeParams positionalDataSource$LoadRangeParams0, Continuation continuation0) {
        return positionalDataSource0.a(positionalDataSource$LoadRangeParams0, continuation0);
    }

    @JvmStatic
    public static final int computeInitialLoadPosition(@NotNull LoadInitialParams positionalDataSource$LoadInitialParams0, int v) {
        return PositionalDataSource.Companion.computeInitialLoadPosition(positionalDataSource$LoadInitialParams0, v);
    }

    @JvmStatic
    public static final int computeInitialLoadSize(@NotNull LoadInitialParams positionalDataSource$LoadInitialParams0, int v, int v1) {
        return PositionalDataSource.Companion.computeInitialLoadSize(positionalDataSource$LoadInitialParams0, v, v1);
    }

    @NotNull
    public final Integer getKeyInternal$paging_common_release(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "item");
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    @Override  // androidx.paging.DataSource
    public Object getKeyInternal$paging_common_release(Object object0) {
        return this.getKeyInternal$paging_common_release(object0);
    }

    @Override  // androidx.paging.DataSource
    public boolean isContiguous$paging_common_release() {
        return false;
    }

    public static void isContiguous$paging_common_release$annotations() {
    }

    @Override  // androidx.paging.DataSource
    @Nullable
    public final Object load$paging_common_release(@NotNull Params dataSource$Params0, @NotNull Continuation continuation0) {
        if(dataSource$Params0.getType$paging_common_release() == LoadType.REFRESH) {
            int v = dataSource$Params0.getInitialLoadSize();
            int v1 = 0;
            if(dataSource$Params0.getKey() != null) {
                int v2 = ((Number)dataSource$Params0.getKey()).intValue();
                if(dataSource$Params0.getPlaceholdersEnabled()) {
                    v = Math.max(v / dataSource$Params0.getPageSize(), 2) * dataSource$Params0.getPageSize();
                    return this.loadInitial$paging_common_release(new LoadInitialParams(Math.max(0, dataSource$Params0.getPageSize() * ((v2 - v / 2) / dataSource$Params0.getPageSize())), v, dataSource$Params0.getPageSize(), dataSource$Params0.getPlaceholdersEnabled()), continuation0);
                }
                v1 = Math.max(0, v2 - v / 2);
            }
            return this.loadInitial$paging_common_release(new LoadInitialParams(v1, v, dataSource$Params0.getPageSize(), dataSource$Params0.getPlaceholdersEnabled()), continuation0);
        }
        Object object0 = dataSource$Params0.getKey();
        Intrinsics.checkNotNull(object0);
        int v3 = ((Number)object0).intValue();
        int v4 = dataSource$Params0.getPageSize();
        if(dataSource$Params0.getType$paging_common_release() == LoadType.PREPEND) {
            v4 = Math.min(v4, v3);
            v3 -= v4;
        }
        return this.a(new LoadRangeParams(v3, v4), continuation0);
    }

    @WorkerThread
    public abstract void loadInitial(@NotNull LoadInitialParams arg1, @NotNull LoadInitialCallback arg2);

    @VisibleForTesting
    @Nullable
    public final Object loadInitial$paging_common_release(@NotNull LoadInitialParams positionalDataSource$LoadInitialParams0, @NotNull Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        this.loadInitial(positionalDataSource$LoadInitialParams0, new LoadInitialCallback() {
            @Override  // androidx.paging.PositionalDataSource$LoadInitialCallback
            public void onResult(@NotNull List list0, int v) {
                Intrinsics.checkNotNullParameter(list0, "data");
                CancellableContinuationImpl cancellableContinuationImpl0 = positionalDataSource$LoadInitialParams0;
                if(cancellableContinuationImpl0.isInvalid()) {
                    cancellableContinuationImpl0.resumeWith(Result.constructor-impl(BaseResult.Companion.empty$paging_common_release()));
                    return;
                }
                BaseResult dataSource$BaseResult0 = new BaseResult(list0, (v == 0 ? null : v), ((int)(list0.size() + v)), v, 0x80000000);
                LoadInitialParams positionalDataSource$LoadInitialParams0 = this.c;
                if(positionalDataSource$LoadInitialParams0.placeholdersEnabled) {
                    dataSource$BaseResult0.validateForInitialTiling$paging_common_release(positionalDataSource$LoadInitialParams0.pageSize);
                }
                cancellableContinuationImpl0.resumeWith(dataSource$BaseResult0);
            }

            @Override  // androidx.paging.PositionalDataSource$LoadInitialCallback
            public void onResult(@NotNull List list0, int v, int v1) {
                Intrinsics.checkNotNullParameter(list0, "data");
                CancellableContinuationImpl cancellableContinuationImpl0 = positionalDataSource$LoadInitialParams0;
                if(cancellableContinuationImpl0.isInvalid()) {
                    cancellableContinuationImpl0.resumeWith(Result.constructor-impl(BaseResult.Companion.empty$paging_common_release()));
                    return;
                }
                int v2 = list0.size() + v;
                BaseResult dataSource$BaseResult0 = new BaseResult(list0, (v == 0 ? null : v), (v2 == v1 ? null : v2), v, v1 - list0.size() - v);
                LoadInitialParams positionalDataSource$LoadInitialParams0 = this.c;
                if(positionalDataSource$LoadInitialParams0.placeholdersEnabled) {
                    dataSource$BaseResult0.validateForInitialTiling$paging_common_release(positionalDataSource$LoadInitialParams0.pageSize);
                }
                cancellableContinuationImpl0.resumeWith(dataSource$BaseResult0);
            }
        });
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    @WorkerThread
    public abstract void loadRange(@NotNull LoadRangeParams arg1, @NotNull LoadRangeCallback arg2);

    @Override  // androidx.paging.DataSource
    public DataSource map(Function function0) {
        return this.map(function0);
    }

    @Override  // androidx.paging.DataSource
    public DataSource map(Function1 function10) {
        return this.map(function10);
    }

    @NotNull
    public final PositionalDataSource map(@NotNull Function function0) {
        Intrinsics.checkNotNullParameter(function0, "function");
        return this.mapByPage(new r(function0, 3));
    }

    @NotNull
    public final PositionalDataSource map(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        return this.mapByPage(new b(function10, 14));
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
    public final PositionalDataSource mapByPage(@NotNull Function function0) {
        Intrinsics.checkNotNullParameter(function0, "function");
        return new WrapperPositionalDataSource(this, function0);
    }

    @NotNull
    public final PositionalDataSource mapByPage(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        return this.mapByPage(new b(function10, 13));
    }
}

