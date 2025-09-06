package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function1 {
    public static final b0 w;

    static {
        b0.w = new b0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(Intrinsics.areEqual(object0, Boolean.FALSE)) {
            return Offset.box-impl(0x7FC000007FC00000L);
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object object1 = ((List)object0).get(0);
        Float float0 = null;
        Float float1 = object1 == null ? null : ((Float)object1);
        Intrinsics.checkNotNull(float1);
        float f = float1.floatValue();
        Object object2 = ((List)object0).get(1);
        if(object2 != null) {
            float0 = (Float)object2;
        }
        Intrinsics.checkNotNull(float0);
        return Offset.box-impl(OffsetKt.Offset(f, float0.floatValue()));
    }
}

