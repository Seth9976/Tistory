package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\f\u001A\u00020\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000BJ\u0018\u0010\u0011\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\rH\u0090\u0002¢\u0006\u0004\b\u000F\u0010\u0010J \u0010\u0015\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u001E\u0010\u001FR*\u0010\u0012\u001A\u00020\u00022\u0006\u0010 \u001A\u00020\u00028\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010\u0005R\u001A\u0010)\u001A\u00020\r8\u0010X\u0090D¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u001F¨\u0006*"}, d2 = {"Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector;", "", "initVal", "<init>", "(F)V", "", "reset$animation_core_release", "()V", "reset", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector1D;", "newVector", "", "index", "get$animation_core_release", "(I)F", "get", "value", "set$animation_core_release", "(IF)V", "set", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "a", "F", "getValue", "()F", "setValue$animation_core_release", "b", "I", "getSize$animation_core_release", "size", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AnimationVector1D extends AnimationVector {
    public static final int $stable = 8;
    public float a;
    public final int b;

    public AnimationVector1D(float f) {
        super(null);
        this.a = f;
        this.b = 1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof AnimationVector1D && ((AnimationVector1D)object0).a == this.a;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int v) {
        return v == 0 ? this.a : 0.0f;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.b;
    }

    public final float getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.a);
    }

    @NotNull
    public AnimationVector1D newVector$animation_core_release() {
        return new AnimationVector1D(0.0f);
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public AnimationVector newVector$animation_core_release() {
        return this.newVector$animation_core_release();
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.a = 0.0f;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int v, float f) {
        if(v == 0) {
            this.a = f;
        }
    }

    public final void setValue$animation_core_release(float f) {
        this.a = f;
    }

    @Override
    @NotNull
    public String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}

