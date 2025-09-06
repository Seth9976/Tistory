package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"parseAnimatedVisibility", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/animation/core/Transition;", "", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AnimatedVisibilityComposeAnimation_androidKt {
    @NotNull
    public static final AnimatedVisibilityComposeAnimation parseAnimatedVisibility(@NotNull Transition transition0) {
        String s = transition0.getLabel();
        if(s == null) {
            s = "AnimatedVisibility";
        }
        return new AnimatedVisibilityComposeAnimation(transition0, s);
    }
}

