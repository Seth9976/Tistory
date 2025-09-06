package androidx.compose.material3;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

public final class ii implements IndicationNodeFactory {
    public final boolean a;
    public final float b;
    public final ColorProducer c;
    public final long d;

    public ii(boolean z, float f, ColorProducer colorProducer0, long v) {
        this.a = z;
        this.b = f;
        this.c = colorProducer0;
        this.d = v;
    }

    @Override  // androidx.compose.foundation.IndicationNodeFactory
    public final DelegatableNode create(InteractionSource interactionSource0) {
        ColorProducer colorProducer0 = this.c;
        if(colorProducer0 == null) {
            colorProducer0 = new u8(this, 1);
        }
        return new w8(interactionSource0, this.a, this.b, colorProducer0);
    }

    @Override  // androidx.compose.foundation.IndicationNodeFactory
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ii)) {
            return false;
        }
        if(this.a != ((ii)object0).a) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((ii)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((ii)object0).c) ? Color.equals-impl0(this.d, ((ii)object0).d) : false;
    }

    @Override  // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        int v = a.C(this.b, Boolean.hashCode(this.a) * 0x1F, 0x1F);
        return this.c == null ? Color.hashCode-impl(this.d) + v * 0x1F : Color.hashCode-impl(this.d) + (v + this.c.hashCode()) * 0x1F;
    }
}

