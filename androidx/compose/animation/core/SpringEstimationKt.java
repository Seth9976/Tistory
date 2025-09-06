package androidx.compose.animation.core;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\u001A7\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001A7\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\t2\u0006\u0010\u0002\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\t2\u0006\u0010\u0004\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\n\u001A?\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\t2\u0006\u0010\u0004\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000E¨\u0006\u000F"}, d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "estimateAnimationDurationMillis", "(FFFFF)J", "", "(DDDDD)J", "springConstant", "dampingCoefficient", "mass", "(DDDDDD)J", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 3 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,344:1\n343#1:377\n343#1:378\n339#1:379\n343#1:380\n343#1:381\n339#1:382\n103#2:345\n107#2:351\n103#2:355\n103#2:361\n107#2:367\n103#2:371\n35#3,2:346\n54#3,3:348\n66#3,3:352\n35#3,2:356\n54#3,3:358\n35#3,2:362\n54#3,3:364\n66#3,3:368\n35#3,2:372\n54#3,3:374\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n164#1:377\n165#1:378\n203#1:379\n236#1:380\n237#1:381\n281#1:382\n74#1:345\n75#1:351\n75#1:355\n105#1:361\n106#1:367\n106#1:371\n74#1:346,2\n74#1:348,3\n75#1:352,3\n75#1:356,2\n75#1:358,3\n105#1:362,2\n105#1:364,3\n106#1:368,3\n106#1:372,2\n106#1:374,3\n*E\n"})
public final class SpringEstimationKt {
    public static final long a(ComplexDouble complexDouble0, ComplexDouble complexDouble1, double f, double f1, double f2, double f3) {
        double f15;
        double f14;
        int v = Double.compare(f2, 0.0);
        if(v == 0 && f1 == 0.0) {
            return 0L;
        }
        if(v < 0) {
            f1 = -f1;
        }
        double f4 = Math.abs(f2);
        if(Double.compare(f, 1.0) > 0) {
            double f5 = complexDouble0.getReal();
            double f6 = complexDouble1.getReal();
            double f7 = f5 - f6;
            double f8 = (f5 * f4 - f1) / f7;
            double f9 = f4 - f8;
            double f10 = Math.log(Math.abs(f3 / f9)) / f5;
            double f11 = Math.log(Math.abs(f3 / f8)) / f6;
            if(Double.isInfinite(f10) || Double.isNaN(f10)) {
                f10 = f11;
            }
            else if(!Double.isInfinite(f11) && !Double.isNaN(f11)) {
                f10 = Math.max(f10, f11);
            }
            double f12 = f9 * f5;
            double f13 = Math.log(f12 / (-f8 * f6)) / (f6 - f5);
            if(Double.isNaN(f13) || f13 <= 0.0) {
                f14 = -f3;
                f15 = f10;
            }
            else if(f13 > 0.0 && -(Math.exp(f13 * f6) * f8 + Math.exp(f5 * f13) * f9) < f3) {
                f14 = -f3;
                f15 = f8 <= 0.0 || f9 >= 0.0 ? f10 : 0.0;
            }
            else {
                f15 = Math.log(-(f8 * f6 * f6) / (f12 * f5)) / f7;
                f14 = f3;
            }
            double f16 = f8 * f6;
            if(Math.abs(Math.exp(f6 * f15) * f16 + Math.exp(f5 * f15) * f12) >= 0.0001) {
                int v1 = 0;
                double f17 = 1.797693E+308;
                while(f17 > 0.001 && v1 < 100) {
                    ++v1;
                    double f18 = f15 - (Math.exp(f6 * f15) * f8 + Math.exp(f5 * f15) * f9 + f14) / (Math.exp(f6 * f15) * f16 + Math.exp(f5 * f15) * f12);
                    f17 = Math.abs(f15 - f18);
                    f15 = f18;
                }
                return (long)(f15 * 1000.0);
            }
        }
        else {
            if(f < 1.0) {
                double f19 = complexDouble0.getReal();
                double f20 = (f1 - f19 * f4) / complexDouble0.getImaginary();
                return (long)(Math.log(f3 / Math.sqrt(f20 * f20 + f4 * f4)) / f19 * 1000.0);
            }
            double f21 = complexDouble0.getReal();
            double f22 = f21 * f4;
            double f23 = f1 - f22;
            double f24 = Math.log(Math.abs(f3 / f4)) / f21;
            double f25 = Math.log(Math.abs(f3 / f23));
            double f26 = f25;
            for(int v2 = 0; v2 < 6; ++v2) {
                f26 = f25 - Math.log(Math.abs(f26 / f21));
            }
            double f27 = f26 / f21;
            if(Double.isInfinite(f24) || Double.isNaN(f24)) {
                f24 = f27;
            }
            else if(!Double.isInfinite(f27) && !Double.isNaN(f27)) {
                f24 = Math.max(f24, f27);
            }
            double f28 = -(f22 + f23) / (f21 * f23);
            double f29 = f21 * f28;
            double f30 = Math.exp(f29);
            double f31 = Math.exp(f29);
            if(Double.isNaN(f28) || f28 <= 0.0) {
                f3 = -f3;
            }
            else if(f28 > 0.0 && -(f31 * (f23 * f28) + f30 * f4) < f3) {
                if(f23 < 0.0 && f4 > 0.0) {
                    f24 = 0.0;
                }
                f3 = -f3;
            }
            else {
                f24 = -(2.0 / f21) - f4 / f23;
            }
            f15 = f24;
            int v3 = 0;
            for(double f32 = 1.797693E+308; f32 > 0.001 && v3 < 100; f32 = f35) {
                ++v3;
                double f33 = f21 * f15;
                double f34 = f15 - (Math.exp(f33) * (f23 * f15 + f4) + f3) / (Math.exp(f33) * ((f33 + 1.0) * f23 + f22));
                double f35 = Math.abs(f15 - f34);
                f15 = f34;
            }
        }
        return (long)(f15 * 1000.0);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(double f, double f1, double f2, double f3, double f4) {
        double f5 = Math.sqrt(f) * (2.0 * f1);
        double f6 = f5 * f5 - 4.0 * f;
        ComplexDouble complexDouble0 = ComplexDoubleKt.complexSqrt(f6);
        complexDouble0.a += -f5;
        complexDouble0.a *= 0.5;
        complexDouble0.b *= 0.5;
        ComplexDouble complexDouble1 = ComplexDoubleKt.complexSqrt(f6);
        complexDouble1.a *= -1.0;
        complexDouble1.b *= -1.0;
        complexDouble1.a += -f5;
        complexDouble1.a *= 0.5;
        complexDouble1.b *= 0.5;
        return SpringEstimationKt.a(complexDouble0, complexDouble1, f1, f2, f3, f4);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(double f, double f1, double f2, double f3, double f4, double f5) {
        double f6 = f1 * f1 - 4.0 * f2 * f;
        double f7 = 1.0 / (2.0 * f2);
        ComplexDouble complexDouble0 = ComplexDoubleKt.complexSqrt(f6);
        complexDouble0.a += -f1;
        complexDouble0.a *= f7;
        complexDouble0.b *= f7;
        ComplexDouble complexDouble1 = ComplexDoubleKt.complexSqrt(f6);
        complexDouble1.a *= -1.0;
        complexDouble1.b *= -1.0;
        complexDouble1.a += -f1;
        complexDouble1.a *= f7;
        complexDouble1.b *= f7;
        return SpringEstimationKt.a(complexDouble0, complexDouble1, f1 / (Math.sqrt(f * f2) * 2.0), f3, f4, f5);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(float f, float f1, float f2, float f3, float f4) {
        return f1 == 0.0f ? 0x8637BD05AF6L : SpringEstimationKt.estimateAnimationDurationMillis(f, f1, f2, f3, f4);
    }
}

