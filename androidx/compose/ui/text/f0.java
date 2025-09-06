package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function1 {
    public static final f0 w;

    static {
        f0.w = new f0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Offset offset0;
        Color color0;
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object object1 = ((List)object0).get(0);
        Saver saver0 = SaversKt.getSaver(Color.Companion);
        Float float0 = null;
        if(Intrinsics.areEqual(object1, Boolean.FALSE) && !(saver0 instanceof NonNullValueClassSaver)) {
            color0 = null;
        }
        else if(object1 != null) {
            color0 = (Color)saver0.restore(object1);
        }
        else {
            color0 = null;
        }
        Intrinsics.checkNotNull(color0);
        long v = color0.unbox-impl();
        Object object2 = ((List)object0).get(1);
        Saver saver1 = SaversKt.getSaver(Offset.Companion);
        if(Intrinsics.areEqual(object2, Boolean.FALSE) && !(saver1 instanceof NonNullValueClassSaver)) {
            offset0 = null;
        }
        else if(object2 != null) {
            offset0 = (Offset)saver1.restore(object2);
        }
        else {
            offset0 = null;
        }
        Intrinsics.checkNotNull(offset0);
        long v1 = offset0.unbox-impl();
        Object object3 = ((List)object0).get(2);
        if(object3 != null) {
            float0 = (Float)object3;
        }
        Intrinsics.checkNotNull(float0);
        return new Shadow(v, v1, float0.floatValue(), null);
    }
}

