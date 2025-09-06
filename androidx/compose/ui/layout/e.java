package androidx.compose.ui.layout;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode.LayoutState;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class e implements SubcomposeMeasureScope {
    public LayoutDirection a;
    public float b;
    public float c;
    public final LayoutNodeSubcompositionsState d;

    public e(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0) {
        this.d = layoutNodeSubcompositionsState0;
        this.a = LayoutDirection.Rtl;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.b;
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.c;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return this.d.a.getLayoutState$ui_release() == LayoutState.LookaheadLayingOut || this.d.a.getLayoutState$ui_release() == LayoutState.LookaheadMeasuring;
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(int v, int v1, Map map0, Function1 function10, Function1 function11) {
        if((v & 0xFF000000) != 0 || (0xFF000000 & v1) != 0) {
            InlineClassHelperKt.throwIllegalStateException(("Size(" + v + " x " + v1 + ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new LayoutNodeSubcompositionsState.Scope.layout.1(v, v1, map0, function10, this, this.d, function11);
    }

    @Override  // androidx.compose.ui.layout.SubcomposeMeasureScope
    public final List subcompose(Object object0, Function2 function20) {
        return this.d.subcompose(object0, function20);
    }
}

