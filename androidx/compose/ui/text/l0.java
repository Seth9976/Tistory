package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function1 {
    public static final l0 w;

    static {
        l0.w = new l0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(Intrinsics.areEqual(object0, Boolean.FALSE)) {
            return TextUnit.box-impl(0x7FC00000L);
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object object1 = ((List)object0).get(0);
        TextUnitType textUnitType0 = null;
        Float float0 = object1 == null ? null : ((Float)object1);
        Intrinsics.checkNotNull(float0);
        float f = float0.floatValue();
        Object object2 = ((List)object0).get(1);
        if(object2 != null) {
            textUnitType0 = (TextUnitType)object2;
        }
        Intrinsics.checkNotNull(textUnitType0);
        return TextUnit.box-impl(TextUnitKt.TextUnit-anM5pPY(f, textUnitType0.unbox-impl()));
    }
}

