package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\'\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\n*\u00020\t2\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0005\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u0019\u001A\u0004\b\u001D\u0010\u001BR\u0019\u0010\u0006\u001A\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/animation/core/SpringSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFLjava/lang/Object;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedSpringSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedSpringSpec;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "getDampingRatio", "()F", "b", "getStiffness", "c", "Ljava/lang/Object;", "getVisibilityThreshold", "()Ljava/lang/Object;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SpringSpec implements FiniteAnimationSpec {
    public static final int $stable;
    public final float a;
    public final float b;
    public final Object c;

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public SpringSpec(float f, float f1, @Nullable Object object0) {
        this.a = f;
        this.b = f1;
        this.c = object0;
    }

    public SpringSpec(float f, float f1, Object object0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1500.0f;
        }
        if((v & 4) != 0) {
            object0 = null;
        }
        this(f, f1, object0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof SpringSpec && ((SpringSpec)object0).a == this.a && ((SpringSpec)object0).b == this.b && Intrinsics.areEqual(((SpringSpec)object0).c, this.c);
    }

    public final float getDampingRatio() {
        return this.a;
    }

    public final float getStiffness() {
        return this.b;
    }

    @Nullable
    public final Object getVisibilityThreshold() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.c == null ? Float.hashCode(this.b) + a.b(this.a, 0, 0x1F) : Float.hashCode(this.b) + a.b(this.a, this.c.hashCode() * 0x1F, 0x1F);
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.FiniteAnimationSpec
    public VectorizedFiniteAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }

    @NotNull
    public VectorizedSpringSpec vectorize(@NotNull TwoWayConverter twoWayConverter0) {
        AnimationVector animationVector0 = AnimationSpecKt.access$convert(twoWayConverter0, this.c);
        return new VectorizedSpringSpec(this.a, this.b, animationVector0);
    }
}

