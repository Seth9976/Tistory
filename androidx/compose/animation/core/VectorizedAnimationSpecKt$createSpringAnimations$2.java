package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$2", "Landroidx/compose/animation/core/Animations;", "", "index", "Landroidx/compose/animation/core/FloatSpringSpec;", "get", "(I)Landroidx/compose/animation/core/FloatSpringSpec;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class VectorizedAnimationSpecKt.createSpringAnimations.2 implements Animations {
    public final FloatSpringSpec a;

    public VectorizedAnimationSpecKt.createSpringAnimations.2(float f, float f1) {
        this.a = new FloatSpringSpec(f, f1, 0.0f, 4, null);
    }

    @Override  // androidx.compose.animation.core.Animations
    public FloatAnimationSpec get(int v) {
        return this.get(v);
    }

    @NotNull
    public FloatSpringSpec get(int v) {
        return this.a;
    }
}

