package androidx.compose.foundation;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r0.a;
import u.q2;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lu/q2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class MarqueeModifierElement extends ModifierNodeElement {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final MarqueeSpacing f;
    public final float g;

    public MarqueeModifierElement(int v, int v1, int v2, int v3, MarqueeSpacing marqueeSpacing0, float f) {
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = marqueeSpacing0;
        this.g = f;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new q2(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MarqueeModifierElement)) {
            return false;
        }
        if(this.b != ((MarqueeModifierElement)object0).b) {
            return false;
        }
        if(!MarqueeAnimationMode.equals-impl0(this.c, ((MarqueeModifierElement)object0).c)) {
            return false;
        }
        if(this.d != ((MarqueeModifierElement)object0).d) {
            return false;
        }
        if(this.e != ((MarqueeModifierElement)object0).e) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((MarqueeModifierElement)object0).f) ? Dp.equals-impl0(this.g, ((MarqueeModifierElement)object0).g) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Dp.hashCode-impl(this.g) + (this.f.hashCode() + a.c(this.e, a.c(this.d, (MarqueeAnimationMode.hashCode-impl(this.c) + this.b * 0x1F) * 0x1F, 0x1F), 0x1F)) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("basicMarquee");
        inspectorInfo0.getProperties().set("iterations", this.b);
        inspectorInfo0.getProperties().set("animationMode", MarqueeAnimationMode.box-impl(this.c));
        inspectorInfo0.getProperties().set("delayMillis", this.d);
        inspectorInfo0.getProperties().set("initialDelayMillis", this.e);
        inspectorInfo0.getProperties().set("spacing", this.f);
        inspectorInfo0.getProperties().set("velocity", Dp.box-impl(this.g));
    }

    @Override
    public final String toString() {
        return "MarqueeModifierElement(iterations=" + this.b + ", animationMode=" + MarqueeAnimationMode.toString-impl(this.c) + ", delayMillis=" + this.d + ", initialDelayMillis=" + this.e + ", spacing=" + this.f + ", velocity=" + Dp.toString-impl(this.g) + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((q2)modifier$Node0).v.setValue(this.f);
        MarqueeAnimationMode marqueeAnimationMode0 = MarqueeAnimationMode.box-impl(this.c);
        ((q2)modifier$Node0).w.setValue(marqueeAnimationMode0);
        int v = this.b;
        int v1 = this.d;
        int v2 = this.e;
        float f = this.g;
        if(((q2)modifier$Node0).n != v || ((q2)modifier$Node0).o != v1 || ((q2)modifier$Node0).p != v2 || !Dp.equals-impl0(((q2)modifier$Node0).q, f)) {
            ((q2)modifier$Node0).n = v;
            ((q2)modifier$Node0).o = v1;
            ((q2)modifier$Node0).p = v2;
            ((q2)modifier$Node0).q = f;
            ((q2)modifier$Node0).d();
        }
    }
}

