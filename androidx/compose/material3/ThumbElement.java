package androidx.compose.material3;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/ThumbElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/ip;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class ThumbElement extends ModifierNodeElement {
    public final InteractionSource b;
    public final boolean c;

    public ThumbElement(InteractionSource interactionSource0, boolean z) {
        this.b = interactionSource0;
        this.c = z;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new ip();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        modifier$Node0.s = NaNf;
        modifier$Node0.t = NaNf;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ThumbElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((ThumbElement)object0).b) ? this.c == ((ThumbElement)object0).c : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.c) + this.b.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("switchThumb");
        inspectorInfo0.getProperties().set("interactionSource", this.b);
        inspectorInfo0.getProperties().set("checked", Boolean.valueOf(this.c));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ThumbElement(interactionSource=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", checked=");
        return a.p(stringBuilder0, this.c, ')');
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((ip)modifier$Node0).n = this.b;
        boolean z = this.c;
        if(((ip)modifier$Node0).o != z) {
            LayoutModifierNodeKt.invalidateMeasurement(((ip)modifier$Node0));
        }
        ((ip)modifier$Node0).o = z;
        if(((ip)modifier$Node0).r == null && !Float.isNaN(((ip)modifier$Node0).t)) {
            ((ip)modifier$Node0).r = AnimatableKt.Animatable$default(((ip)modifier$Node0).t, 0.0f, 2, null);
        }
        if(((ip)modifier$Node0).q == null && !Float.isNaN(((ip)modifier$Node0).s)) {
            ((ip)modifier$Node0).q = AnimatableKt.Animatable$default(((ip)modifier$Node0).s, 0.0f, 2, null);
        }
    }
}

