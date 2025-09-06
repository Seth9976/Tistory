package s;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.ChangeSize;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.GraphicsLayerBlockForEnterExit;
import androidx.compose.animation.LayoutModifierNodeWithPassThroughIntrinsics;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class y0 extends LayoutModifierNodeWithPassThroughIntrinsics {
    public Transition n;
    public DeferredAnimation o;
    public DeferredAnimation p;
    public DeferredAnimation q;
    public EnterTransition r;
    public ExitTransition s;
    public Function0 t;
    public GraphicsLayerBlockForEnterExit u;
    public long v;
    public Alignment w;
    public final w0 x;
    public final x0 y;

    public y0(Transition transition0, DeferredAnimation transition$DeferredAnimation0, DeferredAnimation transition$DeferredAnimation1, DeferredAnimation transition$DeferredAnimation2, EnterTransition enterTransition0, ExitTransition exitTransition0, Function0 function00, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit0) {
        this.n = transition0;
        this.o = transition$DeferredAnimation0;
        this.p = transition$DeferredAnimation1;
        this.q = transition$DeferredAnimation2;
        this.r = enterTransition0;
        this.s = exitTransition0;
        this.t = function00;
        this.u = graphicsLayerBlockForEnterExit0;
        this.v = 0x8000000080000000L;
        ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.x = new w0(this);
        this.y = new x0(this);
    }

    public final Alignment getAlignment() {
        Alignment alignment0;
        if(this.n.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize0 = this.r.getData$animation_release().getChangeSize();
            if(changeSize0 != null) {
                alignment0 = changeSize0.getAlignment();
                if(alignment0 == null) {
                    goto label_5;
                }
                return alignment0;
            }
        label_5:
            ChangeSize changeSize1 = this.s.getData$animation_release().getChangeSize();
            return changeSize1 == null ? null : changeSize1.getAlignment();
        }
        ChangeSize changeSize2 = this.s.getData$animation_release().getChangeSize();
        if(changeSize2 != null) {
            alignment0 = changeSize2.getAlignment();
            if(alignment0 != null) {
                return alignment0;
            }
        }
        ChangeSize changeSize3 = this.r.getData$animation_release().getChangeSize();
        return changeSize3 == null ? null : changeSize3.getAlignment();
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        long v6;
        long v5;
        State state0 = null;
        if(this.n.getCurrentState() == this.n.getTargetState()) {
            this.w = null;
        }
        else if(this.w == null) {
            Alignment alignment0 = this.getAlignment();
            if(alignment0 == null) {
                alignment0 = Alignment.Companion.getTopStart();
            }
            this.w = alignment0;
        }
        if(measureScope0.isLookingAhead()) {
            Placeable placeable0 = measurable0.measure-BRTryo0(v);
            long v1 = IntSizeKt.IntSize(placeable0.getWidth(), placeable0.getHeight());
            this.v = v1;
            return MeasureScope.layout$default(measureScope0, IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1), null, new r0(placeable0), 4, null);
        }
        if(((Boolean)this.t.invoke()).booleanValue()) {
            Function1 function10 = this.u.init();
            Placeable placeable1 = measurable0.measure-BRTryo0(v);
            long v2 = IntSizeKt.IntSize(placeable1.getWidth(), placeable1.getHeight());
            long v3 = AnimationModifierKt.isValid-ozmzZPI(this.v) ? this.v : v2;
            DeferredAnimation transition$DeferredAnimation0 = this.o;
            if(transition$DeferredAnimation0 != null) {
                u0 u00 = new u0(this, v3, 0);
                state0 = transition$DeferredAnimation0.animate(this.x, u00);
            }
            if(state0 != null) {
                v2 = ((IntSize)state0.getValue()).unbox-impl();
            }
            long v4 = ConstraintsKt.constrain-4WqzIAM(v, v2);
            DeferredAnimation transition$DeferredAnimation1 = this.p;
            if(transition$DeferredAnimation1 == null) {
                v5 = 0L;
            }
            else {
                u0 u01 = new u0(this, v3, 1);
                State state1 = transition$DeferredAnimation1.animate(v0.w, u01);
                v5 = state1 == null ? 0L : ((IntOffset)state1.getValue()).unbox-impl();
            }
            DeferredAnimation transition$DeferredAnimation2 = this.q;
            if(transition$DeferredAnimation2 == null) {
                v6 = 0L;
            }
            else {
                u0 u02 = new u0(this, v3, 2);
                State state2 = transition$DeferredAnimation2.animate(this.y, u02);
                v6 = state2 == null ? 0L : ((IntOffset)state2.getValue()).unbox-impl();
            }
            Alignment alignment1 = this.w;
            return alignment1 == null ? MeasureScope.layout$default(measureScope0, IntSize.getWidth-impl(v4), IntSize.getHeight-impl(v4), null, new s0(placeable1, IntOffset.plus-qkQi6aY(0L, v6), v5, function10), 4, null) : MeasureScope.layout$default(measureScope0, IntSize.getWidth-impl(v4), IntSize.getHeight-impl(v4), null, new s0(placeable1, IntOffset.plus-qkQi6aY(alignment1.align-KFBX0sM(v3, v4, LayoutDirection.Ltr), v6), v5, function10), 4, null);
        }
        Placeable placeable2 = measurable0.measure-BRTryo0(v);
        return MeasureScope.layout$default(measureScope0, placeable2.getWidth(), placeable2.getHeight(), null, new t0(placeable2), 4, null);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        super.onAttach();
        this.v = 0x8000000080000000L;
    }
}

