package w0;

import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function3 {
    public static final g w;

    static {
        g.w = new g(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((MeasureScope)object0).roundToPx-0680j_4(AccessibilityUtilKt.getHorizontalSemanticsBoundsPadding());
        Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U(((Constraints)object2).unbox-impl(), v * 2, 0));
        return MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth() - v * 2, placeable0.getHeight(), null, new f(placeable0, v), 4, null);
    }
}

