package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import androidx.compose.ui.tooling.animation.states.TargetState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022 \u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004B\u001B\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\f\u001A\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001D\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u0018\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001D\u001A\u00020\r2\u0006\u0010\u001C\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u001D\u0010\u001ER&\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R6\u0010*\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016@VX\u0096\u000E¢\u0006\u0012\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;)V", "", "par1", "par2", "", "setStateParameters", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedProperties", "()Ljava/util/List;", "", "getMaxDurationPerIteration", "()J", "getMaxDuration", "stepMillis", "Landroidx/compose/animation/tooling/TransitionInfo;", "getTransitions", "(J)Ljava/util/List;", "animationTimeNanos", "setClockTime", "(J)V", "a", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "getAnimation", "()Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "value", "b", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", "state", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AnimateXAsStateClock implements ComposeAnimationClock {
    public static final int $stable = 8;
    public final AnimateXAsStateComposeAnimation a;
    public TargetState b;
    public Object c;
    public TargetBasedAnimation d;

    public AnimateXAsStateClock(@NotNull AnimateXAsStateComposeAnimation animateXAsStateComposeAnimation0) {
        this.a = animateXAsStateComposeAnimation0;
        this.b = new TargetState(this.getAnimation().getAnimationObject().getValue(), this.getAnimation().getAnimationObject().getValue());
        this.c = this.getAnimation().getToolingState().getValue();
        this.d = this.a();
    }

    public final TargetBasedAnimation a() {
        return AnimationKt.TargetBasedAnimation(this.getAnimation().getAnimationSpec(), this.getAnimation().getAnimationObject().getTypeConverter(), this.getState().getInitial(), this.getState().getTarget(), this.getAnimation().getAnimationObject().getVelocity());
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List getAnimatedProperties() {
        String s = this.getAnimation().getLabel();
        Object object0 = this.c;
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Any");
        return k.listOf(new ComposeAnimatedProperty(s, object0));
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public ComposeAnimation getAnimation() {
        return this.getAnimation();
    }

    @NotNull
    public AnimateXAsStateComposeAnimation getAnimation() {
        return this.a;
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Utils_androidKt.nanosToMillis(this.d.getDurationNanos());
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        return Utils_androidKt.nanosToMillis(this.d.getDurationNanos());
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public ComposeAnimationState getState() {
        return this.getState();
    }

    @NotNull
    public TargetState getState() {
        return this.b;
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List getTransitions(long v) {
        return k.listOf(Utils_androidKt.createTransitionInfo(this.d, this.getAnimation().getLabel(), this.getAnimation().getAnimationSpec(), v));
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long v) {
        Object object0 = this.d.getValueFromNanos(v);
        this.c = object0;
        this.getAnimation().getToolingState().setValue(object0);
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(ComposeAnimationState composeAnimationState0) {
        this.setState(((TargetState)composeAnimationState0));
    }

    public void setState(@NotNull TargetState targetState0) {
        this.b = targetState0;
        this.d = this.a();
        this.setClockTime(0L);
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@NotNull Object object0, @Nullable Object object1) {
        TargetState targetState0 = Utils_androidKt.parseParametersToValue(this.c, object0, object1);
        if(targetState0 != null) {
            this.setState(targetState0);
        }
    }
}

