package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\'\u0010\u0011\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001A\u0004\b\u0019\u0010\u0017¨\u0006\u001A"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "", "duration", "delay", "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(IILandroidx/compose/animation/core/Easing;)V", "", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JFFF)F", "getDurationNanos", "(FFF)J", "getVelocityFromNanos", "a", "I", "getDuration", "()I", "b", "getDelay", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFloatAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,265:1\n71#2,16:266\n*S KotlinDebug\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n*L\n218#1:266,16\n*E\n"})
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable;
    public final int a;
    public final int b;
    public final Easing c;
    public final long d;
    public final long e;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    public FloatTweenSpec(int v, int v1, @NotNull Easing easing0) {
        this.a = v;
        this.b = v1;
        this.c = easing0;
        this.d = ((long)v) * 1000000L;
        this.e = ((long)v1) * 1000000L;
    }

    public FloatTweenSpec(int v, int v1, Easing easing0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 300;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if((v2 & 4) != 0) {
            easing0 = EasingKt.getFastOutSlowInEasing();
        }
        this(v, v1, easing0);
    }

    public final int getDelay() {
        return this.b;
    }

    public final int getDuration() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f, float f1, float f2) {
        return ((long)(this.b + this.a)) * 1000000L;
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long v, float f, float f1, float f2) {
        long v1 = c.coerceIn(v - this.e, 0L, this.d);
        float f3 = 1.0f;
        float f4 = this.a == 0 ? 1.0f : ((float)v1) / ((float)this.d);
        if(f4 < 0.0f) {
            f4 = 0.0f;
        }
        if(f4 <= 1.0f) {
            f3 = f4;
        }
        return VectorConvertersKt.lerp(f, f1, this.c.transform(f3));
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long v, float f, float f1, float f2) {
        long v1 = c.coerceIn(v - this.e, 0L, this.d);
        int v2 = Long.compare(v1, 0L);
        if(v2 < 0) {
            return 0.0f;
        }
        if(v2 == 0) {
            return f2;
        }
        float f3 = this.getValueFromNanos(v1 - 1000000L, f, f1, f2);
        return (this.getValueFromNanos(v1, f, f1, f2) - f3) * 1000.0f;
    }
}

