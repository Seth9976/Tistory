package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\f\u001A\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\u000F\u001A\u00020\u0000H\u0010¢\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0090\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001A\u00020\t2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001F\u001A\u00020\u001E2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CH\u0096\u0002¢\u0006\u0004\b\u001F\u0010 J\u000F\u0010!\u001A\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"R*\u0010\u0003\u001A\u00020\u00022\u0006\u0010#\u001A\u00020\u00028\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'\"\u0004\b(\u0010)R*\u0010\u0004\u001A\u00020\u00022\u0006\u0010#\u001A\u00020\u00028\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b*\u0010%\u001A\u0004\b+\u0010\'\"\u0004\b,\u0010)R*\u0010\u0005\u001A\u00020\u00022\u0006\u0010#\u001A\u00020\u00028\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b-\u0010%\u001A\u0004\b.\u0010\'\"\u0004\b/\u0010)R*\u0010\u0006\u001A\u00020\u00022\u0006\u0010#\u001A\u00020\u00028\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b0\u0010%\u001A\u0004\b1\u0010\'\"\u0004\b2\u0010)R\u001A\u00106\u001A\u00020\u00108\u0010X\u0090D¢\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010\"¨\u00067"}, d2 = {"Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", "", "v1", "v2", "v3", "v4", "<init>", "(FFFF)V", "", "reset$animation_core_release", "()V", "reset", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector4D;", "newVector", "", "index", "get$animation_core_release", "(I)F", "get", "value", "set$animation_core_release", "(IF)V", "set", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "a", "F", "getV1", "()F", "setV1$animation_core_release", "(F)V", "b", "getV2", "setV2$animation_core_release", "c", "getV3", "setV3$animation_core_release", "d", "getV4", "setV4$animation_core_release", "e", "I", "getSize$animation_core_release", "size", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 8;
    public float a;
    public float b;
    public float c;
    public float d;
    public final int e;

    public AnimationVector4D(float f, float f1, float f2, float f3) {
        super(null);
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = 4;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof AnimationVector4D && ((AnimationVector4D)object0).a == this.a && ((AnimationVector4D)object0).b == this.b && ((AnimationVector4D)object0).c == this.c && ((AnimationVector4D)object0).d == this.d;
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
            case 2: {
                return this.c;
            }
            case 3: {
                return this.d;
            }
            default: {
                return 0.0f;
            }
        }
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.e;
    }

    public final float getV1() {
        return this.a;
    }

    public final float getV2() {
        return this.b;
    }

    public final float getV3() {
        return this.c;
    }

    public final float getV4() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.d) + a.b(this.c, a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F), 0x1F);
    }

    @NotNull
    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public AnimationVector newVector$animation_core_release() {
        return this.newVector$animation_core_release();
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
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
                return;
            }
            case 2: {
                this.c = f;
                return;
            }
            case 3: {
                this.d = f;
            }
        }
    }

    public final void setV1$animation_core_release(float f) {
        this.a = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.b = f;
    }

    public final void setV3$animation_core_release(float f) {
        this.c = f;
    }

    public final void setV4$animation_core_release(float f) {
        this.d = f;
    }

    @Override
    @NotNull
    public String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}

