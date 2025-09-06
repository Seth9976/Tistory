package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0016\u001A\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R \u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u001F\u0010\"\u001A\n\u0012\u0004\u0012\u00020\u001E\u0018\u00010\u00028F¢\u0006\f\u0012\u0004\b \u0010!\u001A\u0004\b\u001F\u0010\f¨\u0006#"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/animation/core/Transition;", "", "animationObject", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V", "a", "Landroidx/compose/animation/core/Transition;", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", "b", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "c", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "d", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "states", "", "getChildTransition", "getChildTransition$annotations", "()V", "childTransition", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AnimatedVisibilityComposeAnimation implements ComposeAnimation {
    public static final int $stable = 8;
    public final Transition a;
    public final String b;
    public final ComposeAnimationType c;
    public final Set d;

    public AnimatedVisibilityComposeAnimation(@NotNull Transition transition0, @Nullable String s) {
        this.a = transition0;
        this.b = s;
        this.c = ComposeAnimationType.ANIMATED_VISIBILITY;
        this.d = f0.setOf(new AnimatedVisibilityState[]{AnimatedVisibilityState.box-impl("Enter"), AnimatedVisibilityState.box-impl("Exit")});
    }

    @NotNull
    public Transition getAnimationObject() {
        return this.a;
    }

    public Object getAnimationObject() {
        return this.getAnimationObject();
    }

    @Nullable
    public final Transition getChildTransition() {
        Object object0 = CollectionsKt___CollectionsKt.getOrNull(this.getAnimationObject().getTransitions(), 0);
        return object0 instanceof Transition ? ((Transition)object0) : null;
    }

    public static void getChildTransition$annotations() {
    }

    @Nullable
    public String getLabel() {
        return this.b;
    }

    @NotNull
    public Set getStates() {
        return this.d;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.c;
    }
}

