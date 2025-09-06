package androidx.compose.material3;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class p7 extends Lambda implements Function1 {
    public final int w;
    public final SelectableDates x;
    public final Locale y;

    public p7(SelectableDates selectableDates0, Locale locale0, int v) {
        this.w = v;
        this.x = selectableDates0;
        this.y = locale0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Object object1 = ((List)object0).get(0);
            Object object2 = ((List)object0).get(1);
            Object object3 = ((List)object0).get(2);
            Object object4 = ((List)object0).get(3);
            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.Int");
            Object object5 = ((List)object0).get(4);
            Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type kotlin.Int");
            IntRange intRange0 = new IntRange(((int)(((Integer)object4))), ((int)(((Integer)object5))));
            Object object6 = ((List)object0).get(5);
            Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type kotlin.Int");
            return new r8(this.y, ((Long)object1), ((Long)object2), ((Long)object3), intRange0, DisplayMode.constructor-impl(((int)(((Integer)object6)))), this.x);
        }
        Object object7 = ((List)object0).get(0);
        Object object8 = ((List)object0).get(1);
        Object object9 = ((List)object0).get(2);
        Intrinsics.checkNotNull(object9, "null cannot be cast to non-null type kotlin.Int");
        Object object10 = ((List)object0).get(3);
        Intrinsics.checkNotNull(object10, "null cannot be cast to non-null type kotlin.Int");
        IntRange intRange1 = new IntRange(((int)(((Integer)object9))), ((int)(((Integer)object10))));
        Object object11 = ((List)object0).get(4);
        Intrinsics.checkNotNull(object11, "null cannot be cast to non-null type kotlin.Int");
        return new q7(this.y, ((Long)object7), ((Long)object8), intRange1, DisplayMode.constructor-impl(((int)(((Integer)object11)))), this.x);
    }
}

