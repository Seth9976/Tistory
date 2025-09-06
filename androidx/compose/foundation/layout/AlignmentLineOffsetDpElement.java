package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class AlignmentLineOffsetDpElement extends ModifierNodeElement {
    public final AlignmentLine b;
    public final float c;
    public final float d;
    public final Function1 e;

    public AlignmentLineOffsetDpElement(AlignmentLine alignmentLine0, float f, float f1, Function1 function10) {
        this.b = alignmentLine0;
        this.c = f;
        this.d = f1;
        this.e = function10;
        if(f < 0.0f && !Dp.equals-impl0(f, NaNf) || f1 < 0.0f && !Dp.equals-impl0(f1, NaNf)) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new c();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        modifier$Node0.p = this.d;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement0 = object0 instanceof AlignmentLineOffsetDpElement ? ((AlignmentLineOffsetDpElement)object0) : null;
        return alignmentLineOffsetDpElement0 == null ? false : Intrinsics.areEqual(this.b, alignmentLineOffsetDpElement0.b) && Dp.equals-impl0(this.c, alignmentLineOffsetDpElement0.c) && Dp.equals-impl0(this.d, alignmentLineOffsetDpElement0.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Dp.hashCode-impl(this.d) + a.C(this.c, this.b.hashCode() * 0x1F, 0x1F);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        this.e.invoke(inspectorInfo0);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((c)modifier$Node0).n = this.b;
        ((c)modifier$Node0).o = this.c;
        ((c)modifier$Node0).p = this.d;
    }
}

