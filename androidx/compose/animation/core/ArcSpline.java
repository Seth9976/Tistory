package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@ExperimentalAnimationSpecApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u0004¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0010\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000F¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/core/ArcSpline;", "", "", "arcModes", "", "timePoints", "", "y", "<init>", "([I[F[[F)V", "", "time", "v", "", "getPos", "(F[F)V", "getSlope", "Companion", "Arc", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ArcSpline {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%BA\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\u0004¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001A\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001A\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0016\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001A\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0012J\r\u0010\u001A\u001A\u00020\u0004¢\u0006\u0004\b\u001A\u0010\u0012R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u0012R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001C\u001A\u0004\b\u001F\u0010\u0012R\u0017\u0010#\u001A\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc;", "", "", "mode", "", "time1", "time2", "x1", "y1", "x2", "y2", "<init>", "(IFFFFFF)V", "time", "", "setPoint", "(F)V", "calcX", "()F", "calcY", "calcDX", "calcDY", "getLinearX", "(F)F", "getLinearY", "getLinearDX", "getLinearDY", "a", "F", "getTime1", "b", "getTime2", "", "r", "Z", "isLinear", "()Z", "Companion", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Arc {
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc$Companion;", "", "", "Epsilon", "F", "", "_ourPercent", "[F", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            public static final float[] access$getOurPercent(Companion arcSpline$Arc$Companion0) {
                float[] arr_f;
                arcSpline$Arc$Companion0.getClass();
                if(Arc.s != null) {
                    arr_f = Arc.s;
                    Intrinsics.checkNotNull(arr_f);
                    return arr_f;
                }
                Arc.s = new float[91];
                arr_f = Arc.s;
                Intrinsics.checkNotNull(arr_f);
                return arr_f;
            }
        }

        public static final int $stable;
        @NotNull
        public static final Companion Companion;
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public float h;
        public float i;
        public final float[] j;
        public final float k;
        public final float l;
        public final float m;
        public final float n;
        public final float o;
        public final float p;
        public final boolean q;
        public final boolean r;
        public static float[] s;

        static {
            Arc.Companion = new Companion(null);
            Arc.$stable = 8;
        }

        public Arc(int v, float f, float f1, float f2, float f3, float f4, float f5) {
            float f16;
            boolean z1;
            this.a = f;
            this.b = f1;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = f5;
            float f6 = f4 - f2;
            float f7 = f5 - f3;
            boolean z = true;
            switch(v) {
                case 1: {
                    z1 = true;
                    break;
                }
                case 4: {
                    z1 = f7 > 0.0f;
                    break;
                }
                case 5: {
                    z1 = f7 < 0.0f;
                    break;
                }
                default: {
                    z1 = false;
                }
            }
            this.q = z1;
            float f8 = 1.0f / (f1 - f);
            this.k = f8;
            if(3 == v || Math.abs(f6) < 0.001f || Math.abs(f7) < 0.001f) {
                float f18 = (float)Math.hypot(f7, f6);
                this.g = f18;
                this.p = f18 * f8;
                this.n = f6 / (f1 - f);
                this.o = f7 / (f1 - f);
                this.j = new float[101];
                this.l = NaNf;
                this.m = NaNf;
            }
            else {
                this.j = new float[101];
                this.l = f6 * ((float)(z1 ? -1 : 1));
                this.m = f7 * ((float)(z1 ? 1 : -1));
                this.n = z1 ? f4 : f2;
                this.o = z1 ? f3 : f5;
                float f9 = f4 - f2;
                float[] arr_f = Companion.access$getOurPercent(Arc.Companion);
                float f10 = 0.0f;
                float f12 = 0.0f;
                int v1 = 0;
                for(float f11 = 0.0f; v1 < arr_f.length; f11 = f14) {
                    Companion arcSpline$Arc$Companion0 = Arc.Companion;
                    double f13 = (double)(((float)Math.toRadians(((double)v1) * 90.0 / ((double)(Companion.access$getOurPercent(arcSpline$Arc$Companion0).length - 1)))));
                    float f14 = ((float)Math.sin(f13)) * f9;
                    float f15 = ((float)Math.cos(f13)) * (f3 - f5);
                    if(v1 > 0) {
                        f16 = f9;
                        f10 += (float)Math.hypot(f14 - f11, f15 - f12);
                        Companion.access$getOurPercent(arcSpline$Arc$Companion0)[v1] = f10;
                    }
                    else {
                        f16 = f9;
                    }
                    ++v1;
                    f9 = f16;
                    f12 = f15;
                }
                this.g = f10;
                float[] arr_f1 = Companion.access$getOurPercent(Arc.Companion);
                for(int v2 = 0; v2 < arr_f1.length; ++v2) {
                    float[] arr_f2 = Companion.access$getOurPercent(Arc.Companion);
                    arr_f2[v2] /= f10;
                }
                float[] arr_f3 = this.j;
                for(int v3 = 0; v3 < arr_f3.length; ++v3) {
                    float f17 = ((float)v3) / ((float)(arr_f3.length - 1));
                    Companion arcSpline$Arc$Companion1 = Arc.Companion;
                    int v4 = ArraysKt___ArraysJvmKt.binarySearch$default(Companion.access$getOurPercent(arcSpline$Arc$Companion1), f17, 0, 0, 6, null);
                    if(v4 >= 0) {
                        arr_f3[v3] = ((float)v4) / ((float)(Companion.access$getOurPercent(arcSpline$Arc$Companion1).length - 1));
                    }
                    else if(v4 == -1) {
                        arr_f3[v3] = 0.0f;
                    }
                    else {
                        arr_f3[v3] = ((f17 - Companion.access$getOurPercent(arcSpline$Arc$Companion1)[-v4 - 2]) / (Companion.access$getOurPercent(arcSpline$Arc$Companion1)[-v4 - 1] - Companion.access$getOurPercent(arcSpline$Arc$Companion1)[-v4 - 2]) + ((float)(-v4 - 2))) / ((float)(Companion.access$getOurPercent(arcSpline$Arc$Companion1).length - 1));
                    }
                }
                this.p = this.g * this.k;
                z = false;
            }
            this.r = z;
        }

        public final float calcDX() {
            float f = this.l * this.i;
            float f1 = this.p / ((float)Math.hypot(f, -this.m * this.h));
            if(this.q) {
                f = -f;
            }
            return f * f1;
        }

        public final float calcDY() {
            float f = -this.m * this.h;
            float f1 = this.p / ((float)Math.hypot(this.l * this.i, f));
            return this.q ? -f * f1 : f * f1;
        }

        public final float calcX() {
            return this.l * this.h + this.n;
        }

        public final float calcY() {
            return this.m * this.i + this.o;
        }

        public final float getLinearDX() {
            return this.n;
        }

        public final float getLinearDY() {
            return this.o;
        }

        public final float getLinearX(float f) {
            return (this.e - this.c) * ((f - this.a) * this.k) + this.c;
        }

        public final float getLinearY(float f) {
            return (this.f - this.d) * ((f - this.a) * this.k) + this.d;
        }

        public final float getTime1() {
            return this.a;
        }

        public final float getTime2() {
            return this.b;
        }

        public final boolean isLinear() {
            return this.r;
        }

        public final void setPoint(float f) {
            float f1 = (this.q ? this.b - f : f - this.a) * this.k;
            float f2 = 0.0f;
            if(f1 > 0.0f && f1 < 1.0f) {
                float f3 = f1 * ((float)(this.j.length - 1));
                float f4 = this.j[((int)f3)];
                f2 = q.a(this.j[((int)f3) + 1], f4, f3 - ((float)(((int)f3))), f4);
            }
            this.h = (float)Math.sin(f2 * 1.570796f);
            this.i = (float)Math.cos(f2 * 1.570796f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000E\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000E\u0010\u0004¨\u0006\u000F"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Companion;", "", "", "ArcAbove", "I", "ArcBelow", "ArcStartFlip", "ArcStartHorizontal", "ArcStartLinear", "ArcStartVertical", "DownArc", "StartHorizontal", "StartLinear", "StartVertical", "UpArc", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class androidx.compose.animation.core.ArcSpline.Companion {
        public androidx.compose.animation.core.ArcSpline.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    public static final int ArcAbove = 5;
    public static final int ArcBelow = 4;
    public static final int ArcStartFlip = 3;
    public static final int ArcStartHorizontal = 2;
    public static final int ArcStartLinear = 0;
    public static final int ArcStartVertical = 1;
    @NotNull
    public static final androidx.compose.animation.core.ArcSpline.Companion Companion;
    public final Arc[][] a;

    static {
        ArcSpline.Companion = new androidx.compose.animation.core.ArcSpline.Companion(null);
        ArcSpline.$stable = 8;
    }

    public ArcSpline(@NotNull int[] arr_v, @NotNull float[] arr_f, @NotNull float[][] arr2_f) {
        int v = arr_f.length - 1;
        Arc[][] arr2_arcSpline$Arc = new Arc[v][];
        int v1 = 1;
        int v2 = 1;
        for(int v3 = 0; v3 < v; ++v3) {
            int v4 = arr_v[v3];
            switch(v4) {
                case 0: {
                    v2 = 3;
                    break;
                }
                case 1: {
                    v1 = 1;
                    v2 = 1;
                    break;
                }
                case 2: {
                    v1 = 2;
                    v2 = 2;
                    break;
                }
                case 3: {
                    v1 = v1 == 1 ? 2 : 1;
                    v2 = v1;
                    break;
                }
                case 4: {
                    v2 = 3;
                    break;
                }
                default: {
                    if(v4 == 5) {
                        v2 = 5;
                    }
                }
            }
            float[] arr_f1 = arr2_f[v3];
            int v5 = arr_f1.length % 2 + arr_f1.length / 2;
            Arc[] arr_arcSpline$Arc = new Arc[v5];
            for(int v6 = 0; v6 < v5; ++v6) {
                float f = arr_f[v3];
                float f1 = arr_f[v3 + 1];
                float[] arr_f2 = arr2_f[v3];
                float f2 = arr_f2[v6 * 2];
                int v7 = v6 * 2 + 1;
                float f3 = arr_f2[v7];
                float[] arr_f3 = arr2_f[v3 + 1];
                arr_arcSpline$Arc[v6] = new Arc(v2, f, f1, f2, f3, arr_f3[v6 * 2], arr_f3[v7]);
            }
            arr2_arcSpline$Arc[v3] = arr_arcSpline$Arc;
        }
        this.a = arr2_arcSpline$Arc;
    }

    public final void getPos(float f, @NotNull float[] arr_f) {
        float f1;
        int v4;
        Arc[][] arr2_arcSpline$Arc = this.a;
        int v = 0;
        if(Float.compare(f, arr2_arcSpline$Arc[0][0].getTime1()) >= 0 && f <= arr2_arcSpline$Arc[arr2_arcSpline$Arc.length - 1][0].getTime2()) {
            boolean z = false;
            for(int v1 = 0; v1 < arr2_arcSpline$Arc.length; ++v1) {
                int v2 = 0;
                for(int v3 = 0; v2 < arr_f.length; ++v3) {
                    if(f <= arr2_arcSpline$Arc[v1][v3].getTime2()) {
                        if(arr2_arcSpline$Arc[v1][v3].isLinear()) {
                            arr_f[v2] = arr2_arcSpline$Arc[v1][v3].getLinearX(f);
                            arr_f[v2 + 1] = arr2_arcSpline$Arc[v1][v3].getLinearY(f);
                        }
                        else {
                            arr2_arcSpline$Arc[v1][v3].setPoint(f);
                            arr_f[v2] = arr2_arcSpline$Arc[v1][v3].calcX();
                            arr_f[v2 + 1] = arr2_arcSpline$Arc[v1][v3].calcY();
                        }
                        z = true;
                    }
                    v2 += 2;
                }
                if(z) {
                    return;
                }
            }
            return;
        }
        if(f > arr2_arcSpline$Arc[arr2_arcSpline$Arc.length - 1][0].getTime2()) {
            v4 = arr2_arcSpline$Arc.length - 1;
            f1 = arr2_arcSpline$Arc[arr2_arcSpline$Arc.length - 1][0].getTime2();
        }
        else {
            f1 = arr2_arcSpline$Arc[0][0].getTime1();
            v4 = 0;
        }
        float f2 = f - f1;
        for(int v5 = 0; v < arr_f.length; ++v5) {
            if(arr2_arcSpline$Arc[v4][v5].isLinear()) {
                float f3 = arr2_arcSpline$Arc[v4][v5].getLinearX(f1);
                arr_f[v] = arr2_arcSpline$Arc[v4][v5].getLinearDX() * f2 + f3;
                float f4 = arr2_arcSpline$Arc[v4][v5].getLinearY(f1);
                arr_f[v + 1] = arr2_arcSpline$Arc[v4][v5].getLinearDY() * f2 + f4;
            }
            else {
                arr2_arcSpline$Arc[v4][v5].setPoint(f1);
                float f5 = arr2_arcSpline$Arc[v4][v5].calcX();
                arr_f[v] = arr2_arcSpline$Arc[v4][v5].calcDX() * f2 + f5;
                float f6 = arr2_arcSpline$Arc[v4][v5].calcY();
                arr_f[v + 1] = arr2_arcSpline$Arc[v4][v5].calcDY() * f2 + f6;
            }
            v += 2;
        }
    }

    public final void getSlope(float f, @NotNull float[] arr_f) {
        Arc[][] arr2_arcSpline$Arc = this.a;
        if(Float.compare(f, arr2_arcSpline$Arc[0][0].getTime1()) < 0) {
            f = arr2_arcSpline$Arc[0][0].getTime1();
        }
        else if(f > arr2_arcSpline$Arc[arr2_arcSpline$Arc.length - 1][0].getTime2()) {
            f = arr2_arcSpline$Arc[arr2_arcSpline$Arc.length - 1][0].getTime2();
        }
        boolean z = false;
        for(int v = 0; v < arr2_arcSpline$Arc.length; ++v) {
            int v1 = 0;
            for(int v2 = 0; v1 < arr_f.length; ++v2) {
                if(f <= arr2_arcSpline$Arc[v][v2].getTime2()) {
                    if(arr2_arcSpline$Arc[v][v2].isLinear()) {
                        arr_f[v1] = arr2_arcSpline$Arc[v][v2].getLinearDX();
                        arr_f[v1 + 1] = arr2_arcSpline$Arc[v][v2].getLinearDY();
                    }
                    else {
                        arr2_arcSpline$Arc[v][v2].setPoint(f);
                        arr_f[v1] = arr2_arcSpline$Arc[v][v2].calcDX();
                        arr_f[v1 + 1] = arr2_arcSpline$Arc[v][v2].calcDY();
                    }
                    z = true;
                }
                v1 += 2;
            }
            if(z) {
                return;
            }
        }
    }
}

