package androidx.compose.animation;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s.t1;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SkipToLookaheadElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ls/t1;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class SkipToLookaheadElement extends ModifierNodeElement {
    public final n b;
    public final Function0 c;

    public SkipToLookaheadElement(n n0, Function0 function00) {
        this.b = n0;
        this.c = function00;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new t1(this.b, this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SkipToLookaheadElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((SkipToLookaheadElement)object0).b) ? Intrinsics.areEqual(this.c, ((SkipToLookaheadElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.b == null ? this.c.hashCode() : this.c.hashCode() + this.b.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("skipToLookahead");
        inspectorInfo0.getProperties().set("scaleToBounds", this.b);
        inspectorInfo0.getProperties().set("isEnabled", this.c);
    }

    @Override
    public final String toString() {
        return "SkipToLookaheadElement(scaleToBounds=" + this.b + ", isEnabled=" + this.c + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((t1)modifier$Node0).o.setValue(this.b);
        ((t1)modifier$Node0).p.setValue(this.c);
    }
}

