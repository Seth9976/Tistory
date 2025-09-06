package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0000\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000B\u001A\u00020\n2\u0006\u0010\b\u001A\u00020\u00072\b\u0010\t\u001A\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000FJ\u0017\u0010\u0012\u001A\u00020\n2\u0006\u0010\u0011\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00190\u0015H\u0016¢\u0006\u0004\b\u001A\u0010\u001BR\u001A\u0010\u0004\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR0\u0010\'\u001A\u00020\u00032\u0006\u0010 \u001A\u00020\u00038\u0016@VX\u0096\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;)V", "", "par1", "par2", "", "setStateParameters", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "getMaxDurationPerIteration", "()J", "getMaxDuration", "animationTimeNanos", "setClockTime", "(J)V", "stepMillis", "", "Landroidx/compose/animation/tooling/TransitionInfo;", "getTransitions", "(J)Ljava/util/List;", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedProperties", "()Ljava/util/List;", "a", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "getAnimation", "()Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "value", "b", "Ljava/lang/String;", "getState-jXw82LU", "()Ljava/lang/String;", "setState-7IW2chM", "(Ljava/lang/String;)V", "state", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimatedVisibilityClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1549#2:88\n1620#2,3:89\n1045#2:92\n766#2:93\n857#2,2:94\n1603#2,9:96\n1855#2:105\n1856#2:107\n1612#2:108\n1045#2:109\n766#2:110\n857#2,2:111\n1#3:106\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n*L\n68#1:88\n68#1:89,3\n70#1:92\n70#1:93\n70#1:94,2\n77#1:96,9\n77#1:105\n77#1:107\n77#1:108\n79#1:109\n79#1:110\n79#1:111,2\n77#1:106\n*E\n"})
public final class AnimatedVisibilityClock implements ComposeAnimationClock {
    public static final int $stable = 8;
    public final AnimatedVisibilityComposeAnimation a;
    public String b;

    public AnimatedVisibilityClock(@NotNull AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation0) {
        this.a = animatedVisibilityComposeAnimation0;
        this.b = ((Boolean)this.getAnimation().getAnimationObject().getCurrentState()).booleanValue() ? "Exit" : "Enter";
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List getAnimatedProperties() {
        Transition transition0 = this.getAnimation().getChildTransition();
        if(transition0 != null) {
            Iterable iterable0 = Utils_androidKt.allAnimations(transition0);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                String s = ((TransitionAnimationState)object0).getLabel();
                Object object1 = ((TransitionAnimationState)object0).getValue();
                ComposeAnimatedProperty composeAnimatedProperty0 = object1 == null ? null : new ComposeAnimatedProperty(s, object1);
                if(composeAnimatedProperty0 != null) {
                    arrayList0.add(composeAnimatedProperty0);
                }
            }
            Iterable iterable1 = CollectionsKt___CollectionsKt.sortedWith(arrayList0, new androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock.getAnimatedProperties.lambda.8..inlined.sortedBy.1());
            List list0 = new ArrayList();
            for(Object object2: iterable1) {
                if(!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty)object2).getLabel())) {
                    list0.add(object2);
                }
            }
            return list0;
        }
        return CollectionsKt__CollectionsKt.emptyList();

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000E\u0010\u0003\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0005\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n*L\n1#1,328:1\n79#2:329\n*E\n"})
        public final class androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock.getAnimatedProperties.lambda.8..inlined.sortedBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return c.compareValues(((ComposeAnimatedProperty)object0).getLabel(), ((ComposeAnimatedProperty)object1).getLabel());
            }
        }

    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public ComposeAnimation getAnimation() {
        return this.getAnimation();
    }

    @NotNull
    public AnimatedVisibilityComposeAnimation getAnimation() {
        return this.a;
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        Transition transition0 = this.getAnimation().getChildTransition();
        return transition0 == null ? 0L : Utils_androidKt.nanosToMillis(transition0.getTotalDurationNanos());
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Transition transition0 = this.getAnimation().getChildTransition();
        return transition0 == null ? 0L : Utils_androidKt.nanosToMillis(transition0.getTotalDurationNanos());
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public ComposeAnimationState getState() {
        return AnimatedVisibilityState.box-impl(this.getState-jXw82LU());
    }

    @NotNull
    public String getState-jXw82LU() {
        return this.b;
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List getTransitions(long v) {
        Transition transition0 = this.getAnimation().getChildTransition();
        if(transition0 != null) {
            Iterable iterable0 = Utils_androidKt.allAnimations(transition0);
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList0.add(Utils_androidKt.createTransitionInfo(((TransitionAnimationState)object0), v));
            }
            Iterable iterable1 = CollectionsKt___CollectionsKt.sortedWith(arrayList0, new androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock.getTransitions.lambda.4..inlined.sortedBy.1());
            List list0 = new ArrayList();
            for(Object object1: iterable1) {
                if(!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo)object1).getLabel())) {
                    list0.add(object1);
                }
            }
            return list0;
        }
        return CollectionsKt__CollectionsKt.emptyList();

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000E\u0010\u0003\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0005\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n*L\n1#1,328:1\n70#2:329\n*E\n"})
        public final class androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock.getTransitions.lambda.4..inlined.sortedBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return c.compareValues(((TransitionInfo)object0).getLabel(), ((TransitionInfo)object1).getLabel());
            }
        }

    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long v) {
        Boolean boolean1;
        Boolean boolean0;
        Transition transition0 = this.getAnimation().getAnimationObject();
        if(AnimatedVisibilityState.equals-impl0(this.getState-jXw82LU(), "Enter")) {
            boolean0 = Boolean.FALSE;
            boolean1 = Boolean.TRUE;
        }
        else {
            boolean0 = Boolean.TRUE;
            boolean1 = Boolean.FALSE;
        }
        Pair pair0 = TuplesKt.to(boolean0, boolean1);
        Boolean boolean2 = (Boolean)pair0.component1();
        boolean2.booleanValue();
        Boolean boolean3 = (Boolean)pair0.component2();
        boolean3.booleanValue();
        transition0.seek(boolean2, boolean3, v);
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(ComposeAnimationState composeAnimationState0) {
        this.setState-7IW2chM(((AnimatedVisibilityState)composeAnimationState0).unbox-impl());
    }

    public void setState-7IW2chM(@NotNull String s) {
        this.b = s;
        this.setClockTime(0L);
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@NotNull Object object0, @Nullable Object object1) {
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState");
        this.setState-7IW2chM(((AnimatedVisibilityState)object0).unbox-impl());
    }
}

