package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class d implements MeasureScope, SubcomposeMeasureScope {
    public final e a;
    public final LayoutNodeSubcompositionsState b;

    public d(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0) {
        this.b = layoutNodeSubcompositionsState0;
        this.a = layoutNodeSubcompositionsState0.h;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.a.b;
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.a.c;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.a.a;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return this.a.isLookingAhead();
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(int v, int v1, Map map0, Function1 function10) {
        return this.a.layout(v, v1, map0, function10);
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(int v, int v1, Map map0, Function1 function10, Function1 function11) {
        return this.a.layout(v, v1, map0, function10, function11);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int roundToPx--R2X_6o(long v) {
        return this.a.roundToPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int roundToPx-0680j_4(float f) {
        return this.a.roundToPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.layout.SubcomposeMeasureScope
    public final List subcompose(Object object0, Function2 function20) {
        LayoutNode layoutNode0 = (LayoutNode)this.b.g.get(object0);
        List list0 = layoutNode0 == null ? null : layoutNode0.getChildMeasurables$ui_release();
        return list0 == null ? LayoutNodeSubcompositionsState.access$postLookaheadSubcompose(this.b, object0, function20) : list0;
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public final float toDp-GaN1DYA(long v) {
        return this.a.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float toDp-u2uoSUM(float f) {
        return this.a.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float toDp-u2uoSUM(int v) {
        return this.a.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long toDpSize-k-rfVVM(long v) {
        return this.a.toDpSize-k-rfVVM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float toPx--R2X_6o(long v) {
        return this.a.toPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float toPx-0680j_4(float f) {
        return this.a.toPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final Rect toRect(DpRect dpRect0) {
        return this.a.toRect(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long toSize-XkaWNTQ(long v) {
        return this.a.toSize-XkaWNTQ(v);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public final long toSp-0xMU5do(float f) {
        return this.a.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long toSp-kPz2Gy4(float f) {
        return this.a.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long toSp-kPz2Gy4(int v) {
        return this.a.toSp-kPz2Gy4(v);
    }
}

