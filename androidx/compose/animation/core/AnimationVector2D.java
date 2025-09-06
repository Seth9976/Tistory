package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\n\u001A\u00020\u0007H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\r\u001A\u00020\u0000H\u0010¢\u0006\u0004\b\u000B\u0010\fJ\u0018\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u000EH\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0018\u001A\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AH\u0096\u0002¢\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\u001F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u001F\u0010 R*\u0010\u0003\u001A\u00020\u00022\u0006\u0010!\u001A\u00020\u00028\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R*\u0010\u0004\u001A\u00020\u00022\u0006\u0010!\u001A\u00020\u00028\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b(\u0010#\u001A\u0004\b)\u0010%\"\u0004\b*\u0010\'R\u001A\u0010.\u001A\u00020\u000E8\u0010X\u0090D¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010 ¨\u0006/"}, d2 = {"Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/AnimationVector;", "", "v1", "v2", "<init>", "(FF)V", "", "reset$animation_core_release", "()V", "reset", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector2D;", "newVector", "", "index", "get$animation_core_release", "(I)F", "get", "value", "set$animation_core_release", "(IF)V", "set", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "a", "F", "getV1", "()F", "setV1$animation_core_release", "(F)V", "b", "getV2", "setV2$animation_core_release", "c", "I", "getSize$animation_core_release", "size", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AnimationVector2D extends AnimationVector {
    public static final int $stable = 8;
    public float a;
    public float b;
    public final int c;

    public AnimationVector2D(float f, float f1) {
        super(null);
        this.a = f;
        this.b = f1;
        this.c = 2;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof AnimationVector2D && ((AnimationVector2D)object0).a == this.a && ((AnimationVector2D)object0).b == this.b;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int v) {
        switch(v) {
            case 0: {
                return this.a;
            }
            case 1: {
                return this.b;
            }
            default: {
                return 0.0f;
            }
        }
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.c;
    }

    public final float getV1() {
        return this.a;
    }

    public final float getV2() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 0x1F;
    }

    @NotNull
    public AnimationVector2D newVector$animation_core_release() {
        return new AnimationVector2D(0.0f, 0.0f);
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public AnimationVector newVector$animation_core_release() {
        return this.newVector$animation_core_release();
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int v, float f) {
        switch(v) {
            case 0: {
                this.a = f;
                return;
            }
            case 1: {
                this.b = f;
            }
        }
    }

    public final void setV1$animation_core_release(float f) {
        this.a = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.b = f;
    }

    @Override
    @NotNull
    public String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}

