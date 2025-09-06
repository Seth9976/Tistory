package s;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt.createGraphicsLayerBlock.1.1.transformOrigin.2.WhenMappings;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.Scale;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function1 {
    public final TransformOrigin w;
    public final EnterTransition x;
    public final ExitTransition y;

    public h0(TransformOrigin transformOrigin0, EnterTransition enterTransition0, ExitTransition exitTransition0) {
        this.w = transformOrigin0;
        this.x = enterTransition0;
        this.y = exitTransition0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TransformOrigin transformOrigin0;
        int v = EnterExitTransitionKt.createGraphicsLayerBlock.1.1.transformOrigin.2.WhenMappings.$EnumSwitchMapping$0[((EnterExitState)object0).ordinal()];
        if(v == 1) {
            transformOrigin0 = this.w;
        }
        else {
            transformOrigin0 = null;
            EnterTransition enterTransition0 = this.x;
            ExitTransition exitTransition0 = this.y;
            switch(v) {
                case 2: {
                    Scale scale0 = enterTransition0.getData$animation_release().getScale();
                    if(scale0 != null) {
                        transformOrigin0 = TransformOrigin.box-impl(scale0.getTransformOrigin-SzJe1aQ());
                        return transformOrigin0 == null ? TransformOrigin.box-impl(0x3F0000003F000000L) : TransformOrigin.box-impl(transformOrigin0.unbox-impl());
                    }
                    scale0 = exitTransition0.getData$animation_release().getScale();
                    if(scale0 != null) {
                        transformOrigin0 = TransformOrigin.box-impl(scale0.getTransformOrigin-SzJe1aQ());
                        return transformOrigin0 == null ? TransformOrigin.box-impl(0x3F0000003F000000L) : TransformOrigin.box-impl(transformOrigin0.unbox-impl());
                    }
                    break;
                }
                case 3: {
                    Scale scale1 = exitTransition0.getData$animation_release().getScale();
                    if(scale1 != null) {
                        transformOrigin0 = TransformOrigin.box-impl(scale1.getTransformOrigin-SzJe1aQ());
                        return transformOrigin0 == null ? TransformOrigin.box-impl(0x3F0000003F000000L) : TransformOrigin.box-impl(transformOrigin0.unbox-impl());
                    }
                    scale1 = enterTransition0.getData$animation_release().getScale();
                    if(scale1 != null) {
                        transformOrigin0 = TransformOrigin.box-impl(scale1.getTransformOrigin-SzJe1aQ());
                        return transformOrigin0 == null ? TransformOrigin.box-impl(0x3F0000003F000000L) : TransformOrigin.box-impl(transformOrigin0.unbox-impl());
                    }
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return transformOrigin0 == null ? TransformOrigin.box-impl(0x3F0000003F000000L) : TransformOrigin.box-impl(transformOrigin0.unbox-impl());
    }
}

