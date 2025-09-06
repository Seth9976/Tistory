package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import d0.c0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ld0/c0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class LazyLayoutSemanticsModifier extends ModifierNodeElement {
    public final Function0 b;
    public final LazyLayoutSemanticState c;
    public final Orientation d;
    public final boolean e;
    public final boolean f;

    public LazyLayoutSemanticsModifier(Function0 function00, LazyLayoutSemanticState lazyLayoutSemanticState0, Orientation orientation0, boolean z, boolean z1) {
        this.b = function00;
        this.c = lazyLayoutSemanticState0;
        this.d = orientation0;
        this.e = z;
        this.f = z1;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        return new c0(this.b, this.c, this.d, this.e, this.f);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        if(this.b != ((LazyLayoutSemanticsModifier)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((LazyLayoutSemanticsModifier)object0).c)) {
            return false;
        }
        if(this.d != ((LazyLayoutSemanticsModifier)object0).d) {
            return false;
        }
        return this.e == ((LazyLayoutSemanticsModifier)object0).e ? this.f == ((LazyLayoutSemanticsModifier)object0).f : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.f) + a.e((this.d.hashCode() + (this.c.hashCode() + this.b.hashCode() * 0x1F) * 0x1F) * 0x1F, 0x1F, this.e);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((c0)modifier$Node0).n = this.b;
        ((c0)modifier$Node0).o = this.c;
        Orientation orientation0 = this.d;
        if(((c0)modifier$Node0).p != orientation0) {
            ((c0)modifier$Node0).p = orientation0;
            SemanticsModifierNodeKt.invalidateSemantics(((c0)modifier$Node0));
        }
        boolean z = this.e;
        boolean z1 = this.f;
        if(((c0)modifier$Node0).q != z || ((c0)modifier$Node0).r != z1) {
            ((c0)modifier$Node0).q = z;
            ((c0)modifier$Node0).r = z1;
            ((c0)modifier$Node0).b();
            SemanticsModifierNodeKt.invalidateSemantics(((c0)modifier$Node0));
        }
    }
}

