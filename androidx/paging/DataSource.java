package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import i1.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;
import s4.r;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000B\b&\u0018\u0000 5*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u000665789:B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007JE\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\b*\u00020\u00012\u001E\u0010\u000B\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n0\tH\u0016\u00A2\u0006\u0004\b\f\u0010\rJE\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\b*\u00020\u00012\u001E\u0010\u000B\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n0\u000EH\u0016\u00A2\u0006\u0004\b\f\u0010\u000FJ9\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tH\u0016\u00A2\u0006\u0004\b\u0010\u0010\rJ9\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\u0017\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u0011H\u0017\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u0011H\u0017\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0013H\u0017\u00A2\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00010\u001B2\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019H\u00A0@\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\"\u001A\u00028\u00002\u0006\u0010\u001F\u001A\u00028\u0001H \u00A2\u0006\u0004\b \u0010!R\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u001A\u0010,\u001A\u00020\'8\u0010X\u0090D\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R\u001A\u0010/\u001A\u00020\'8\u0010X\u0090D\u00A2\u0006\f\n\u0004\b-\u0010)\u001A\u0004\b.\u0010+R\u0014\u00103\u001A\u0002008AX\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b1\u00102R\u0014\u00104\u001A\u00020\'8WX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b4\u0010+\u00A8\u0006;"}, d2 = {"Landroidx/paging/DataSource;", "", "Key", "Value", "Landroidx/paging/DataSource$KeyType;", "type", "<init>", "(Landroidx/paging/DataSource$KeyType;)V", "ToValue", "Landroidx/arch/core/util/Function;", "", "function", "mapByPage", "(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource;", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Landroidx/paging/DataSource;", "map", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "", "addInvalidatedCallback", "(Landroidx/paging/DataSource$InvalidatedCallback;)V", "removeInvalidatedCallback", "invalidate", "()V", "Landroidx/paging/DataSource$Params;", "params", "Landroidx/paging/DataSource$BaseResult;", "load$paging_common_release", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "item", "getKeyInternal$paging_common_release", "(Ljava/lang/Object;)Ljava/lang/Object;", "getKeyInternal", "a", "Landroidx/paging/DataSource$KeyType;", "getType$paging_common_release", "()Landroidx/paging/DataSource$KeyType;", "", "c", "Z", "isContiguous$paging_common_release", "()Z", "isContiguous", "d", "getSupportsPageDropping$paging_common_release", "supportsPageDropping", "", "getInvalidateCallbackCount$paging_common_release", "()I", "invalidateCallbackCount", "isInvalid", "Companion", "BaseResult", "Factory", "InvalidatedCallback", "KeyType", "Params", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class DataSource {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0011\b\u0000\u0018\u0000 \"*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\"B?\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\t\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u0010\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0017\u001A\u0004\b\u001B\u0010\u0019R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010\t\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001D\u001A\u0004\b!\u0010\u001F¨\u0006#"}, d2 = {"Landroidx/paging/DataSource$BaseResult;", "", "Value", "", "data", "prevKey", "nextKey", "", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "pageSize", "", "validateForInitialTiling$paging_common_release", "(I)V", "validateForInitialTiling", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "a", "Ljava/lang/Object;", "getPrevKey", "()Ljava/lang/Object;", "b", "getNextKey", "c", "I", "getItemsBefore", "()I", "d", "getItemsAfter", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class BaseResult {
        @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00030\u0003\"\b\b\u0003\u0010\u0002*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00040\u0003\"\b\b\u0003\u0010\u0007*\u00020\u0001\"\b\b\u0004\u0010\b*\u00020\u00012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00030\u00032\u001E\u0010\f\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000B\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000B0\nH\u0000¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Landroidx/paging/DataSource$BaseResult$Companion;", "", "T", "Landroidx/paging/DataSource$BaseResult;", "empty$paging_common_release", "()Landroidx/paging/DataSource$BaseResult;", "empty", "ToValue", "Value", "result", "Landroidx/arch/core/util/Function;", "", "function", "convert$paging_common_release", "(Landroidx/paging/DataSource$BaseResult;Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource$BaseResult;", "convert", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final BaseResult convert$paging_common_release(@NotNull BaseResult dataSource$BaseResult0, @NotNull Function function0) {
                Intrinsics.checkNotNullParameter(dataSource$BaseResult0, "result");
                Intrinsics.checkNotNullParameter(function0, "function");
                return new BaseResult(DataSource.Companion.convert$paging_common_release(function0, dataSource$BaseResult0.data), dataSource$BaseResult0.getPrevKey(), dataSource$BaseResult0.getNextKey(), dataSource$BaseResult0.getItemsBefore(), dataSource$BaseResult0.getItemsAfter());
            }

            @NotNull
            public final BaseResult empty$paging_common_release() {
                return new BaseResult(CollectionsKt__CollectionsKt.emptyList(), null, null, 0, 0);
            }
        }

        @NotNull
        public static final Companion Companion;
        public final Object a;
        public final Object b;
        public final int c;
        public final int d;
        @JvmField
        @NotNull
        public final List data;

        static {
            BaseResult.Companion = new Companion(null);
        }

        public BaseResult(@NotNull List list0, @Nullable Object object0, @Nullable Object object1, int v, int v1) {
            Intrinsics.checkNotNullParameter(list0, "data");
            super();
            this.data = list0;
            this.a = object0;
            this.b = object1;
            this.c = v;
            this.d = v1;
            if(v < 0 && v != 0x80000000) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if(list0.isEmpty() && (v > 0 || v1 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            if(v1 < 0 && v1 != 0x80000000) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        public BaseResult(List list0, Object object0, Object object1, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            this(list0, object0, object1, ((v2 & 8) == 0 ? v : 0x80000000), ((v2 & 16) == 0 ? v1 : 0x80000000));
        }

        // 去混淆评级： 低(40)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof BaseResult && Intrinsics.areEqual(this.data, ((BaseResult)object0).data) && Intrinsics.areEqual(this.a, ((BaseResult)object0).a) && Intrinsics.areEqual(this.b, ((BaseResult)object0).b) && this.c == ((BaseResult)object0).c && this.d == ((BaseResult)object0).d;
        }

        public final int getItemsAfter() {
            return this.d;
        }

        public final int getItemsBefore() {
            return this.c;
        }

        @Nullable
        public final Object getNextKey() {
            return this.b;
        }

        @Nullable
        public final Object getPrevKey() {
            return this.a;
        }

        public final void validateForInitialTiling$paging_common_release(int v) {
            int v1 = this.c;
            if(v1 != 0x80000000) {
                int v2 = this.d;
                if(v2 != 0x80000000) {
                    if(v2 > 0 && this.data.size() % v != 0) {
                        throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + this.data.size() + ", position " + v1 + ", totalCount " + (this.data.size() + v1 + v2) + ", pageSize " + v);
                    }
                    if(v1 % v != 0) {
                        throw new IllegalArgumentException("Initial load must be pageSize aligned.Position = " + v1 + ", pageSize = " + v);
                    }
                    return;
                }
            }
            throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001JO\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00030\u0005\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u001E\u0010\u0006\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00050\u00042\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Landroidx/paging/DataSource$Companion;", "", "A", "B", "Landroidx/arch/core/util/Function;", "", "function", "source", "convert$paging_common_release", "(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;", "convert", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class androidx.paging.DataSource.Companion {
        public androidx.paging.DataSource.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final List convert$paging_common_release(@NotNull Function function0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(function0, "function");
            Intrinsics.checkNotNullParameter(list0, "source");
            List list1 = (List)function0.apply(list0);
            if(list1.size() != list0.size()) {
                throw new IllegalStateException("Invalid Function " + function0 + " changed return size. This is not supported.");
            }
            Intrinsics.checkNotNullExpressionValue(list1, "dest");
            return list1;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00070\u00062\b\b\u0002\u0010\b\u001A\u00020\tH\u0007J\u0014\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000BH&J2\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u0002H\r0\u0000\"\b\b\u0004\u0010\r*\u00020\u00022\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u0002H\r0\u000FH\u0016J2\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u0002H\r0\u0000\"\b\b\u0004\u0010\r*\u00020\u00022\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u0002H\r0\u0010H\u0016J>\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u0002H\r0\u0000\"\b\b\u0004\u0010\r*\u00020\u00022\u001E\u0010\u000E\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u00120\u000FH\u0016J>\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u0002H\r0\u0000\"\b\b\u0004\u0010\r*\u00020\u00022\u001E\u0010\u000E\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u00120\u0010H\u0016¨\u0006\u0013"}, d2 = {"Landroidx/paging/DataSource$Factory;", "Key", "", "Value", "()V", "asPagingSourceFactory", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "fetchDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "create", "Landroidx/paging/DataSource;", "map", "ToValue", "function", "Lkotlin/Function1;", "Landroidx/arch/core/util/Function;", "mapByPage", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nDataSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataSource.jvm.kt\nandroidx/paging/DataSource$Factory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,525:1\n1549#2:526\n1620#2,3:527\n1549#2:530\n1620#2,3:531\n*S KotlinDebug\n*F\n+ 1 DataSource.jvm.kt\nandroidx/paging/DataSource$Factory\n*L\n173#1:526\n173#1:527,3\n194#1:530\n194#1:531,3\n*E\n"})
    public static abstract class Factory {
        @JvmOverloads
        @NotNull
        public final Function0 asPagingSourceFactory() {
            return Factory.asPagingSourceFactory$default(this, null, 1, null);
        }

        @JvmOverloads
        @NotNull
        public final Function0 asPagingSourceFactory(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            Intrinsics.checkNotNullParameter(coroutineDispatcher0, "fetchDispatcher");
            return new SuspendingPagingSourceFactory(coroutineDispatcher0, new j(coroutineDispatcher0, this));
        }

        public static Function0 asPagingSourceFactory$default(Factory dataSource$Factory0, CoroutineDispatcher coroutineDispatcher0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asPagingSourceFactory");
            }
            if((v & 1) != 0) {
                coroutineDispatcher0 = Dispatchers.getIO();
            }
            return dataSource$Factory0.asPagingSourceFactory(coroutineDispatcher0);
        }

        @NotNull
        public abstract DataSource create();

        @NotNull
        public Factory map(@NotNull Function function0) {
            Intrinsics.checkNotNullParameter(function0, "function");
            return this.mapByPage(new r(function0, 0));
        }

        public Factory map(Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "function");
            return this.mapByPage(new b(function10, 7));
        }

        @NotNull
        public Factory mapByPage(@NotNull Function function0) {
            Intrinsics.checkNotNullParameter(function0, "function");
            return new Factory() {
                @Override  // androidx.paging.DataSource$Factory
                @NotNull
                public DataSource create() {
                    return function0.create().mapByPage(this.b);
                }
            };
        }

        public Factory mapByPage(Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "function");
            return this.mapByPage(new b(function10, 8));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/paging/DataSource$InvalidatedCallback;", "", "onInvalidated", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface InvalidatedCallback {
        @AnyThread
        void onInvalidated();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/DataSource$KeyType;", "", "POSITIONAL", "PAGE_KEYED", "ITEM_KEYED", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum KeyType {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED;

    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0017\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\u0006¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u0004\u001A\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0019\u0010\u0005\u001A\u0004\u0018\u00018\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0017\u0010\n\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0016\u001A\u0004\b\u001E\u0010\u0018¨\u0006\u001F"}, d2 = {"Landroidx/paging/DataSource$Params;", "", "K", "Landroidx/paging/LoadType;", "type", "key", "", "initialLoadSize", "", "placeholdersEnabled", "pageSize", "<init>", "(Landroidx/paging/LoadType;Ljava/lang/Object;IZI)V", "a", "Landroidx/paging/LoadType;", "getType$paging_common_release", "()Landroidx/paging/LoadType;", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "I", "getInitialLoadSize", "()I", "d", "Z", "getPlaceholdersEnabled", "()Z", "e", "getPageSize", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Params {
        public final LoadType a;
        public final Object b;
        public final int c;
        public final boolean d;
        public final int e;

        public Params(@NotNull LoadType loadType0, @Nullable Object object0, int v, boolean z, int v1) {
            Intrinsics.checkNotNullParameter(loadType0, "type");
            super();
            this.a = loadType0;
            this.b = object0;
            this.c = v;
            this.d = z;
            this.e = v1;
            if(loadType0 != LoadType.REFRESH && object0 == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }

        public final int getInitialLoadSize() {
            return this.c;
        }

        @Nullable
        public final Object getKey() {
            return this.b;
        }

        public final int getPageSize() {
            return this.e;
        }

        public final boolean getPlaceholdersEnabled() {
            return this.d;
        }

        @NotNull
        public final LoadType getType$paging_common_release() {
            return this.a;
        }
    }

    @NotNull
    public static final androidx.paging.DataSource.Companion Companion;
    public final KeyType a;
    public final InvalidateCallbackTracker b;
    public final boolean c;
    public final boolean d;

    static {
        DataSource.Companion = new androidx.paging.DataSource.Companion(null);
    }

    public DataSource(@NotNull KeyType dataSource$KeyType0) {
        Intrinsics.checkNotNullParameter(dataSource$KeyType0, "type");
        super();
        this.a = dataSource$KeyType0;
        l l0 = new l(this);
        this.b = new InvalidateCallbackTracker(k.w, l0);
        this.c = true;
        this.d = true;
    }

    @AnyThread
    public void addInvalidatedCallback(@NotNull InvalidatedCallback dataSource$InvalidatedCallback0) {
        Intrinsics.checkNotNullParameter(dataSource$InvalidatedCallback0, "onInvalidatedCallback");
        this.b.registerInvalidatedCallback$paging_common_release(dataSource$InvalidatedCallback0);
    }

    @VisibleForTesting
    public final int getInvalidateCallbackCount$paging_common_release() {
        return this.b.callbackCount$paging_common_release();
    }

    @NotNull
    public abstract Object getKeyInternal$paging_common_release(@NotNull Object arg1);

    public boolean getSupportsPageDropping$paging_common_release() {
        return this.d;
    }

    @NotNull
    public final KeyType getType$paging_common_release() {
        return this.a;
    }

    @AnyThread
    public void invalidate() {
        this.b.invalidate$paging_common_release();
    }

    public boolean isContiguous$paging_common_release() {
        return this.c;
    }

    @WorkerThread
    public boolean isInvalid() {
        return this.b.getInvalid$paging_common_release();
    }

    @Nullable
    public abstract Object load$paging_common_release(@NotNull Params arg1, @NotNull Continuation arg2);

    @NotNull
    public DataSource map(@NotNull Function function0) {
        Intrinsics.checkNotNullParameter(function0, "function");
        return this.mapByPage(new h1(function0, 3));
    }

    public DataSource map(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        return this.map(new b(function10, 5));
    }

    @NotNull
    public DataSource mapByPage(@NotNull Function function0) {
        Intrinsics.checkNotNullParameter(function0, "function");
        return new WrapperDataSource(this, function0);
    }

    public DataSource mapByPage(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        return this.mapByPage(new b(function10, 6));
    }

    @AnyThread
    public void removeInvalidatedCallback(@NotNull InvalidatedCallback dataSource$InvalidatedCallback0) {
        Intrinsics.checkNotNullParameter(dataSource$InvalidatedCallback0, "onInvalidatedCallback");
        this.b.unregisterInvalidatedCallback$paging_common_release(dataSource$InvalidatedCallback0);
    }
}

