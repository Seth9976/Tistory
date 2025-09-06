package u;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.MarqueeAnimationMode;
import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import p9.a;

public final class q2 extends Node implements FocusEventModifierNode, DrawModifierNode, LayoutModifierNode {
    public int n;
    public int o;
    public int p;
    public float q;
    public final MutableIntState r;
    public final MutableIntState s;
    public final MutableState t;
    public Job u;
    public final MutableState v;
    public final MutableState w;
    public final Animatable x;
    public final State y;

    public q2(int v, int v1, int v2, int v3, MarqueeSpacing marqueeSpacing0, float f) {
        this.n = v;
        this.o = v2;
        this.p = v3;
        this.q = f;
        this.r = SnapshotIntStateKt.mutableIntStateOf(0);
        this.s = SnapshotIntStateKt.mutableIntStateOf(0);
        this.t = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.v = SnapshotStateKt.mutableStateOf$default(marqueeSpacing0, null, 2, null);
        this.w = SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.box-impl(v1), null, 2, null);
        this.x = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.y = SnapshotStateKt.derivedStateOf(new a(8, marqueeSpacing0, this));
    }

    public final float b() {
        float f = Math.signum(this.q);
        switch(DelegatableNodeKt.requireLayoutDirection(this)) {
            case 1: {
                return f * 1.0f;
            }
            case 2: {
                return f * -1.0f;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final int c() {
        return ((Number)this.y.getValue()).intValue();
    }

    public final void d() {
        Job job0 = this.u;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        if(this.isAttached()) {
            this.u = BuildersKt.launch$default(this.getCoroutineScope(), null, null, new n2(job0, this, null), 3, null);
        }
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope0) {
        int v3;
        boolean z1;
        boolean z;
        Animatable animatable0 = this.x;
        float f = ((Number)animatable0.getValue()).floatValue();
        float f1 = this.b() * f;
        int v = Float.compare(this.b(), 1.0f);
        MutableIntState mutableIntState0 = this.s;
        MutableIntState mutableIntState1 = this.r;
        if(v != 0) {
            z = ((Number)animatable0.getValue()).floatValue() < ((float)mutableIntState0.getIntValue());
        }
        else if(((Number)animatable0.getValue()).floatValue() < ((float)mutableIntState1.getIntValue())) {
            z = true;
        }
        else {
            z = false;
        }
        if(this.b() == 1.0f) {
            float f2 = ((Number)animatable0.getValue()).floatValue();
            int v1 = mutableIntState1.getIntValue();
            z1 = f2 > ((float)(this.c() + v1 - mutableIntState0.getIntValue()));
        }
        else {
            z1 = ((Number)animatable0.getValue()).floatValue() > ((float)this.c());
        }
        if(this.b() == 1.0f) {
            int v2 = mutableIntState1.getIntValue();
            v3 = this.c() + v2;
        }
        else {
            v3 = -mutableIntState1.getIntValue() - this.c();
        }
        float f3 = f1 + ((float)mutableIntState0.getIntValue());
        float f4 = Size.getHeight-impl(contentDrawScope0.getSize-NH-jbRc());
        DrawContext drawContext0 = contentDrawScope0.getDrawContext();
        long v4 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().clipRect-N_I0leg(f1, 0.0f, f3, f4, 1);
            if(z) {
                contentDrawScope0.drawContent();
            }
            if(z1) {
                contentDrawScope0.getDrawContext().getTransform().translate(((float)v3), 0.0f);
                try {
                    contentDrawScope0.drawContent();
                }
                catch(Throwable throwable0) {
                    contentDrawScope0.getDrawContext().getTransform().translate(-((float)v3), -0.0f);
                    throw throwable0;
                }
                contentDrawScope0.getDrawContext().getTransform().translate(-((float)v3), -0.0f);
            }
        }
        finally {
            r0.a.y(drawContext0, v4);
        }
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return intrinsicMeasurable0.maxIntrinsicHeight(0x7FFFFFFF);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return intrinsicMeasurable0.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0x7FFFFFFF, 0, 0, 13, null));
        int v1 = ConstraintsKt.constrainWidth-K40F9xA(v, placeable0.getWidth());
        this.s.setIntValue(v1);
        this.r.setIntValue(placeable0.getWidth());
        return MeasureScope.layout$default(measureScope0, this.s.getIntValue(), placeable0.getHeight(), null, new m2(placeable0, this), 4, null);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return intrinsicMeasurable0.minIntrinsicHeight(0x7FFFFFFF);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return 0;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        this.d();
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onDetach() {
        Job job0 = this.u;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.u = null;
    }

    @Override  // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(FocusState focusState0) {
        Boolean boolean0 = Boolean.valueOf(focusState0.getHasFocus());
        this.t.setValue(boolean0);
    }
}

