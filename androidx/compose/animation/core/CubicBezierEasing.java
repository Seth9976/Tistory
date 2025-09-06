package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.BezierKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", "", "a", "b", "c", "d", "<init>", "(FFFF)V", "fraction", "transform", "(F)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,172:1\n33#2,7:173\n48#3:180\n54#3:182\n22#4:181\n22#4:183\n71#5,16:184\n*S KotlinDebug\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n*L\n115#1:173,7\n120#1:180\n121#1:182\n120#1:181\n121#1:183\n149#1:184,16\n*E\n"})
public final class CubicBezierEasing implements Easing {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public CubicBezierEasing(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        if(Float.isNaN(f) || Float.isNaN(f1) || Float.isNaN(f2) || Float.isNaN(f3)) {
            PreconditionsKt.throwIllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f1 + ", " + f2 + ", " + f3 + '.'));
        }
        long v = BezierKt.computeCubicVerticalBounds(0.0f, f1, f3, 1.0f, new float[5], 0);
        this.e = Float.intBitsToFloat(((int)(v >> 0x20)));
        this.f = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof CubicBezierEasing && this.a == ((CubicBezierEasing)object0).a && this.b == ((CubicBezierEasing)object0).b && this.c == ((CubicBezierEasing)object0).c && this.d == ((CubicBezierEasing)object0).d;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.d) + a.b(this.c, a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CubicBezierEasing(a=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", b=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", c=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", d=");
        return a.n(stringBuilder0, this.d, ')');
    }

    @Override  // androidx.compose.animation.core.Easing
    public float transform(float f) {
        if(f > 0.0f && f < 1.0f) {
            float f1 = this.a;
            float f2 = this.c;
            float f3 = BezierKt.findFirstCubicRoot(0.0f - f, f1 - f, f2 - f, 1.0f - f);
            float f4 = this.d;
            float f5 = this.b;
            if(Float.isNaN(f3)) {
                throw new IllegalArgumentException("The cubic curve with parameters (" + f1 + ", " + f5 + ", " + f2 + ", " + f4 + ") has no solution at " + f);
            }
            f = BezierKt.evaluateCubic(f5, f4, f3);
            float f6 = this.e;
            if(f < f6) {
                f = f6;
            }
            return f > this.f ? this.f : f;
        }
        return f;
    }
}

