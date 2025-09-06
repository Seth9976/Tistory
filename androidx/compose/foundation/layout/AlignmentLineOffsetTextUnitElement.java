package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class AlignmentLineOffsetTextUnitElement extends ModifierNodeElement {
    public final AlignmentLine b;
    public final long c;
    public final long d;
    public final Function1 e;

    public AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine0, long v, long v1, Function1 function10) {
        this.b = alignmentLine0;
        this.c = v;
        this.d = v1;
        this.e = function10;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new d();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
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
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement0 = object0 instanceof AlignmentLineOffsetTextUnitElement ? ((AlignmentLineOffsetTextUnitElement)object0) : null;
        return alignmentLineOffsetTextUnitElement0 == null ? false : Intrinsics.areEqual(this.b, alignmentLineOffsetTextUnitElement0.b) && TextUnit.equals-impl0(this.c, alignmentLineOffsetTextUnitElement0.c) && TextUnit.equals-impl0(this.d, alignmentLineOffsetTextUnitElement0.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return TextUnit.hashCode-impl(this.d) + (TextUnit.hashCode-impl(this.c) + this.b.hashCode() * 0x1F) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        this.e.invoke(inspectorInfo0);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((d)modifier$Node0).n = this.b;
        ((d)modifier$Node0).o = this.c;
        ((d)modifier$Node0).p = this.d;
    }
}

