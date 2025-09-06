package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0010\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\'\u0010\u0013\u001A\u00028\u00002\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\'\u0010\u0015\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "Landroidx/compose/animation/core/Animations;", "anims", "<init>", "(Landroidx/compose/animation/core/Animations;)V", "Landroidx/compose/animation/core/FloatAnimationSpec;", "anim", "(Landroidx/compose/animation/core/FloatAnimationSpec;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1076:1\n1855#2,2:1077\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n*L\n1067#1:1077,2\n*E\n"})
public final class VectorizedFloatAnimationSpec implements VectorizedFiniteAnimationSpec {
    public static final int $stable = 8;
    public final Animations a;
    public AnimationVector b;
    public AnimationVector c;
    public AnimationVector d;

    public VectorizedFloatAnimationSpec(@NotNull Animations animations0) {
        this.a = animations0;
    }

    public VectorizedFloatAnimationSpec(@NotNull FloatAnimationSpec floatAnimationSpec0) {
        this(new Animations() {
            public final FloatAnimationSpec a;

            {
                this.a = floatAnimationSpec0;
            }

            @Override  // androidx.compose.animation.core.Animations
            @NotNull
            public FloatAnimationSpec get(int v) {
                return this.a;
            }
        });
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        long v = 0L;
        Iterator iterator0 = c.until(0, animationVector0.getSize$animation_core_release()).iterator();
        while(iterator0.hasNext()) {
            int v1 = ((IntIterator)iterator0).nextInt();
            v = Math.max(v, this.a.get(v1).getDurationNanos(animationVector0.get$animation_core_release(v1), animationVector1.get$animation_core_release(v1), animationVector2.get$animation_core_release(v1)));
        }
        return v;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getEndVelocity(@NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        if(this.d == null) {
            this.d = AnimationVectorsKt.newInstance(animationVector2);
        }
        AnimationVector animationVector3 = this.d;
        if(animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            animationVector3 = null;
        }
        int v = animationVector3.getSize$animation_core_release();
        for(int v1 = 0; v1 < v; ++v1) {
            AnimationVector animationVector4 = this.d;
            if(animationVector4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                animationVector4 = null;
            }
            animationVector4.set$animation_core_release(v1, this.a.get(v1).getEndVelocity(animationVector0.get$animation_core_release(v1), animationVector1.get$animation_core_release(v1), animationVector2.get$animation_core_release(v1)));
        }
        AnimationVector animationVector5 = this.d;
        if(animationVector5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            return null;
        }
        return animationVector5;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getValueFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        if(this.b == null) {
            this.b = AnimationVectorsKt.newInstance(animationVector0);
        }
        AnimationVector animationVector3 = this.b;
        if(animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            animationVector3 = null;
        }
        int v1 = animationVector3.getSize$animation_core_release();
        for(int v2 = 0; v2 < v1; ++v2) {
            AnimationVector animationVector4 = this.b;
            if(animationVector4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                animationVector4 = null;
            }
            animationVector4.set$animation_core_release(v2, this.a.get(v2).getValueFromNanos(v, animationVector0.get$animation_core_release(v2), animationVector1.get$animation_core_release(v2), animationVector2.get$animation_core_release(v2)));
        }
        AnimationVector animationVector5 = this.b;
        if(animationVector5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            return null;
        }
        return animationVector5;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getVelocityFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        if(this.c == null) {
            this.c = AnimationVectorsKt.newInstance(animationVector2);
        }
        AnimationVector animationVector3 = this.c;
        if(animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector3 = null;
        }
        int v1 = animationVector3.getSize$animation_core_release();
        for(int v2 = 0; v2 < v1; ++v2) {
            AnimationVector animationVector4 = this.c;
            if(animationVector4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                animationVector4 = null;
            }
            animationVector4.set$animation_core_release(v2, this.a.get(v2).getVelocityFromNanos(v, animationVector0.get$animation_core_release(v2), animationVector1.get$animation_core_release(v2), animationVector2.get$animation_core_release(v2)));
        }
        AnimationVector animationVector5 = this.c;
        if(animationVector5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        return animationVector5;
    }
}

