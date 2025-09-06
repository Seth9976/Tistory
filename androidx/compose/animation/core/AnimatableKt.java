package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A+\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "initialValue", "visibilityThreshold", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "Animatable", "(FF)Landroidx/compose/animation/core/Animatable;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AnimatableKt {
    public static final AnimationVector1D a;
    public static final AnimationVector2D b;
    public static final AnimationVector3D c;
    public static final AnimationVector4D d;
    public static final AnimationVector1D e;
    public static final AnimationVector2D f;
    public static final AnimationVector3D g;
    public static final AnimationVector4D h;

    static {
        AnimatableKt.a = AnimationVectorsKt.AnimationVector(Infinityf);
        AnimatableKt.b = AnimationVectorsKt.AnimationVector(Infinityf, Infinityf);
        AnimatableKt.c = AnimationVectorsKt.AnimationVector(Infinityf, Infinityf, Infinityf);
        AnimatableKt.d = AnimationVectorsKt.AnimationVector(Infinityf, Infinityf, Infinityf, Infinityf);
        AnimatableKt.e = AnimationVectorsKt.AnimationVector(-Infinityf);
        AnimatableKt.f = AnimationVectorsKt.AnimationVector(-Infinityf, -Infinityf);
        AnimatableKt.g = AnimationVectorsKt.AnimationVector(-Infinityf, -Infinityf, -Infinityf);
        AnimatableKt.h = AnimationVectorsKt.AnimationVector(-Infinityf, -Infinityf, -Infinityf, -Infinityf);
    }

    @NotNull
    public static final Animatable Animatable(float f, float f1) {
        return new Animatable(f, VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), f1, null, 8, null);
    }

    public static Animatable Animatable$default(float f, float f1, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = 0.01f;
        }
        return AnimatableKt.Animatable(f, f1);
    }
}

