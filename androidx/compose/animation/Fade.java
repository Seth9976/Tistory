package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ*\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\tR\u001D\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000B¨\u0006\u001E"}, d2 = {"Landroidx/compose/animation/Fade;", "", "", "alpha", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "<init>", "(FLandroidx/compose/animation/core/FiniteAnimationSpec;)V", "component1", "()F", "component2", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "copy", "(FLandroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/animation/Fade;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getAlpha", "b", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Fade {
    public static final int $stable;
    public final float a;
    public final FiniteAnimationSpec b;

    public Fade(float f, @NotNull FiniteAnimationSpec finiteAnimationSpec0) {
        this.a = f;
        this.b = finiteAnimationSpec0;
    }

    public final float component1() {
        return this.a;
    }

    @NotNull
    public final FiniteAnimationSpec component2() {
        return this.b;
    }

    @NotNull
    public final Fade copy(float f, @NotNull FiniteAnimationSpec finiteAnimationSpec0) {
        return new Fade(f, finiteAnimationSpec0);
    }

    public static Fade copy$default(Fade fade0, float f, FiniteAnimationSpec finiteAnimationSpec0, int v, Object object0) {
        if((v & 1) != 0) {
            f = fade0.a;
        }
        if((v & 2) != 0) {
            finiteAnimationSpec0 = fade0.b;
        }
        return fade0.copy(f, finiteAnimationSpec0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Fade)) {
            return false;
        }
        return Float.compare(this.a, ((Fade)object0).a) == 0 ? Intrinsics.areEqual(this.b, ((Fade)object0).b) : false;
    }

    public final float getAlpha() {
        return this.a;
    }

    @NotNull
    public final FiniteAnimationSpec getAnimationSpec() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + Float.hashCode(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}

