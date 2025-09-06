package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.TransitionBasedAnimation;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import androidx.compose.ui.tooling.animation.states.TargetState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002B\u0015\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001A\u00020\u000B2\u0006\u0010\t\u001A\u00020\b2\b\u0010\n\u001A\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001D\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u000E2\u0006\u0010\u0016\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001B\u001A\u00020\u000B2\u0006\u0010\u001A\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u001B\u0010\u001CR \u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R6\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016@VX\u0096\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'¨\u0006)"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", "T", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;)V", "", "par1", "par2", "", "setStateParameters", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedProperties", "()Ljava/util/List;", "", "getMaxDurationPerIteration", "()J", "getMaxDuration", "stepMillis", "Landroidx/compose/animation/tooling/TransitionInfo;", "getTransitions", "(J)Ljava/util/List;", "animationTimeNanos", "setClockTime", "(J)V", "a", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "getAnimation", "()Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "value", "b", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", "state", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransitionClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/TransitionClock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1603#2,9:89\n1855#2:98\n1856#2:100\n1612#2:101\n766#2:102\n857#2,2:103\n1549#2:105\n1620#2,3:106\n766#2:109\n857#2,2:110\n1#3:99\n*S KotlinDebug\n*F\n+ 1 TransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/TransitionClock\n*L\n60#1:89,9\n60#1:98\n60#1:100\n60#1:101\n64#1:102\n64#1:103,2\n77#1:105\n77#1:106,3\n79#1:109\n79#1:110,2\n60#1:99\n*E\n"})
public final class TransitionClock implements ComposeAnimationClock {
    public static final int $stable = 8;
    public final TransitionBasedAnimation a;
    public TargetState b;

    public TransitionClock(@NotNull TransitionBasedAnimation transitionBasedAnimation0) {
        this.a = transitionBasedAnimation0;
        this.b = new TargetState(this.getAnimation().getAnimationObject().getCurrentState(), this.getAnimation().getAnimationObject().getTargetState());
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List getAnimatedProperties() {
        Iterable iterable0 = Utils_androidKt.allAnimations(this.getAnimation().getAnimationObject());
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            Object object1 = ((TransitionAnimationState)object0).getValue();
            ComposeAnimatedProperty composeAnimatedProperty0 = object1 == null ? null : new ComposeAnimatedProperty(((TransitionAnimationState)object0).getLabel(), object1);
            if(composeAnimatedProperty0 != null) {
                arrayList0.add(composeAnimatedProperty0);
            }
        }
        List list0 = new ArrayList();
        for(Object object2: arrayList0) {
            if(!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty)object2).getLabel())) {
                list0.add(object2);
            }
        }
        return list0;
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public ComposeAnimation getAnimation() {
        return this.getAnimation();
    }

    @NotNull
    public TransitionBasedAnimation getAnimation() {
        return this.a;
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Utils_androidKt.nanosToMillis(this.getAnimation().getAnimationObject().getTotalDurationNanos());
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        return Utils_androidKt.nanosToMillis(this.getAnimation().getAnimationObject().getTotalDurationNanos());
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
        Iterable iterable0 = Utils_androidKt.allAnimations(this.getAnimation().getAnimationObject());
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(Utils_androidKt.createTransitionInfo(((TransitionAnimationState)object0), v));
        }
        List list0 = new ArrayList();
        for(Object object1: arrayList0) {
            if(!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo)object1).getLabel())) {
                list0.add(object1);
            }
        }
        return list0;
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long v) {
        this.getAnimation().getAnimationObject().seek(this.getState().getInitial(), this.getState().getTarget(), v);
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(ComposeAnimationState composeAnimationState0) {
        this.setState(((TargetState)composeAnimationState0));
    }

    public void setState(@NotNull TargetState targetState0) {
        this.b = targetState0;
        this.setClockTime(0L);
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@NotNull Object object0, @Nullable Object object1) {
        TargetState targetState0 = Utils_androidKt.parseParametersToValue(this.getState().getInitial(), object0, object1);
        if(targetState0 != null) {
            this.setState(targetState0);
        }
    }
}

