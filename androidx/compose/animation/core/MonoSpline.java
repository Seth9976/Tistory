package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalAnimationSpecApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\r\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\'\u0010\r\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u0013J\u001D\u0010\u0014\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\'\u0010\u0014\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\u000B¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "", "time", "", "y", "", "periodicBias", "<init>", "([F[[FF)V", "t", "", "j", "getPos", "(FI)F", "Landroidx/compose/animation/core/AnimationVector;", "v", "index", "", "(FLandroidx/compose/animation/core/AnimationVector;I)V", "getSlope", "(F[F)V", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MonoSpline {
    public static final int $stable = 8;
    public final float[] a;
    public final float[][] b;
    public final float[][] c;
    public final float[] d;

    public MonoSpline(@NotNull float[] arr_f, @NotNull float[][] arr2_f, float f) {
        int v = arr2_f[0].length;
        this.d = new float[v];
        int v1 = arr_f.length - 1;
        float[][] arr2_f1 = new float[v1][];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr2_f1[v2] = new float[v];
        }
        float[][] arr2_f2 = new float[arr_f.length][];
        for(int v3 = 0; v3 < arr_f.length; ++v3) {
            arr2_f2[v3] = new float[v];
        }
        for(int v4 = 0; v4 < v; ++v4) {
            for(int v5 = 0; v5 < v1; ++v5) {
                float f1 = arr_f[v5 + 1] - arr_f[v5];
                float[] arr_f1 = arr2_f1[v5];
                float f2 = (arr2_f[v5 + 1][v4] - arr2_f[v5][v4]) / f1;
                arr_f1[v4] = f2;
                if(v5 == 0) {
                    arr2_f2[0][v4] = f2;
                }
                else {
                    arr2_f2[v5][v4] = (arr2_f1[v5 - 1][v4] + f2) * 0.5f;
                }
            }
            arr2_f2[v1][v4] = arr2_f1[arr_f.length - 2][v4];
        }
        if(!Float.isNaN(f)) {
            for(int v6 = 0; v6 < v; ++v6) {
                float[] arr_f2 = arr2_f1[arr_f.length - 2];
                float f3 = (1.0f - f) * arr_f2[v6];
                float[] arr_f3 = arr2_f1[0];
                float f4 = arr_f3[v6] * f + f3;
                arr_f3[v6] = f4;
                arr_f2[v6] = f4;
                arr2_f2[v1][v6] = f4;
                arr2_f2[0][v6] = f4;
            }
        }
        for(int v7 = 0; v7 < v1; ++v7) {
            for(int v8 = 0; v8 < v; ++v8) {
                float f5 = arr2_f1[v7][v8];
                if(f5 == 0.0f) {
                    arr2_f2[v7][v8] = 0.0f;
                    arr2_f2[v7 + 1][v8] = 0.0f;
                }
                else {
                    float f6 = arr2_f2[v7][v8] / f5;
                    float f7 = arr2_f2[v7 + 1][v8] / f5;
                    float f8 = (float)Math.hypot(f6, f7);
                    if(((double)f8) > 9.0) {
                        float[] arr_f4 = arr2_f2[v7];
                        float[] arr_f5 = arr2_f1[v7];
                        arr_f4[v8] = f6 * (3.0f / f8) * arr_f5[v8];
                        arr2_f2[v7 + 1][v8] = 3.0f / f8 * f7 * arr_f5[v8];
                    }
                }
            }
        }
        this.a = arr_f;
        this.b = arr2_f;
        this.c = arr2_f2;
    }

    public static float a(float f, float f1, float f2, float f3, float f4, float f5) {
        float f6 = f1 * f1;
        return f * f4 + (3.0f * f * f4 * f6 + (3.0f * f * f5 * f6 + (6.0f * f6 * f2 + (f3 * (6.0f * f1) + -6.0f * f6 * f3) - 6.0f * f1 * f2)) - 2.0f * f * f5 * f1 - 4.0f * f * f4 * f1);
    }

    public final float b(float f, int v) {
        float[] arr_f = this.a;
        float f1 = arr_f[0];
        if(f >= f1) {
            f1 = arr_f[arr_f.length - 1];
            if(f >= f1) {
                f = f1;
            }
        }
        else {
            f = f1;
        }
        int v2 = arr_f.length - 1;
        for(int v1 = 0; v1 < v2; ++v1) {
            float f2 = arr_f[v1 + 1];
            if(f <= f2) {
                float f3 = arr_f[v1];
                float f4 = f2 - f3;
                return MonoSpline.a(f4, (f - f3) / f4, this.b[v1][v], this.b[v1 + 1][v], this.c[v1][v], this.c[v1 + 1][v]) / f4;
            }
        }
        return 0.0f;
    }

    public static float c(float f, float f1, float f2, float f3, float f4, float f5) {
        float f6 = f1 * f1;
        float f7 = f6 * f1;
        return f * f4 * f1 + (f7 * (f * f4) + (f5 * f * f7 + (2.0f * f7 * f2 + (f3 * (3.0f * f6) + -2.0f * f7 * f3) - 3.0f * f6 * f2 + f2)) - f5 * f * f6 - 2.0f * f * f4 * f6);
    }

    public final float getPos(float f, int v) {
        float[] arr_f = this.a;
        float f1 = arr_f[0];
        float[][] arr2_f = this.b;
        if(Float.compare(f, f1) <= 0) {
            return this.b(f1, v) * (f - f1) + arr2_f[0][v];
        }
        int v2 = arr_f.length - 1;
        float f2 = arr_f[v2];
        if(f >= f2) {
            return this.b(f2, v) * (f - f2) + arr2_f[v2][v];
        }
        int v3 = arr_f.length - 1;
        for(int v1 = 0; v1 < v3; ++v1) {
            float f3 = arr_f[v1];
            if(f == f3) {
                return arr2_f[v1][v];
            }
            float f4 = arr_f[v1 + 1];
            if(f < f4) {
                return MonoSpline.c(f4 - f3, (f - f3) / (f4 - f3), arr2_f[v1][v], arr2_f[v1 + 1][v], this.c[v1][v], this.c[v1 + 1][v]);
            }
        }
        return 0.0f;
    }

    public final void getPos(float f, @NotNull AnimationVector animationVector0, int v) {
        float[] arr_f = this.a;
        float[][] arr2_f = this.b;
        int v1 = 0;
        int v2 = arr2_f[0].length;
        float f1 = arr_f[0];
        float[] arr_f1 = this.d;
        if(Float.compare(f, f1) <= 0) {
            this.getSlope(f1, arr_f1);
            for(int v3 = 0; v3 < v2; ++v3) {
                animationVector0.set$animation_core_release(v3, (f - arr_f[0]) * arr_f1[v3] + arr2_f[0][v3]);
            }
            return;
        }
        int v4 = arr_f.length - 1;
        float f2 = arr_f[v4];
        if(f >= f2) {
            this.getSlope(f2, arr_f1);
            while(v1 < v2) {
                animationVector0.set$animation_core_release(v1, (f - arr_f[v4]) * arr_f1[v1] + arr2_f[v4][v1]);
                ++v1;
            }
            return;
        }
        int v5 = arr_f.length - 1;
        for(int v6 = v; v6 < v5; ++v6) {
            if(f == arr_f[v6]) {
                for(int v7 = 0; v7 < v2; ++v7) {
                    animationVector0.set$animation_core_release(v7, arr2_f[v6][v7]);
                }
            }
            float f3 = arr_f[v6 + 1];
            if(f < f3) {
                float f4 = arr_f[v6];
                while(v1 < v2) {
                    animationVector0.set$animation_core_release(v1, MonoSpline.c(f3 - f4, (f - f4) / (f3 - f4), arr2_f[v6][v1], arr2_f[v6 + 1][v1], this.c[v6][v1], this.c[v6 + 1][v1]));
                    ++v1;
                }
                return;
            }
        }
    }

    public static void getPos$default(MonoSpline monoSpline0, float f, AnimationVector animationVector0, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        monoSpline0.getPos(f, animationVector0, v);
    }

    public final void getSlope(float f, @NotNull AnimationVector animationVector0, int v) {
        float[] arr_f = this.a;
        float[][] arr2_f = this.b;
        int v1 = 0;
        int v2 = arr2_f[0].length;
        float[][] arr2_f1 = this.c;
        if(Float.compare(f, arr_f[0]) <= 0) {
            for(int v3 = 0; v3 < v2; ++v3) {
                animationVector0.set$animation_core_release(v3, arr2_f1[0][v3]);
            }
            return;
        }
        int v4 = arr_f.length - 1;
        if(f >= arr_f[v4]) {
            while(v1 < v2) {
                animationVector0.set$animation_core_release(v1, arr2_f1[v4][v1]);
                ++v1;
            }
            return;
        }
        for(int v5 = v; v5 < v4; ++v5) {
            float f1 = arr_f[v5 + 1];
            if(f <= f1) {
                float f2 = arr_f[v5];
                float f3 = f1 - f2;
                while(v1 < v2) {
                    animationVector0.set$animation_core_release(v1, MonoSpline.a(f3, (f - f2) / f3, arr2_f[v5][v1], arr2_f[v5 + 1][v1], arr2_f1[v5][v1], arr2_f1[v5 + 1][v1]) / f3);
                    ++v1;
                }
                return;
            }
        }
    }

    public final void getSlope(float f, @NotNull float[] arr_f) {
        float[] arr_f1 = this.a;
        float[][] arr2_f = this.b;
        int v1 = arr2_f[0].length;
        float f1 = arr_f1[0];
        if(f > f1) {
            f1 = arr_f1[arr_f1.length - 1];
            if(f < f1) {
                f1 = f;
            }
        }
        int v2 = arr_f1.length - 1;
        for(int v3 = 0; v3 < v2; ++v3) {
            float f2 = arr_f1[v3 + 1];
            if(f1 <= f2) {
                float f3 = arr_f1[v3];
                float f4 = f2 - f3;
                for(int v = 0; v < v1; ++v) {
                    arr_f[v] = MonoSpline.a(f4, (f1 - f3) / f4, arr2_f[v3][v], arr2_f[v3 + 1][v], this.c[v3][v], this.c[v3 + 1][v]) / f4;
                }
                return;
            }
        }
    }

    public static void getSlope$default(MonoSpline monoSpline0, float f, AnimationVector animationVector0, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        monoSpline0.getSlope(f, animationVector0, v);
    }
}

