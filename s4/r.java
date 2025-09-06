package s4;

import androidx.arch.core.util.Function;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;

public final class r implements Function {
    public final int a;
    public final Function b;

    public r(Function function0, int v) {
        this.a = v;
        this.b = function0;
        super();
    }

    @Override  // androidx.arch.core.util.Function
    public final Object apply(Object object0) {
        Function function0 = this.b;
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(function0, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "list");
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                for(Object object2: ((List)object0)) {
                    arrayList1.add(function0.apply(object2));
                }
                return arrayList1;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(function0, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "list");
                ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                for(Object object3: ((List)object0)) {
                    arrayList2.add(function0.apply(object3));
                }
                return arrayList2;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(function0, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "list");
                ArrayList arrayList3 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                for(Object object4: ((List)object0)) {
                    arrayList3.add(function0.apply(object4));
                }
                return arrayList3;
            }
            default: {
                Intrinsics.checkNotNullParameter(function0, "$function");
                Intrinsics.checkNotNullExpressionValue(((List)object0), "list");
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                for(Object object1: ((List)object0)) {
                    arrayList0.add(function0.apply(object1));
                }
                return arrayList0;
            }
        }
    }
}

