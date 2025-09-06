package s;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.LayoutModifierNodeWithPassThroughIntrinsics;
import androidx.compose.animation.SizeAnimationModifierNode.AnimData;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;

public final class p1 extends LayoutModifierNodeWithPassThroughIntrinsics {
    public AnimationSpec n;
    public Alignment o;
    public Function2 p;
    public long q;
    public long r;
    public boolean s;
    public final MutableState t;

    public p1(AnimationSpec animationSpec0, Alignment alignment0, Function2 function20) {
        this.n = animationSpec0;
        this.o = alignment0;
        this.p = function20;
        this.q = 0x8000000080000000L;
        this.r = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.t = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        long v2;
        Placeable placeable0;
        boolean z = true;
        if(measureScope0.isLookingAhead()) {
            this.r = v;
            this.s = true;
            placeable0 = measurable0.measure-BRTryo0(v);
        }
        else {
            placeable0 = measurable0.measure-BRTryo0((this.s ? this.r : v));
        }
        long v1 = IntSizeKt.IntSize(placeable0.getWidth(), placeable0.getHeight());
        if(measureScope0.isLookingAhead()) {
            this.q = v1;
            v2 = v1;
        }
        else {
            long v3 = AnimationModifierKt.isValid-ozmzZPI(this.q) ? this.q : v1;
            MutableState mutableState0 = this.t;
            SizeAnimationModifierNode.AnimData sizeAnimationModifierNode$AnimData0 = (SizeAnimationModifierNode.AnimData)mutableState0.getValue();
            if(sizeAnimationModifierNode$AnimData0 == null) {
                IntSize intSize0 = IntSize.box-impl(v3);
                IntSize intSize1 = IntSize.box-impl(0x100000001L);
                sizeAnimationModifierNode$AnimData0 = new SizeAnimationModifierNode.AnimData(new Animatable(intSize0, VectorConvertersKt.getVectorConverter(IntSize.Companion), intSize1, null, 8, null), v3, null);
            }
            else {
                if(IntSize.equals-impl0(v3, ((IntSize)sizeAnimationModifierNode$AnimData0.getAnim().getValue()).unbox-impl()) || sizeAnimationModifierNode$AnimData0.getAnim().isRunning()) {
                    z = false;
                }
                if(!IntSize.equals-impl0(v3, ((IntSize)sizeAnimationModifierNode$AnimData0.getAnim().getTargetValue()).unbox-impl()) || z) {
                    sizeAnimationModifierNode$AnimData0.setStartSize-ozmzZPI(((IntSize)sizeAnimationModifierNode$AnimData0.getAnim().getValue()).unbox-impl());
                    BuildersKt.launch$default(this.getCoroutineScope(), null, null, new n1(sizeAnimationModifierNode$AnimData0, v3, this, null), 3, null);
                }
            }
            mutableState0.setValue(sizeAnimationModifierNode$AnimData0);
            v2 = ConstraintsKt.constrain-4WqzIAM(v, ((IntSize)sizeAnimationModifierNode$AnimData0.getAnim().getValue()).unbox-impl());
        }
        int v4 = IntSize.getWidth-impl(v2);
        int v5 = IntSize.getHeight-impl(v2);
        return MeasureScope.layout$default(measureScope0, v4, v5, null, new o1(this, v1, v4, v5, measureScope0, placeable0), 4, null);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        super.onAttach();
        this.q = 0x8000000080000000L;
        this.s = false;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onReset() {
        super.onReset();
        this.t.setValue(null);
    }
}

