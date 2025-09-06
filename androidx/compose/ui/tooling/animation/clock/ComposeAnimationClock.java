package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u000E\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000FH&J\b\u0010\u0011\u001A\u00020\u0012H&J\b\u0010\u0013\u001A\u00020\u0012H&J\u0016\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00150\u000F2\u0006\u0010\u0016\u001A\u00020\u0012H&J\u0010\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u0012H&J\u001C\u0010\u001A\u001A\u00020\u00182\u0006\u0010\u001B\u001A\u00020\u00052\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u0005H&R\u0012\u0010\u0006\u001A\u00028\u0000X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001A\u00028\u0001X¦\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001DÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "T", "Landroidx/compose/animation/tooling/ComposeAnimation;", "TState", "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "", "animation", "getAnimation", "()Landroidx/compose/animation/tooling/ComposeAnimation;", "state", "getState", "()Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;)V", "getAnimatedProperties", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getMaxDuration", "", "getMaxDurationPerIteration", "getTransitions", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "setClockTime", "", "animationTimeNanos", "setStateParameters", "par1", "par2", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ComposeAnimationClock {
    @NotNull
    List getAnimatedProperties();

    @NotNull
    ComposeAnimation getAnimation();

    long getMaxDuration();

    long getMaxDurationPerIteration();

    @NotNull
    ComposeAnimationState getState();

    @NotNull
    List getTransitions(long arg1);

    void setClockTime(long arg1);

    void setState(@NotNull ComposeAnimationState arg1);

    void setStateParameters(@NotNull Object arg1, @Nullable Object arg2);

    static void setStateParameters$default(ComposeAnimationClock composeAnimationClock0, Object object0, Object object1, int v, Object object2) {
        if(object2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStateParameters");
        }
        if((v & 2) != 0) {
            object1 = null;
        }
        composeAnimationClock0.setStateParameters(object0, object1);
    }
}

