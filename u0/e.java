package u0;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import androidx.compose.material.ripple.RippleIndicationInstance;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

public final class e implements FlowCollector {
    public final RippleIndicationInstance a;
    public final CoroutineScope b;

    public e(RippleIndicationInstance rippleIndicationInstance0, CoroutineScope coroutineScope0) {
        this.a = rippleIndicationInstance0;
        this.b = coroutineScope0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        CoroutineScope coroutineScope0 = this.b;
        RippleIndicationInstance rippleIndicationInstance0 = this.a;
        if(((Interaction)object0) instanceof Press) {
            rippleIndicationInstance0.addRipple(((Press)(((Interaction)object0))), coroutineScope0);
            return Unit.INSTANCE;
        }
        if(((Interaction)object0) instanceof Release) {
            rippleIndicationInstance0.removeRipple(((Release)(((Interaction)object0))).getPress());
            return Unit.INSTANCE;
        }
        if(((Interaction)object0) instanceof Cancel) {
            rippleIndicationInstance0.removeRipple(((Cancel)(((Interaction)object0))).getPress());
            return Unit.INSTANCE;
        }
        rippleIndicationInstance0.updateStateLayer$material_ripple_release(((Interaction)object0), coroutineScope0);
        return Unit.INSTANCE;
    }
}

