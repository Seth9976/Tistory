package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0016\u0010\u000E\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J7\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000BR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\rR\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0010\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"Landroidx/compose/animation/Scale;", "", "", "scale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "<init>", "(FJLandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()F", "component2-SzJe1aQ", "()J", "component2", "component3", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "copy-bnNdC4k", "(FJLandroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/animation/Scale;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getScale", "b", "J", "getTransformOrigin-SzJe1aQ", "c", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Scale {
    public static final int $stable;
    public final float a;
    public final long b;
    public final FiniteAnimationSpec c;

    public Scale(float f, long v, FiniteAnimationSpec finiteAnimationSpec0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
        this.b = v;
        this.c = finiteAnimationSpec0;
    }

    public final float component1() {
        return this.a;
    }

    public final long component2-SzJe1aQ() {
        return this.b;
    }

    @NotNull
    public final FiniteAnimationSpec component3() {
        return this.c;
    }

    @NotNull
    public final Scale copy-bnNdC4k(float f, long v, @NotNull FiniteAnimationSpec finiteAnimationSpec0) {
        return new Scale(f, v, finiteAnimationSpec0, null);
    }

    public static Scale copy-bnNdC4k$default(Scale scale0, float f, long v, FiniteAnimationSpec finiteAnimationSpec0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = scale0.a;
        }
        if((v1 & 2) != 0) {
            v = scale0.b;
        }
        if((v1 & 4) != 0) {
            finiteAnimationSpec0 = scale0.c;
        }
        return scale0.copy-bnNdC4k(f, v, finiteAnimationSpec0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Scale)) {
            return false;
        }
        if(Float.compare(this.a, ((Scale)object0).a) != 0) {
            return false;
        }
        return TransformOrigin.equals-impl0(this.b, ((Scale)object0).b) ? Intrinsics.areEqual(this.c, ((Scale)object0).c) : false;
    }

    @NotNull
    public final FiniteAnimationSpec getAnimationSpec() {
        return this.c;
    }

    public final float getScale() {
        return this.a;
    }

    public final long getTransformOrigin-SzJe1aQ() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + (TransformOrigin.hashCode-impl(this.b) + Float.hashCode(this.a) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + TransformOrigin.toString-impl(this.b) + ", animationSpec=" + this.c + ')';
    }
}

