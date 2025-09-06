package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

public final class ip extends Node implements LayoutModifierNode {
    public InteractionSource n;
    public boolean o;
    public boolean p;
    public Animatable q;
    public Animatable r;
    public float s;
    public float t;

    @Override  // androidx.compose.ui.Modifier$Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        boolean z = measurable0.maxIntrinsicHeight(Constraints.getMaxWidth-impl(v)) == 0 || measurable0.maxIntrinsicWidth(Constraints.getMaxHeight-impl(v)) == 0;
        float f = measureScope0.toPx-0680j_4(0.0f);
        float f1 = this.r == null ? f : ((Number)this.r.getValue()).floatValue();
        Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.Companion.fixed-JhjzzOo(((int)f1), ((int)f1)));
        float f2 = measureScope0.toPx-0680j_4(Dp.constructor-impl(Dp.constructor-impl(0.0f - measureScope0.toDp-u2uoSUM(f)) / 2.0f));
        float f3 = measureScope0.toPx-0680j_4(0.0f);
        boolean z1 = this.p;
        if(z1 && this.o) {
            f2 = f3 - measureScope0.toPx-0680j_4(0.0f);
        }
        else if(z1 && !this.o) {
            f2 = measureScope0.toPx-0680j_4(0.0f);
        }
        else if(this.o) {
            f2 = f3;
        }
        if(!Intrinsics.areEqual((this.r == null ? null : ((Float)this.r.getTargetValue())), f)) {
            BuildersKt.launch$default(this.getCoroutineScope(), null, null, new dp(this, f, null), 3, null);
        }
        if(!Intrinsics.areEqual((this.q == null ? null : ((Float)this.q.getTargetValue())), f2)) {
            BuildersKt.launch$default(this.getCoroutineScope(), null, null, new ep(this, f2, null), 3, null);
        }
        if(Float.isNaN(this.t) && Float.isNaN(this.s)) {
            this.t = f;
            this.s = f2;
        }
        return MeasureScope.layout$default(measureScope0, ((int)f1), ((int)f1), null, new fp(placeable0, this, f2), 4, null);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        BuildersKt.launch$default(this.getCoroutineScope(), null, null, new hp(this, null), 3, null);
    }
}

