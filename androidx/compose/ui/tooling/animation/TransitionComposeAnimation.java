package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u000B\u0010\fR \u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R \u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u001C\u0010\n\u001A\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u001A\u0010\u001E\u001A\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "T", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "Landroidx/compose/animation/core/Transition;", "animationObject", "", "", "states", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/util/Set;Ljava/lang/String;)V", "a", "Landroidx/compose/animation/core/Transition;", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", "b", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "d", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TransitionComposeAnimation implements ComposeAnimation, TransitionBasedAnimation {
    public static final int $stable = 8;
    public final Transition a;
    public final Set b;
    public final String c;
    public final ComposeAnimationType d;

    public TransitionComposeAnimation(@NotNull Transition transition0, @NotNull Set set0, @Nullable String s) {
        this.a = transition0;
        this.b = set0;
        this.c = s;
        this.d = ComposeAnimationType.TRANSITION_ANIMATION;
    }

    @Override  // androidx.compose.ui.tooling.animation.TransitionBasedAnimation
    @NotNull
    public Transition getAnimationObject() {
        return this.a;
    }

    public Object getAnimationObject() {
        return this.getAnimationObject();
    }

    @Nullable
    public String getLabel() {
        return this.c;
    }

    @NotNull
    public Set getStates() {
        return this.b;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.d;
    }
}

