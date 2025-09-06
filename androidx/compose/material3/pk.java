package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class pk extends Lambda implements Function3 {
    public static final pk w;

    static {
        pk.w = new pk(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        SliderDefaults.access$drawStopIndicator-x3O1jOs(SliderDefaults.INSTANCE, ((DrawScope)object0), ((Offset)object1).unbox-impl(), SliderDefaults.INSTANCE.getTickSize-D9Ej5fM(), ((Color)object2).unbox-impl());
        return Unit.INSTANCE;
    }
}

