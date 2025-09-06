package p0;

import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class aa implements FlowCollector {
    public final SwipeableState a;
    public final float b;

    public aa(SwipeableState swipeableState0, float f) {
        this.a = swipeableState0;
        this.b = f;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        Unit unit0;
        SwipeableState swipeableState0 = this.a;
        Float float0 = SwipeableKt.access$getOffset(((Map)object0), swipeableState0.getCurrentValue());
        Intrinsics.checkNotNull(float0);
        float f = (float)float0;
        float f1 = ((Number)swipeableState0.getOffset().getValue()).floatValue();
        Set set0 = ((Map)object0).keySet();
        Function2 function20 = swipeableState0.getThresholds$material_release();
        float f2 = swipeableState0.getVelocityThreshold$material_release();
        Object object1 = ((Map)object0).get(Boxing.boxFloat(SwipeableKt.access$computeTarget(f1, f, set0, function20, this.b, f2)));
        if(object1 != null && ((Boolean)swipeableState0.getConfirmStateChange$material_release().invoke(object1)).booleanValue()) {
            unit0 = SwipeableState.animateTo$default(this.a, object1, null, continuation0, 2, null);
            return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
        }
        unit0 = SwipeableState.access$animateInternalToOffset(swipeableState0, f, swipeableState0.getAnimationSpec$material_release(), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }
}

