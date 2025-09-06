package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s.p1;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ls/p1;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class SizeAnimationModifierElement extends ModifierNodeElement {
    public final FiniteAnimationSpec b;
    public final Alignment c;
    public final Function2 d;

    public SizeAnimationModifierElement(FiniteAnimationSpec finiteAnimationSpec0, Alignment alignment0, Function2 function20) {
        this.b = finiteAnimationSpec0;
        this.c = alignment0;
        this.d = function20;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new p1(this.b, this.c, this.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SizeAnimationModifierElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((SizeAnimationModifierElement)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((SizeAnimationModifierElement)object0).c) ? Intrinsics.areEqual(this.d, ((SizeAnimationModifierElement)object0).d) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = this.b.hashCode();
        int v1 = this.c.hashCode();
        return this.d == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + this.d.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("animateContentSize");
        inspectorInfo0.getProperties().set("animationSpec", this.b);
        inspectorInfo0.getProperties().set("alignment", this.c);
        inspectorInfo0.getProperties().set("finishedListener", this.d);
    }

    @Override
    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.b + ", alignment=" + this.c + ", finishedListener=" + this.d + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((p1)modifier$Node0).n = this.b;
        ((p1)modifier$Node0).p = this.d;
        ((p1)modifier$Node0).o = this.c;
    }
}

