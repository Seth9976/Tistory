package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r0.a;
import u.h1;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lu/h1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class CombinedClickableElement extends ModifierNodeElement {
    public final MutableInteractionSource b;
    public final IndicationNodeFactory c;
    public final boolean d;
    public final String e;
    public final Role f;
    public final Function0 g;
    public final String h;
    public final Function0 i;
    public final Function0 j;

    public CombinedClickableElement(Function0 function00, String s, Function0 function01, Function0 function02, MutableInteractionSource mutableInteractionSource0, IndicationNodeFactory indicationNodeFactory0, boolean z, String s1, Role role0) {
        this.b = mutableInteractionSource0;
        this.c = indicationNodeFactory0;
        this.d = z;
        this.e = s;
        this.f = role0;
        this.g = function00;
        this.h = s1;
        this.i = function01;
        this.j = function02;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new h1(this.g, this.h, this.i, this.j, this.b, this.c, this.d, this.e, this.f);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        if(CombinedClickableElement.class != class0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((CombinedClickableElement)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((CombinedClickableElement)object0).c)) {
            return false;
        }
        if(this.d != ((CombinedClickableElement)object0).d) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((CombinedClickableElement)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((CombinedClickableElement)object0).f)) {
            return false;
        }
        if(this.g != ((CombinedClickableElement)object0).g) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((CombinedClickableElement)object0).h)) {
            return false;
        }
        return this.i == ((CombinedClickableElement)object0).i ? this.j == ((CombinedClickableElement)object0).j : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int v = 0;
        int v1 = a.g(this.g, ((a.e(((this.b == null ? 0 : this.b.hashCode()) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F, 0x1F, this.d) + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + (this.f == null ? 0 : Role.hashCode-impl(this.f.unbox-impl()))) * 0x1F, 0x1F);
        int v2 = this.h == null ? 0 : this.h.hashCode();
        int v3 = this.i == null ? 0 : this.i.hashCode();
        Function0 function00 = this.j;
        if(function00 != null) {
            v = function00.hashCode();
        }
        return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("combinedClickable");
        inspectorInfo0.getProperties().set("indicationNodeFactory", this.c);
        inspectorInfo0.getProperties().set("interactionSource", this.b);
        a.k(this.d, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("onClickLabel", this.e);
        inspectorInfo0.getProperties().set("role", this.f);
        inspectorInfo0.getProperties().set("onClick", this.g);
        inspectorInfo0.getProperties().set("onDoubleClick", this.j);
        inspectorInfo0.getProperties().set("onLongClick", this.i);
        inspectorInfo0.getProperties().set("onLongClickLabel", this.h);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((h1)modifier$Node0).update-nSzSaCc(this.g, this.h, this.i, this.j, this.b, this.c, this.d, this.e, this.f);
    }
}

