package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/n3;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n148#2:485\n148#2:486\n148#2:487\n148#2:488\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n*L\n344#1:485\n345#1:486\n346#1:487\n347#1:488\n*E\n"})
final class PaddingElement extends ModifierNodeElement {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Lambda g;

    public PaddingElement(float f, float f1, float f2, float f3, boolean z, Function1 function10) {
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = (Lambda)function10;
        if(f < 0.0f && !Dp.equals-impl0(f, NaNf) || f1 < 0.0f && !Dp.equals-impl0(f1, NaNf) || f2 < 0.0f && !Dp.equals-impl0(f2, NaNf) || f3 < 0.0f && !Dp.equals-impl0(f3, NaNf)) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new n3();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        modifier$Node0.p = this.d;
        modifier$Node0.q = this.e;
        modifier$Node0.r = this.f;
        return modifier$Node0;
    }

    // 去混淆评级： 低(35)
    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        PaddingElement paddingElement0 = object0 instanceof PaddingElement ? ((PaddingElement)object0) : null;
        return paddingElement0 == null ? false : Dp.equals-impl0(this.b, paddingElement0.b) && Dp.equals-impl0(this.c, paddingElement0.c) && Dp.equals-impl0(this.d, paddingElement0.d) && Dp.equals-impl0(this.e, paddingElement0.e) && this.f == paddingElement0.f;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.f) + a.C(this.e, a.C(this.d, a.C(this.c, Dp.hashCode-impl(this.b) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        ((Function1)this.g).invoke(inspectorInfo0);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((n3)modifier$Node0).n = this.b;
        ((n3)modifier$Node0).o = this.c;
        ((n3)modifier$Node0).p = this.d;
        ((n3)modifier$Node0).q = this.e;
        ((n3)modifier$Node0).r = this.f;
    }
}

