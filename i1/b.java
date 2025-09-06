package i1;

import androidx.arch.core.util.Function;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class b implements Function, ObserverHandle, DoubleFunction {
    public final int a;
    public final Function1 b;

    public b(Function1 function10, int v) {
        this.a = v;
        this.b = function10;
        super();
    }

    @Override  // androidx.arch.core.util.Function
    public Object apply(Object object0) {
        Function1 function10 = this.b;
        switch(this.a) {
            case 5: {
                Intrinsics.checkNotNullParameter(function10, "$function");
                Intrinsics.checkNotNullExpressionValue(object0, "it");
                return function10.invoke(object0);
            }
            case 6: {
                Intrinsics.checkNotNullParameter(function10, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "it");
                return (List)function10.invoke(((List)object0));
            }
            case 7: {
                Intrinsics.checkNotNullParameter(function10, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "list");
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                for(Object object2: ((List)object0)) {
                    arrayList1.add(function10.invoke(object2));
                }
                return arrayList1;
            }
            case 8: {
                Intrinsics.checkNotNullParameter(function10, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "it");
                return (List)function10.invoke(((List)object0));
            }
            case 9: {
                Intrinsics.checkNotNullParameter(function10, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "list");
                ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                for(Object object3: ((List)object0)) {
                    arrayList2.add(function10.invoke(object3));
                }
                return arrayList2;
            }
            case 10: {
                Intrinsics.checkNotNullParameter(function10, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "it");
                return (List)function10.invoke(((List)object0));
            }
            case 11: {
                Intrinsics.checkNotNullParameter(function10, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "it");
                return (List)function10.invoke(((List)object0));
            }
            case 12: {
                Intrinsics.checkNotNullParameter(function10, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "list");
                ArrayList arrayList3 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                for(Object object4: ((List)object0)) {
                    arrayList3.add(function10.invoke(object4));
                }
                return arrayList3;
            }
            case 13: {
                Intrinsics.checkNotNullParameter(function10, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "it");
                return (List)function10.invoke(((List)object0));
            }
            default: {
                Intrinsics.checkNotNullParameter(function10, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "list");
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                for(Object object1: ((List)object0)) {
                    arrayList0.add(function10.invoke(object1));
                }
                return arrayList0;
            }
        }
    }

    @Override  // androidx.compose.runtime.snapshots.ObserverHandle
    public void dispose() {
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.i = CollectionsKt___CollectionsKt.minus(SnapshotKt.i, this.b);
        }
        SnapshotKt.access$advanceGlobalSnapshot();
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double f) {
        Function1 function10 = this.b;
        switch(this.a) {
            case 1: {
                return ((Number)function10.invoke(f)).doubleValue();
            }
            case 2: {
                return ((Number)function10.invoke(f)).doubleValue();
            }
            case 3: {
                return ((Number)function10.invoke(f)).doubleValue();
            }
            default: {
                return ((Number)function10.invoke(f)).doubleValue();
            }
        }
    }
}

