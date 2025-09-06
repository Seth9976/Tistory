package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;

public final class u8 implements ColorProducer {
    public final int a;
    public final Object b;

    public u8(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.compose.ui.graphics.ColorProducer
    public final long invoke-0d7_KjU() {
        if(this.a != 0) {
            return ((ii)this.b).d;
        }
        w8 w80 = (w8)this.b;
        long v = w80.s.invoke-0d7_KjU();
        if(v == 16L) {
            RippleConfiguration rippleConfiguration0 = (RippleConfiguration)CompositionLocalConsumerModifierNodeKt.currentValueOf(w80, RippleKt.getLocalRippleConfiguration());
            return rippleConfiguration0 == null || rippleConfiguration0.getColor-0d7_KjU() == 16L ? ((Color)CompositionLocalConsumerModifierNodeKt.currentValueOf(w80, ContentColorKt.getLocalContentColor())).unbox-impl() : rippleConfiguration0.getColor-0d7_KjU();
        }
        return v;
    }
}

