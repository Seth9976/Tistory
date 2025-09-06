package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public static final v w;

    static {
        v.w = new v(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(Intrinsics.areEqual(object0, Boolean.FALSE)) {
            return Color.box-impl(Color.Companion.getUnspecified-0d7_KjU());
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Int");
        return Color.box-impl(ColorKt.Color(((int)(((Integer)object0)))));
    }
}

