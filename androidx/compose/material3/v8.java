package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v8 extends Lambda implements Function0 {
    public final int w;
    public final w8 x;

    public v8(w8 w80, int v) {
        this.w = v;
        this.x = w80;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            w8 w80 = this.x;
            if(((RippleConfiguration)CompositionLocalConsumerModifierNodeKt.currentValueOf(w80, RippleKt.getLocalRippleConfiguration())) == null) {
                DelegatableNode delegatableNode0 = w80.t;
                if(delegatableNode0 != null) {
                    w80.undelegate(delegatableNode0);
                    return Unit.INSTANCE;
                }
            }
            else if(w80.t == null) {
                u8 u80 = new u8(w80, 0);
                v8 v80 = new v8(w80, 0);
                w80.t = w80.delegate(androidx.compose.material.ripple.RippleKt.createRippleModifierNode-TDGSqEk(w80.p, w80.q, w80.r, u80, v80));
            }
            return Unit.INSTANCE;
        }
        RippleConfiguration rippleConfiguration0 = (RippleConfiguration)CompositionLocalConsumerModifierNodeKt.currentValueOf(this.x, RippleKt.getLocalRippleConfiguration());
        if(rippleConfiguration0 != null) {
            RippleAlpha rippleAlpha0 = rippleConfiguration0.getRippleAlpha();
            return rippleAlpha0 == null ? RippleDefaults.INSTANCE.getRippleAlpha() : rippleAlpha0;
        }
        return RippleDefaults.INSTANCE.getRippleAlpha();
    }
}

