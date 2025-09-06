package androidx.compose.animation;

import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r0.a;
import s.y0;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ls/y0;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class EnterExitTransitionElement extends ModifierNodeElement {
    public final Transition b;
    public final DeferredAnimation c;
    public final DeferredAnimation d;
    public final DeferredAnimation e;
    public final EnterTransition f;
    public final ExitTransition g;
    public final Function0 h;
    public final GraphicsLayerBlockForEnterExit i;

    public EnterExitTransitionElement(Transition transition0, DeferredAnimation transition$DeferredAnimation0, DeferredAnimation transition$DeferredAnimation1, DeferredAnimation transition$DeferredAnimation2, EnterTransition enterTransition0, ExitTransition exitTransition0, Function0 function00, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit0) {
        this.b = transition0;
        this.c = transition$DeferredAnimation0;
        this.d = transition$DeferredAnimation1;
        this.e = transition$DeferredAnimation2;
        this.f = enterTransition0;
        this.g = exitTransition0;
        this.h = function00;
        this.i = graphicsLayerBlockForEnterExit0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new y0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EnterExitTransitionElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((EnterExitTransitionElement)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((EnterExitTransitionElement)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((EnterExitTransitionElement)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((EnterExitTransitionElement)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((EnterExitTransitionElement)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((EnterExitTransitionElement)object0).g)) {
            return false;
        }
        return Intrinsics.areEqual(this.h, ((EnterExitTransitionElement)object0).h) ? Intrinsics.areEqual(this.i, ((EnterExitTransitionElement)object0).i) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = this.b.hashCode();
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        DeferredAnimation transition$DeferredAnimation0 = this.e;
        if(transition$DeferredAnimation0 != null) {
            v1 = transition$DeferredAnimation0.hashCode();
        }
        return this.i.hashCode() + a.g(this.h, (this.g.hashCode() + (this.f.hashCode() + (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F) * 0x1F) * 0x1F, 0x1F);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("enterExitTransition");
        inspectorInfo0.getProperties().set("transition", this.b);
        inspectorInfo0.getProperties().set("sizeAnimation", this.c);
        inspectorInfo0.getProperties().set("offsetAnimation", this.d);
        inspectorInfo0.getProperties().set("slideAnimation", this.e);
        inspectorInfo0.getProperties().set("enter", this.f);
        inspectorInfo0.getProperties().set("exit", this.g);
        inspectorInfo0.getProperties().set("graphicsLayerBlock", this.i);
    }

    @Override
    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.b + ", sizeAnimation=" + this.c + ", offsetAnimation=" + this.d + ", slideAnimation=" + this.e + ", enter=" + this.f + ", exit=" + this.g + ", isEnabled=" + this.h + ", graphicsLayerBlock=" + this.i + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((y0)modifier$Node0).n = this.b;
        ((y0)modifier$Node0).o = this.c;
        ((y0)modifier$Node0).p = this.d;
        ((y0)modifier$Node0).q = this.e;
        ((y0)modifier$Node0).r = this.f;
        ((y0)modifier$Node0).s = this.g;
        ((y0)modifier$Node0).t = this.h;
        ((y0)modifier$Node0).u = this.i;
    }
}

