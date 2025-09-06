package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.jetbrains.annotations.NotNull;
import x1.c;
import x1.d;
import x1.e;
import x1.f;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0014\u001A\u00020\u00112\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u001A\u0010\u001D\u001A\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR*\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u001E\u001A\u00020\u00058\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\b\u001A\u00020\u00072\u0006\u0010\u001E\u001A\u00020\u00078\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "", "overrideDescendants", "<init>", "(Landroidx/compose/ui/input/pointer/PointerIcon;Z)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "()V", "onDetach", "", "n", "Ljava/lang/String;", "getTraverseKey", "()Ljava/lang/String;", "traverseKey", "value", "o", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getIcon", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "setIcon", "(Landroidx/compose/ui/input/pointer/PointerIcon;)V", "p", "Z", "getOverrideDescendants", "()Z", "setOverrideDescendants", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PointerHoverIconModifierNode extends Node implements CompositionLocalConsumerModifierNode, PointerInputModifierNode, TraversableNode {
    public static final int $stable = 8;
    public final String n;
    public PointerIcon o;
    public boolean p;
    public boolean q;

    public PointerHoverIconModifierNode(@NotNull PointerIcon pointerIcon0, boolean z) {
        this.n = "androidx.compose.ui.input.pointer.PointerHoverIcon";
        this.o = pointerIcon0;
        this.p = z;
    }

    public PointerHoverIconModifierNode(PointerIcon pointerIcon0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(pointerIcon0, z);
    }

    public final void b() {
        PointerIcon pointerIcon0;
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new f(ref$ObjectRef0));
        PointerHoverIconModifierNode pointerHoverIconModifierNode0 = (PointerHoverIconModifierNode)ref$ObjectRef0.element;
        if(pointerHoverIconModifierNode0 == null) {
            pointerIcon0 = this.o;
        }
        else {
            pointerIcon0 = pointerHoverIconModifierNode0.o;
            if(pointerIcon0 == null) {
                pointerIcon0 = this.o;
            }
        }
        PointerIconService pointerIconService0 = (PointerIconService)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
        if(pointerIconService0 != null) {
            pointerIconService0.setIcon(pointerIcon0);
        }
    }

    public final void c() {
        BooleanRef ref$BooleanRef0 = new BooleanRef();
        ref$BooleanRef0.element = true;
        if(!this.p) {
            TraversableNodeKt.traverseDescendants(this, new d(ref$BooleanRef0));
        }
        if(ref$BooleanRef0.element) {
            this.b();
        }
    }

    public final void d() {
        Unit unit0;
        if(this.q) {
            this.q = false;
            if(this.isAttached()) {
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                TraversableNodeKt.traverseAncestors(this, new c(ref$ObjectRef0));
                PointerHoverIconModifierNode pointerHoverIconModifierNode0 = (PointerHoverIconModifierNode)ref$ObjectRef0.element;
                if(pointerHoverIconModifierNode0 == null) {
                    unit0 = null;
                }
                else {
                    pointerHoverIconModifierNode0.b();
                    unit0 = Unit.INSTANCE;
                }
                if(unit0 == null) {
                    PointerIconService pointerIconService0 = (PointerIconService)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
                    if(pointerIconService0 != null) {
                        pointerIconService0.setIcon(null);
                    }
                }
            }
        }
    }

    @NotNull
    public final PointerIcon getIcon() {
        return this.o;
    }

    public final boolean getOverrideDescendants() {
        return this.p;
    }

    @Override  // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.getTraverseKey();
    }

    @NotNull
    public String getTraverseKey() {
        return this.n;
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.d();
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        this.d();
        super.onDetach();
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onPointerEvent-H0pRuoY(@NotNull PointerEvent pointerEvent0, @NotNull PointerEventPass pointerEventPass0, long v) {
        if(pointerEventPass0 == PointerEventPass.Main) {
            if(PointerEventType.equals-impl0(pointerEvent0.getType-7fucELk(), 4)) {
                this.q = true;
                this.c();
                return;
            }
            if(PointerEventType.equals-impl0(pointerEvent0.getType-7fucELk(), 5)) {
                this.d();
            }
        }
    }

    public final void setIcon(@NotNull PointerIcon pointerIcon0) {
        if(!Intrinsics.areEqual(this.o, pointerIcon0)) {
            this.o = pointerIcon0;
            if(this.q) {
                this.c();
            }
        }
    }

    public final void setOverrideDescendants(boolean z) {
        if(this.p != z) {
            this.p = z;
            if(z) {
                if(this.q) {
                    this.b();
                }
            }
            else if(this.q) {
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                TraversableNodeKt.traverseDescendants(this, new e(ref$ObjectRef0));
                PointerHoverIconModifierNode pointerHoverIconModifierNode0 = (PointerHoverIconModifierNode)ref$ObjectRef0.element;
                if(pointerHoverIconModifierNode0 == null) {
                    pointerHoverIconModifierNode0 = this;
                }
                pointerHoverIconModifierNode0.b();
            }
        }
    }
}

