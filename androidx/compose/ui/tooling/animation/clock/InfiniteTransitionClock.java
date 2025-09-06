package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import androidx.compose.ui.tooling.animation.states.TargetState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q2.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u001F\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\u00042\b\u0010\f\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001D\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0017\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001C\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u001C\u0010\u001DR\u001A\u0010\u0005\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R(\u0010(\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'¨\u0006)"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "", "animation", "Lkotlin/Function0;", "", "maxDuration", "<init>", "(Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;Lkotlin/jvm/functions/Function0;)V", "par1", "par2", "", "setStateParameters", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedProperties", "()Ljava/util/List;", "getMaxDurationPerIteration", "()J", "getMaxDuration", "stepMillis", "Landroidx/compose/animation/tooling/TransitionInfo;", "getTransitions", "(J)Ljava/util/List;", "animationTimeNanos", "setClockTime", "(J)V", "a", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "getAnimation", "()Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "c", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", "state", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInfiniteTransitionClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1603#2,9:87\n1855#2:96\n1856#2:98\n1612#2:99\n766#2:100\n857#2,2:101\n1549#2:103\n1620#2,3:104\n766#2:107\n857#2,2:108\n1#3:97\n*S KotlinDebug\n*F\n+ 1 InfiniteTransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock\n*L\n47#1:87,9\n47#1:96\n47#1:98\n47#1:99\n51#1:100\n51#1:101,2\n68#1:103\n68#1:104,3\n70#1:107\n70#1:108,2\n47#1:97\n*E\n"})
public final class InfiniteTransitionClock implements ComposeAnimationClock {
    public static final int $stable = 8;
    public final InfiniteTransitionComposeAnimation a;
    public final Function0 b;
    public TargetState c;

    public InfiniteTransitionClock(@NotNull InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation0, @NotNull Function0 function00) {
        this.a = infiniteTransitionComposeAnimation0;
        this.b = function00;
        this.c = new TargetState(0, 0);
    }

    public InfiniteTransitionClock(InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation0, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function00 = a.w;
        }
        this(infiniteTransitionComposeAnimation0, function00);
    }

    public static long a(TransitionAnimationState infiniteTransition$TransitionAnimationState0) {
        AnimationSpec animationSpec0 = infiniteTransition$TransitionAnimationState0.getAnimationSpec();
        Intrinsics.checkNotNull(animationSpec0, "null cannot be cast to non-null type androidx.compose.animation.core.InfiniteRepeatableSpec<T of androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock.getIterationDuration>");
        int v = ((InfiniteRepeatableSpec)animationSpec0).getRepeatMode() == RepeatMode.Reverse ? 2 : 1;
        VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0 = ((InfiniteRepeatableSpec)animationSpec0).getAnimation().vectorize(infiniteTransition$TransitionAnimationState0.getTypeConverter());
        return Utils_androidKt.millisToNanos(((long)vectorizedDurationBasedAnimationSpec0.getDelayMillis()) + ((long)(vectorizedDurationBasedAnimationSpec0.getDurationMillis() * v)));
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List getAnimatedProperties() {
        Iterable iterable0 = this.getAnimation().getAnimationObject().getAnimations();
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
    public InfiniteTransitionComposeAnimation getAnimation() {
        return this.a;
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Math.max(this.getMaxDurationPerIteration(), ((Number)this.b.invoke()).longValue());
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Iterator iterator0 = this.getAnimation().getAnimationObject().getAnimations().iterator();
        if(!iterator0.hasNext()) {
            throw new NullPointerException();
        }
        Object object0 = iterator0.next();
        Long long0 = InfiniteTransitionClock.a(((TransitionAnimationState)object0));
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Long long1 = InfiniteTransitionClock.a(((TransitionAnimationState)object1));
            if(long0.compareTo(long1) < 0) {
                long0 = long1;
            }
        }
        return long0 == null ? 0L : (((long)long0) + 0xF423FL) / 1000000L;
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public ComposeAnimationState getState() {
        return this.getState();
    }

    @NotNull
    public TargetState getState() {
        return this.c;
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List getTransitions(long v) {
        Iterable iterable0 = this.getAnimation().getAnimationObject().getAnimations();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(Utils_androidKt.createTransitionInfo(((TransitionAnimationState)object0), v, this.getMaxDuration()));
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            if(!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo)object1).getLabel())) {
                arrayList1.add(object1);
            }
        }
        return CollectionsKt___CollectionsKt.toList(arrayList1);
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long v) {
        this.getAnimation().setTimeNanos(v);
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(ComposeAnimationState composeAnimationState0) {
        this.setState(((TargetState)composeAnimationState0));
    }

    public void setState(@NotNull TargetState targetState0) {
        this.c = targetState0;
    }

    @Override  // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@NotNull Object object0, @Nullable Object object1) {
    }
}

