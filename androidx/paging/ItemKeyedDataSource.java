package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import i1.b;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt___CollectionsKt;
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

@Deprecated(message = "ItemKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @ReplaceWith(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00040123B\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080@\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001B\u0010\u0010\u001A\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\rH\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001B\u0010\u0012\u001A\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\rH\u0000\u00A2\u0006\u0004\b\u0011\u0010\u000FJ$\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0081@\u00A2\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0081@\u00A2\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0081@\u00A2\u0006\u0004\b\u001B\u0010\u0019J+\u0010\u0016\u001A\u00020\u001F2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00010\u001DH&\u00A2\u0006\u0004\b\u0016\u0010 J+\u0010\u001C\u001A\u00020\u001F2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00010!H&\u00A2\u0006\u0004\b\u001C\u0010\"J+\u0010\u001A\u001A\u00020\u001F2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00010!H&\u00A2\u0006\u0004\b\u001A\u0010\"J\u0017\u0010$\u001A\u00028\u00002\u0006\u0010#\u001A\u00028\u0001H&\u00A2\u0006\u0004\b$\u0010%J\u0017\u0010\'\u001A\u00028\u00002\u0006\u0010#\u001A\u00028\u0001H\u0010\u00A2\u0006\u0004\b&\u0010%JC\u0010+\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u001E\u0010*\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r0)\u00A2\u0006\u0004\b+\u0010,JC\u0010+\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u001E\u0010*\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r0-\u00A2\u0006\u0004\b+\u0010.J7\u0010/\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u0012\u0010*\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020)\u00A2\u0006\u0004\b/\u0010,J7\u0010/\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u0012\u0010*\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020-\u00A2\u0006\u0004\b/\u0010.\u00A8\u00064"}, d2 = {"Landroidx/paging/ItemKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "<init>", "()V", "Landroidx/paging/DataSource$Params;", "params", "Landroidx/paging/DataSource$BaseResult;", "load$paging_common_release", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "", "getPrevKey$paging_common_release", "(Ljava/util/List;)Ljava/lang/Object;", "getPrevKey", "getNextKey$paging_common_release", "getNextKey", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "loadInitial$paging_common_release", "(Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadInitial", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "loadBefore$paging_common_release", "(Landroidx/paging/ItemKeyedDataSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBefore", "loadAfter$paging_common_release", "loadAfter", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "callback", "", "(Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;)V", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "(Landroidx/paging/ItemKeyedDataSource$LoadParams;Landroidx/paging/ItemKeyedDataSource$LoadCallback;)V", "item", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "getKeyInternal$paging_common_release", "getKeyInternal", "ToValue", "Landroidx/arch/core/util/Function;", "function", "mapByPage", "(Landroidx/arch/core/util/Function;)Landroidx/paging/ItemKeyedDataSource;", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Landroidx/paging/ItemKeyedDataSource;", "map", "LoadCallback", "LoadInitialCallback", "LoadInitialParams", "LoadParams", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nItemKeyedDataSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemKeyedDataSource.jvm.kt\nandroidx/paging/ItemKeyedDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,350:1\n1#2:351\n314#3,11:352\n314#3,11:363\n314#3,11:374\n1549#4:385\n1620#4,3:386\n1549#4:389\n1620#4,3:390\n*S KotlinDebug\n*F\n+ 1 ItemKeyedDataSource.jvm.kt\nandroidx/paging/ItemKeyedDataSource\n*L\n187#1:352,11\n232#1:363,11\n238#1:374,11\n343#1:385\n343#1:386,3\n348#1:389\n348#1:390,3\n*E\n"})
public abstract class ItemKeyedDataSource extends DataSource {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00020\u0007H&¨\u0006\b"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "Value", "", "()V", "onResult", "", "data", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class LoadCallback {
        public abstract void onResult(@NotNull List arg1);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\tH&¨\u0006\u000B"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "Value", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "()V", "onResult", "", "data", "", "position", "", "totalCount", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class LoadInitialCallback extends LoadCallback {
        public abstract void onResult(@NotNull List arg1, int arg2, int arg3);
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002B\u001F\u0012\b\u0010\u0003\u001A\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bR\u0010\u0010\u0006\u001A\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001A\u0004\u0018\u00018\u00028\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\u0004\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "Key", "", "requestedInitialKey", "requestedLoadSize", "", "placeholdersEnabled", "", "(Ljava/lang/Object;IZ)V", "Ljava/lang/Object;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class LoadInitialParams {
        @JvmField
        public final boolean placeholdersEnabled;
        @JvmField
        @Nullable
        public final Object requestedInitialKey;
        @JvmField
        public final int requestedLoadSize;

        public LoadInitialParams(@Nullable Object object0, int v, boolean z) {
            this.requestedInitialKey = object0;
            this.requestedLoadSize = v;
            this.placeholdersEnabled = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00028\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0003\u001A\u00028\u00028\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\u0004\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadParams;", "Key", "", "key", "requestedLoadSize", "", "(Ljava/lang/Object;I)V", "Ljava/lang/Object;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
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

    public static final int e;

    public ItemKeyedDataSource() {
        super(KeyType.ITEM_KEYED);
    }

    public static final ItemKeyedDataSource.asCallback.1 access$asCallback(ItemKeyedDataSource itemKeyedDataSource0, CancellableContinuation cancellableContinuation0) {
        itemKeyedDataSource0.getClass();
        return new ItemKeyedDataSource.asCallback.1(itemKeyedDataSource0, cancellableContinuation0);
    }

    @NotNull
    public abstract Object getKey(@NotNull Object arg1);

    @Override  // androidx.paging.DataSource
    @NotNull
    public Object getKeyInternal$paging_common_release(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "item");
        return this.getKey(object0);
    }

    @Nullable
    public final Object getNextKey$paging_common_release(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Object object0 = CollectionsKt___CollectionsKt.lastOrNull(list0);
        return object0 == null ? null : this.getKey(object0);
    }

    @Nullable
    public final Object getPrevKey$paging_common_release(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Object object0 = CollectionsKt___CollectionsKt.firstOrNull(list0);
        return object0 == null ? null : this.getKey(object0);
    }

    @Override  // androidx.paging.DataSource
    @Nullable
    public final Object load$paging_common_release(@NotNull Params dataSource$Params0, @NotNull Continuation continuation0) {
        switch(WhenMappings.$EnumSwitchMapping$0[dataSource$Params0.getType$paging_common_release().ordinal()]) {
            case 1: {
                return this.loadInitial$paging_common_release(new LoadInitialParams(dataSource$Params0.getKey(), dataSource$Params0.getInitialLoadSize(), dataSource$Params0.getPlaceholdersEnabled()), continuation0);
            }
            case 2: {
                Object object0 = dataSource$Params0.getKey();
                Intrinsics.checkNotNull(object0);
                return this.loadBefore$paging_common_release(new LoadParams(object0, dataSource$Params0.getPageSize()), continuation0);
            }
            case 3: {
                Object object1 = dataSource$Params0.getKey();
                Intrinsics.checkNotNull(object1);
                return this.loadAfter$paging_common_release(new LoadParams(object1, dataSource$Params0.getPageSize()), continuation0);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public abstract void loadAfter(@NotNull LoadParams arg1, @NotNull LoadCallback arg2);

    @VisibleForTesting
    @Nullable
    public final Object loadAfter$paging_common_release(@NotNull LoadParams itemKeyedDataSource$LoadParams0, @NotNull Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        this.loadAfter(itemKeyedDataSource$LoadParams0, ItemKeyedDataSource.access$asCallback(this, cancellableContinuationImpl0));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    public abstract void loadBefore(@NotNull LoadParams arg1, @NotNull LoadCallback arg2);

    @VisibleForTesting
    @Nullable
    public final Object loadBefore$paging_common_release(@NotNull LoadParams itemKeyedDataSource$LoadParams0, @NotNull Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        this.loadBefore(itemKeyedDataSource$LoadParams0, ItemKeyedDataSource.access$asCallback(this, cancellableContinuationImpl0));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    public abstract void loadInitial(@NotNull LoadInitialParams arg1, @NotNull LoadInitialCallback arg2);

    @VisibleForTesting
    @Nullable
    public final Object loadInitial$paging_common_release(@NotNull LoadInitialParams itemKeyedDataSource$LoadInitialParams0, @NotNull Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        this.loadInitial(itemKeyedDataSource$LoadInitialParams0, new LoadInitialCallback() {
            @Override  // androidx.paging.ItemKeyedDataSource$LoadCallback
            public void onResult(@NotNull List list0) {
                Intrinsics.checkNotNullParameter(list0, "data");
                BaseResult dataSource$BaseResult0 = new BaseResult(list0, this.b.getPrevKey$paging_common_release(list0), this.b.getNextKey$paging_common_release(list0), 0, 0, 24, null);
                this.resumeWith(dataSource$BaseResult0);
            }

            @Override  // androidx.paging.ItemKeyedDataSource$LoadInitialCallback
            public void onResult(@NotNull List list0, int v, int v1) {
                Intrinsics.checkNotNullParameter(list0, "data");
                BaseResult dataSource$BaseResult0 = new BaseResult(list0, this.b.getPrevKey$paging_common_release(list0), this.b.getNextKey$paging_common_release(list0), v, v1 - list0.size() - v);
                this.resumeWith(dataSource$BaseResult0);
            }
        });
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    @Override  // androidx.paging.DataSource
    public DataSource map(Function function0) {
        return this.map(function0);
    }

    @Override  // androidx.paging.DataSource
    public DataSource map(Function1 function10) {
        return this.map(function10);
    }

    @NotNull
    public final ItemKeyedDataSource map(@NotNull Function function0) {
        Intrinsics.checkNotNullParameter(function0, "function");
        return this.mapByPage(new r(function0, 1));
    }

    @NotNull
    public final ItemKeyedDataSource map(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        return this.mapByPage(new b(function10, 9));
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
    public final ItemKeyedDataSource mapByPage(@NotNull Function function0) {
        Intrinsics.checkNotNullParameter(function0, "function");
        return new WrapperItemKeyedDataSource(this, function0);
    }

    @NotNull
    public final ItemKeyedDataSource mapByPage(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        return this.mapByPage(new b(function10, 10));
    }
}

