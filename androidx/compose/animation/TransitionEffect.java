package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u00028 X \u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/TransitionEffect;", "", "Landroidx/compose/animation/TransitionEffectKey;", "getKey$animation_release", "()Landroidx/compose/animation/TransitionEffectKey;", "key", "Landroidx/compose/animation/ContentScaleTransitionEffect;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class TransitionEffect {
    public static final int $stable;

    public TransitionEffect(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public abstract TransitionEffectKey getKey$animation_release();
}

