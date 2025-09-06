package androidx.paging;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class g1 extends Lambda implements Function1 {
    public final IntRange w;

    public g1(IntRange intRange0) {
        this.w = intRange0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TransformablePage)object0), "stash");
        int[] arr_v = ((TransformablePage)object0).getOriginalPageOffsets();
        for(int v = 0; v < arr_v.length; ++v) {
            if(this.w.contains(arr_v[v])) {
                return true;
            }
        }
        return false;
    }
}

