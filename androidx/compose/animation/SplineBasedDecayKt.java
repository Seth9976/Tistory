package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A!\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/DecayAnimationSpec;", "splineBasedDecay", "(Landroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/DecayAnimationSpec;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SplineBasedDecayKt {
    public static final void access$computeSplineInfo(float[] arr_f, float[] arr_f1, int v) {
        float f13;
        float f12;
        float f11;
        float f10;
        float f7;
        float f6;
        float f5;
        float f4;
        float f = 0.0f;
        float f1 = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            float f2 = ((float)v1) / ((float)v);
            float f3 = 1.0f;
            while(true) {
                f4 = (f3 - f) / 2.0f + f;
                f5 = 1.0f - f4;
                f6 = f4 * 3.0f * f5;
                f7 = f4 * f4 * f4;
                float f8 = (f4 * 0.35f + f5 * 0.175f) * f6 + f7;
                if(((double)Math.abs(f8 - f2)) < 0.00001) {
                    break;
                }
                if(f8 > f2) {
                    f3 = f4;
                }
                else {
                    f = f4;
                }
            }
            arr_f[v1] = (f5 * 0.5f + f4) * f6 + f7;
            float f9 = 1.0f;
            while(true) {
                f10 = (f9 - f1) / 2.0f + f1;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f14 = (f11 * 0.5f + f10) * f12 + f13;
                if(((double)Math.abs(f14 - f2)) < 0.00001) {
                    break;
                }
                if(f14 > f2) {
                    f9 = f10;
                }
                else {
                    f1 = f10;
                }
            }
            arr_f1[v1] = (f10 * 0.35f + f11 * 0.175f) * f12 + f13;
        }
        arr_f1[v] = 1.0f;
        arr_f[v] = 1.0f;
    }

    @NotNull
    public static final DecayAnimationSpec splineBasedDecay(@NotNull Density density0) {
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density0));
    }
}

