package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot.Companion;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u00126\u0010\u000B\u001A2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001D\u0010\u0018\u001A\u00020\u00102\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001D\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001C\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u001D\u0010\u001ER$\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u001F\u001A\u00020\u00028\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R+\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u001F\u001A\u00020\u00068F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'\"\u0004\b(\u0010)R$\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u001F\u001A\u00020\u00028\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b*\u0010!\u001A\u0004\b+\u0010#R+\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u001F\u001A\u00020\u00068F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b,\u0010%\u001A\u0004\b-\u0010\'\"\u0004\b.\u0010)R\u0017\u00104\u001A\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103¨\u00065"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "", "", "initialIndices", "initialOffsets", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "targetIndex", "laneCount", "fillIndices", "<init>", "([I[ILkotlin/jvm/functions/Function2;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V", "scrollOffsets", "updateScrollOffset", "([I)V", "index", "scrollOffset", "requestPositionAndForgetLastKnownKey", "(II)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "indices", "updateScrollPositionIfTheFirstItemWasMoved", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I", "<set-?>", "b", "[I", "getIndices", "()[I", "c", "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "(I)V", "d", "getScrollOffsets", "e", "getScrollOffset", "setScrollOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "h", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,173:1\n75#2:174\n108#2,2:175\n75#2:177\n108#2,2:178\n13600#3,2:180\n116#4,2:182\n33#4,6:184\n118#4:190\n602#5,8:191\n602#5,8:199\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n37#1:174\n37#1:175,2\n41#1:177\n41#1:178,2\n48#1:180,2\n86#1:182,2\n86#1:184,6\n86#1:190\n94#1:191,8\n146#1:199,8\n*E\n"})
public final class LazyStaggeredGridScrollPosition {
    public static final int $stable = 8;
    public final Function2 a;
    public int[] b;
    public final MutableIntState c;
    public int[] d;
    public final MutableIntState e;
    public boolean f;
    public Object g;
    public final LazyLayoutNearestRangeState h;

    public LazyStaggeredGridScrollPosition(@NotNull int[] arr_v, @NotNull int[] arr_v1, @NotNull Function2 function20) {
        this.a = function20;
        this.b = arr_v;
        this.c = SnapshotIntStateKt.mutableIntStateOf(LazyStaggeredGridScrollPosition.a(arr_v));
        this.d = arr_v1;
        this.e = SnapshotIntStateKt.mutableIntStateOf(LazyStaggeredGridScrollPosition.b(arr_v, arr_v1));
        Integer integer0 = ArraysKt___ArraysKt.minOrNull(arr_v);
        this.h = new LazyLayoutNearestRangeState((integer0 == null ? 0 : ((int)integer0)), 90, 200);
    }

    public static int a(int[] arr_v) {
        int v = 0x7FFFFFFF;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            if(v2 <= 0) {
                return 0;
            }
            if(v > v2) {
                v = v2;
            }
        }
        return v == 0x7FFFFFFF ? 0 : v;
    }

    public static int b(int[] arr_v, int[] arr_v1) {
        int v = LazyStaggeredGridScrollPosition.a(arr_v);
        int v1 = 0x7FFFFFFF;
        for(int v2 = 0; v2 < arr_v1.length; ++v2) {
            if(arr_v[v2] == v) {
                v1 = Math.min(v1, arr_v1[v2]);
            }
        }
        return v1 == 0x7FFFFFFF ? 0 : v1;
    }

    public final int getIndex() {
        return this.c.getIntValue();
    }

    @NotNull
    public final int[] getIndices() {
        return this.b;
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.h;
    }

    public final int getScrollOffset() {
        return this.e.getIntValue();
    }

    @NotNull
    public final int[] getScrollOffsets() {
        return this.d;
    }

    public final void requestPositionAndForgetLastKnownKey(int v, int v1) {
        int[] arr_v = (int[])this.a.invoke(v, ((int)this.b.length));
        int[] arr_v1 = new int[arr_v.length];
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            arr_v1[v2] = v1;
        }
        this.b = arr_v;
        int v3 = LazyStaggeredGridScrollPosition.a(arr_v);
        this.c.setIntValue(v3);
        this.d = arr_v1;
        int v4 = LazyStaggeredGridScrollPosition.b(arr_v, arr_v1);
        this.e.setIntValue(v4);
        this.h.update(v);
        this.g = null;
    }

    public final void updateFromMeasureResult(@NotNull LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult0) {
        Function1 function10;
        Object object0;
        int v = LazyStaggeredGridScrollPosition.a(lazyStaggeredGridMeasureResult0.getFirstVisibleItemIndices());
        List list0 = lazyStaggeredGridMeasureResult0.getVisibleItemsInfo();
        int v1 = list0.size();
        for(int v2 = 0; true; ++v2) {
            object0 = null;
            function10 = null;
            if(v2 >= v1) {
                break;
            }
            Object object1 = list0.get(v2);
            if(((LazyStaggeredGridMeasuredItem)object1).getIndex() == v) {
                object0 = object1;
                break;
            }
        }
        this.g = ((LazyStaggeredGridMeasuredItem)object0) == null ? null : ((LazyStaggeredGridMeasuredItem)object0).getKey();
        this.h.update(v);
        if(this.f || lazyStaggeredGridMeasureResult0.getTotalItemsCount() > 0) {
            this.f = true;
            Companion snapshot$Companion0 = Snapshot.Companion;
            Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
            if(snapshot0 != null) {
                function10 = snapshot0.getReadObserver();
            }
            Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
            try {
                int[] arr_v = lazyStaggeredGridMeasureResult0.getFirstVisibleItemIndices();
                int[] arr_v1 = lazyStaggeredGridMeasureResult0.getFirstVisibleItemScrollOffsets();
                this.b = arr_v;
                int v4 = LazyStaggeredGridScrollPosition.a(arr_v);
                this.c.setIntValue(v4);
                this.d = arr_v1;
                int v5 = LazyStaggeredGridScrollPosition.b(arr_v, arr_v1);
                this.e.setIntValue(v5);
            }
            finally {
                snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
            }
        }
    }

    public final void updateScrollOffset(@NotNull int[] arr_v) {
        this.d = arr_v;
        int v = LazyStaggeredGridScrollPosition.b(this.b, arr_v);
        this.e.setIntValue(v);
    }

    @ExperimentalFoundationApi
    @NotNull
    public final int[] updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyLayoutItemProvider lazyLayoutItemProvider0, @NotNull int[] arr_v) {
        Object object0 = this.g;
        int v = 0;
        Integer integer0 = ArraysKt___ArraysKt.getOrNull(arr_v, 0);
        if(integer0 != null) {
            v = (int)integer0;
        }
        int v1 = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider0, object0, v);
        if(!ArraysKt___ArraysKt.contains(arr_v, v1)) {
            this.h.update(v1);
            Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
            Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
            Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
            try {
                arr_v = (int[])this.a.invoke(v1, ((int)arr_v.length));
            }
            finally {
                Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
            }
            this.b = arr_v;
            int v3 = LazyStaggeredGridScrollPosition.a(arr_v);
            this.c.setIntValue(v3);
            return arr_v;
        }
        return arr_v;
    }
}

