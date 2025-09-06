package s;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.Fade;
import androidx.compose.animation.Scale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function1 {
    public final int w;
    public final EnterTransition x;
    public final ExitTransition y;

    public d0(EnterTransition enterTransition0, ExitTransition exitTransition0, int v) {
        this.w = v;
        this.x = enterTransition0;
        this.y = exitTransition0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            float f = 1.0f;
            switch(((EnterExitState)object0)) {
                case 1: {
                    break;
                }
                case 2: {
                    Scale scale1 = this.x.getData$animation_release().getScale();
                    if(scale1 != null) {
                        f = scale1.getScale();
                    }
                    break;
                }
                case 3: {
                    Scale scale0 = this.y.getData$animation_release().getScale();
                    return scale0 == null ? 1.0f : scale0.getScale();
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return f;
        }
        float f1 = 1.0f;
        switch(((EnterExitState)object0)) {
            case 1: {
                break;
            }
            case 2: {
                Fade fade1 = this.x.getData$animation_release().getFade();
                if(fade1 != null) {
                    f1 = fade1.getAlpha();
                }
                break;
            }
            case 3: {
                Fade fade0 = this.y.getData$animation_release().getFade();
                return fade0 == null ? 1.0f : fade0.getAlpha();
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return f1;
    }
}

