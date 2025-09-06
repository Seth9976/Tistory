package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class sb extends Lambda implements Function3 {
    public final float w;
    public final float x;

    public sb(float f, float f1) {
        this.w = f;
        this.x = f1;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(Constraints.Companion.fixed-JhjzzOo(((int)this.w), ((int)this.x)));
        return MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth(), placeable0.getHeight(), null, new rb(placeable0), 4, null);
    }
}

