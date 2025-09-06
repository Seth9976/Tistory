package t;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingFunctionsKt;

public final class j implements Easing {
    public final int a;

    public j(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.compose.animation.core.Easing
    public final float transform(float f) {
        switch(this.a) {
            case 0: {
                if(f != 0.0f) {
                    return f == 1.0f ? 1.0f : ((float)(Math.sin(((double)(f * 10.0f - 10.75f)) * 2.094395) * ((double)(-((float)Math.pow(2.0, f * 10.0f - 10.0f))))));
                }
                return 0.0f;
            }
            case 1: {
                if(f != 0.0f) {
                    return f == 1.0f ? 1.0f : ((float)(Math.sin(((double)(f * 10.0f - 0.75f)) * 2.094395) * ((double)(((float)Math.pow(2.0, -10.0f * f)))) + 1.0));
                }
                return 0.0f;
            }
            case 2: {
                if(f != 0.0f) {
                    if(f == 1.0f) {
                        return 1.0f;
                    }
                    return Float.compare(0.0f, f) > 0 || f > 0.5f ? ((float)(Math.sin(((double)(f * 20.0f - 11.125f)) * 1.396263) * ((double)(((float)Math.pow(2.0, -20.0f * f + 10.0f)))) / 2.0)) + 1.0f : ((float)(-(Math.sin(((double)(f * 20.0f - 11.125f)) * 1.396263) * ((double)(((float)Math.pow(2.0, f * 20.0f - 10.0f))))) / 2.0));
                }
                return 0.0f;
            }
            case 3: {
                if(Float.compare(f, 0.363636f) < 0) {
                    return 7.5625f * f * f;
                }
                if(f < 0.727273f) {
                    return 7.5625f * (f - 0.545455f) * (f - 0.545455f) + 0.75f;
                }
                return f < 0.909091f ? 7.5625f * (f - 0.818182f) * (f - 0.818182f) + 0.9375f : 7.5625f * (f - 0.954545f) * (f - 0.954545f) + 0.984375f;
            }
            case 4: {
                return 1.0f - EasingFunctionsKt.F.transform(1.0f - f);
            }
            case 5: {
                return Double.compare(f, 0.5) >= 0 ? (EasingFunctionsKt.F.transform(f * 2.0f - 1.0f) + 1.0f) / 2.0f : (1.0f - EasingFunctionsKt.F.transform(1.0f - f * 2.0f)) / 2.0f;
            }
            default: {
                return f;
            }
        }
    }
}

