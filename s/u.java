package s;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function3 {
    public final Function1 w;
    public final Transition x;

    public u(Function1 function10, Transition transition0) {
        this.w = function10;
        this.x = transition0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(((Constraints)object2).unbox-impl());
        if(((MeasureScope)object0).isLookingAhead()) {
            Object object3 = this.x.getTargetState();
            if(!((Boolean)this.w.invoke(object3)).booleanValue()) {
                return MeasureScope.layout$default(((MeasureScope)object0), 0, 0, null, new t(placeable0), 4, null);
            }
        }
        long v = IntSizeKt.IntSize(placeable0.getWidth(), placeable0.getHeight());
        return MeasureScope.layout$default(((MeasureScope)object0), IntSize.getWidth-impl(v), IntSize.getHeight-impl(v), null, new t(placeable0), 4, null);
    }
}

