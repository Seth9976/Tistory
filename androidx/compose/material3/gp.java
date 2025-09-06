package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.flow.FlowCollector;

public final class gp implements FlowCollector {
    public final IntRef a;
    public final ip b;

    public gp(IntRef ref$IntRef0, ip ip0) {
        this.a = ref$IntRef0;
        this.b = ip0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        boolean z = true;
        IntRef ref$IntRef0 = this.a;
        if(((Interaction)object0) instanceof Press) {
            ++ref$IntRef0.element;
        }
        else if(((Interaction)object0) instanceof Release) {
            --ref$IntRef0.element;
        }
        else if(((Interaction)object0) instanceof Cancel) {
            --ref$IntRef0.element;
        }
        if(ref$IntRef0.element <= 0) {
            z = false;
        }
        ip ip0 = this.b;
        if(ip0.p != z) {
            ip0.p = z;
            LayoutModifierNodeKt.invalidateMeasurement(ip0);
        }
        return Unit.INSTANCE;
    }
}

