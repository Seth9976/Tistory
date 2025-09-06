package u;

import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.FocusInteraction.Unfocus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.HoverInteraction.Exit;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.flow.FlowCollector;

public final class i1 implements FlowCollector {
    public final IntRef a;
    public final IntRef b;
    public final IntRef c;
    public final k1 d;

    public i1(IntRef ref$IntRef0, IntRef ref$IntRef1, IntRef ref$IntRef2, k1 k10) {
        this.a = ref$IntRef0;
        this.b = ref$IntRef1;
        this.c = ref$IntRef2;
        this.d = k10;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        IntRef ref$IntRef0 = this.c;
        IntRef ref$IntRef1 = this.b;
        IntRef ref$IntRef2 = this.a;
        int v = 1;
        if(((Interaction)object0) instanceof Press) {
            ++ref$IntRef2.element;
        }
        else if(((Interaction)object0) instanceof Release) {
            --ref$IntRef2.element;
        }
        else if(((Interaction)object0) instanceof Cancel) {
            --ref$IntRef2.element;
        }
        else if(((Interaction)object0) instanceof Enter) {
            ++ref$IntRef1.element;
        }
        else if(((Interaction)object0) instanceof Exit) {
            --ref$IntRef1.element;
        }
        else if(((Interaction)object0) instanceof Focus) {
            ++ref$IntRef0.element;
        }
        else if(((Interaction)object0) instanceof Unfocus) {
            --ref$IntRef0.element;
        }
        int v1 = 0;
        boolean z = ref$IntRef2.element > 0;
        boolean z1 = ref$IntRef1.element > 0;
        boolean z2 = ref$IntRef0.element > 0;
        k1 k10 = this.d;
        if(k10.o != z) {
            k10.o = z;
            v1 = 1;
        }
        if(k10.p != z1) {
            k10.p = z1;
            v1 = 1;
        }
        if(k10.q == z2) {
            v = v1;
        }
        else {
            k10.q = z2;
        }
        if(v != 0) {
            DrawModifierNodeKt.invalidateDraw(k10);
        }
        return Unit.INSTANCE;
    }
}

