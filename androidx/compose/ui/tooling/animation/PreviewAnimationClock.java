package androidx.compose.ui.tooling.animation;

import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.clock.AnimateXAsStateClock;
import androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import j0.b2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p2.c;
import p2.d;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00BC\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001A\u00020\u00032\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u0007\u00A2\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001A\u00020\u00032\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u00072\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0004\b\f\u0010\rJ\u001D\u0010\u000F\u001A\u00020\u00032\u000E\u0010\b\u001A\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000E\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0011\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0014\u001A\u00020\u00032\u000E\u0010\b\u001A\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0013\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001D\u0010\u0017\u001A\u00020\u00032\u000E\u0010\b\u001A\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001A\u00020\u00032\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u0007\u00A2\u0006\u0004\b\u0019\u0010\nJ\u0015\u0010\u001B\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001E\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u001DH\u0015\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010 \u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u001DH\u0015\u00A2\u0006\u0004\b \u0010\u001FJ%\u0010$\u001A\u00020\u00032\u0006\u0010!\u001A\u00020\u001D2\u0006\u0010\"\u001A\u00020\u00012\u0006\u0010#\u001A\u00020\u0001\u00A2\u0006\u0004\b$\u0010%J\u001D\u0010\'\u001A\u00020\u00032\u0006\u0010!\u001A\u00020\u001D2\u0006\u0010&\u001A\u00020\u0001\u00A2\u0006\u0004\b\'\u0010(J\u001B\u0010,\u001A\u00020)2\u0006\u0010!\u001A\u00020\u001D\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b*\u0010+J\r\u0010.\u001A\u00020-\u00A2\u0006\u0004\b.\u0010/J\r\u00100\u001A\u00020-\u00A2\u0006\u0004\b0\u0010/J\u001B\u00103\u001A\b\u0012\u0004\u0012\u000202012\u0006\u0010\b\u001A\u00020\u001D\u00A2\u0006\u0004\b3\u00104J#\u00107\u001A\b\u0012\u0004\u0012\u000206012\u0006\u0010\b\u001A\u00020\u001D2\u0006\u00105\u001A\u00020-\u00A2\u0006\u0004\b7\u00108J\u0015\u0010:\u001A\u00020\u00032\u0006\u00109\u001A\u00020-\u00A2\u0006\u0004\b:\u0010;J!\u0010=\u001A\u00020\u00032\u0012\u00109\u001A\u000E\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020-0<\u00A2\u0006\u0004\b=\u0010>J\r\u0010?\u001A\u00020\u0003\u00A2\u0006\u0004\b?\u0010@R4\u0010I\u001A\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030B\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0A8\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010@\u001A\u0004\bF\u0010GR,\u0010O\u001A\u000E\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0A8\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bL\u0010E\u0012\u0004\bN\u0010@\u001A\u0004\bM\u0010GR<\u0010U\u001A\u001E\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030P\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030Q0A8\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bR\u0010E\u0012\u0004\bT\u0010@\u001A\u0004\bS\u0010GR,\u0010[\u001A\u000E\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020W0A8\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bX\u0010E\u0012\u0004\bZ\u0010@\u001A\u0004\bY\u0010GR4\u0010`\u001A\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\\\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0A8\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\b]\u0010E\u0012\u0004\b_\u0010@\u001A\u0004\b^\u0010GR0\u0010i\u001A\u0012\u0012\u0004\u0012\u00020b0aj\b\u0012\u0004\u0012\u00020b`c8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\bd\u0010e\u0012\u0004\bh\u0010@\u001A\u0004\bf\u0010g\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006j"}, d2 = {"Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "", "Lkotlin/Function0;", "", "setAnimationsTimeCallback", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/animation/core/Transition;", "animation", "trackTransition", "(Landroidx/compose/animation/core/Transition;)V", "onSeek", "trackAnimatedVisibility", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "trackAnimateXAsState", "(Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;)V", "trackAnimateContentSize", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "trackTargetBasedAnimations", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "Landroidx/compose/animation/core/DecayAnimation;", "trackDecayAnimations", "(Landroidx/compose/animation/core/DecayAnimation;)V", "trackAnimatedContent", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "trackInfiniteTransition", "(Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;)V", "Landroidx/compose/animation/tooling/ComposeAnimation;", "notifySubscribe", "(Landroidx/compose/animation/tooling/ComposeAnimation;)V", "notifyUnsubscribe", "composeAnimation", "fromState", "toState", "updateFromAndToStates", "(Landroidx/compose/animation/tooling/ComposeAnimation;Ljava/lang/Object;Ljava/lang/Object;)V", "state", "updateAnimatedVisibilityState", "(Landroidx/compose/animation/tooling/ComposeAnimation;Ljava/lang/Object;)V", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "getAnimatedVisibilityState-cc2g1to", "(Landroidx/compose/animation/tooling/ComposeAnimation;)Ljava/lang/String;", "getAnimatedVisibilityState", "", "getMaxDuration", "()J", "getMaxDurationPerIteration", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedProperties", "(Landroidx/compose/animation/tooling/ComposeAnimation;)Ljava/util/List;", "stepMillis", "Landroidx/compose/animation/tooling/TransitionInfo;", "getTransitions", "(Landroidx/compose/animation/tooling/ComposeAnimation;J)Ljava/util/List;", "animationTimeMillis", "setClockTime", "(J)V", "", "setClockTimes", "(Ljava/util/Map;)V", "dispose", "()V", "", "Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", "b", "Ljava/util/Map;", "getTransitionClocks$ui_tooling_release", "()Ljava/util/Map;", "getTransitionClocks$ui_tooling_release$annotations", "transitionClocks", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "c", "getAnimatedVisibilityClocks$ui_tooling_release", "getAnimatedVisibilityClocks$ui_tooling_release$annotations", "animatedVisibilityClocks", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock;", "d", "getAnimateXAsStateClocks$ui_tooling_release", "getAnimateXAsStateClocks$ui_tooling_release$annotations", "animateXAsStateClocks", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock;", "e", "getInfiniteTransitionClocks$ui_tooling_release", "getInfiniteTransitionClocks$ui_tooling_release$annotations", "infiniteTransitionClocks", "Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "f", "getAnimatedContentClocks$ui_tooling_release", "getAnimatedContentClocks$ui_tooling_release$annotations", "animatedContentClocks", "Ljava/util/LinkedHashSet;", "Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "Lkotlin/collections/LinkedHashSet;", "g", "Ljava/util/LinkedHashSet;", "getTrackedUnsupportedAnimations", "()Ljava/util/LinkedHashSet;", "getTrackedUnsupportedAnimations$annotations", "trackedUnsupportedAnimations", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPreviewAnimationClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewAnimationClock.android.kt\nandroidx/compose/ui/tooling/animation/PreviewAnimationClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,353:1\n1#2:354\n1855#3,2:355\n1855#3,2:359\n1855#3,2:361\n215#4,2:357\n*S KotlinDebug\n*F\n+ 1 PreviewAnimationClock.android.kt\nandroidx/compose/ui/tooling/animation/PreviewAnimationClock\n*L\n325#1:355,2\n345#1:359,2\n346#1:361,2\n335#1:357,2\n*E\n"})
public class PreviewAnimationClock {
    public static final int $stable = 8;
    public final Function0 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final LinkedHashSet g;
    public final LinkedHashSet h;
    public final Object i;

    public PreviewAnimationClock() {
        this(null, 1, null);
    }

    public PreviewAnimationClock(@NotNull Function0 function00) {
        this.a = function00;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
        this.i = new Object();
    }

    public PreviewAnimationClock(Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            function00 = c.x;
        }
        this(function00);
    }

    public final void a(String s) {
        UnsupportedComposeAnimation unsupportedComposeAnimation0 = UnsupportedComposeAnimation.Companion.create(s);
        if(unsupportedComposeAnimation0 != null) {
            this.g.add(unsupportedComposeAnimation0);
        }
    }

    public final ComposeAnimationClock b(ComposeAnimation composeAnimation0) {
        ComposeAnimationClock composeAnimationClock0 = (TransitionClock)this.b.get(composeAnimation0);
        if(composeAnimationClock0 == null) {
            composeAnimationClock0 = (AnimatedVisibilityClock)this.c.get(composeAnimation0);
            if(composeAnimationClock0 == null) {
                composeAnimationClock0 = (AnimateXAsStateClock)this.d.get(composeAnimation0);
                if(composeAnimationClock0 == null) {
                    composeAnimationClock0 = (InfiniteTransitionClock)this.e.get(composeAnimation0);
                    return composeAnimationClock0 == null ? ((ComposeAnimationClock)this.f.get(composeAnimation0)) : composeAnimationClock0;
                }
            }
        }
        return composeAnimationClock0;
    }

    public final List c() {
        return CollectionsKt___CollectionsKt.plus(this.d(), this.e.values());
    }

    public final List d() {
        return CollectionsKt___CollectionsKt.plus(CollectionsKt___CollectionsKt.plus(CollectionsKt___CollectionsKt.plus(this.b.values(), this.c.values()), this.d.values()), this.f.values());
    }

    public final void dispose() {
        for(Object object0: this.c()) {
            this.notifyUnsubscribe(((ComposeAnimationClock)object0).getAnimation());
        }
        LinkedHashSet linkedHashSet0 = this.g;
        Iterator iterator1 = linkedHashSet0.iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
        }
        linkedHashSet0.clear();
        this.b.clear();
        this.c.clear();
        this.h.clear();
    }

    public final void e(Object object0, Function1 function10) {
        synchronized(this.i) {
            if(this.h.contains(object0)) {
                return;
            }
            this.h.add(object0);
        }
        function10.invoke(object0);
    }

    @NotNull
    public final Map getAnimateXAsStateClocks$ui_tooling_release() {
        return this.d;
    }

    @VisibleForTesting
    public static void getAnimateXAsStateClocks$ui_tooling_release$annotations() {
    }

    @NotNull
    public final Map getAnimatedContentClocks$ui_tooling_release() {
        return this.f;
    }

    @VisibleForTesting
    public static void getAnimatedContentClocks$ui_tooling_release$annotations() {
    }

    @NotNull
    public final List getAnimatedProperties(@NotNull ComposeAnimation composeAnimation0) {
        ComposeAnimationClock composeAnimationClock0 = this.b(composeAnimation0);
        if(composeAnimationClock0 != null) {
            List list0 = composeAnimationClock0.getAnimatedProperties();
            return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public final Map getAnimatedVisibilityClocks$ui_tooling_release() {
        return this.c;
    }

    @VisibleForTesting
    public static void getAnimatedVisibilityClocks$ui_tooling_release$annotations() {
    }

    @NotNull
    public final String getAnimatedVisibilityState-cc2g1to(@NotNull ComposeAnimation composeAnimation0) {
        AnimatedVisibilityClock animatedVisibilityClock0 = (AnimatedVisibilityClock)this.c.get(composeAnimation0);
        return animatedVisibilityClock0 == null ? "Enter" : animatedVisibilityClock0.getState-jXw82LU();
    }

    @NotNull
    public final Map getInfiniteTransitionClocks$ui_tooling_release() {
        return this.e;
    }

    @VisibleForTesting
    public static void getInfiniteTransitionClocks$ui_tooling_release$annotations() {
    }

    public final long getMaxDuration() {
        Iterator iterator0 = this.c().iterator();
        if(!iterator0.hasNext()) {
            throw new NullPointerException();
        }
        Object object0 = iterator0.next();
        Long long0 = ((ComposeAnimationClock)object0).getMaxDuration();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Long long1 = ((ComposeAnimationClock)object1).getMaxDuration();
            if(long0.compareTo(long1) < 0) {
                long0 = long1;
            }
        }
        return long0 == null ? 0L : ((long)long0);
    }

    public final long getMaxDurationPerIteration() {
        Iterator iterator0 = this.c().iterator();
        if(!iterator0.hasNext()) {
            throw new NullPointerException();
        }
        Object object0 = iterator0.next();
        Long long0 = ((ComposeAnimationClock)object0).getMaxDurationPerIteration();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Long long1 = ((ComposeAnimationClock)object1).getMaxDurationPerIteration();
            if(long0.compareTo(long1) < 0) {
                long0 = long1;
            }
        }
        return long0 == null ? 0L : ((long)long0);
    }

    @NotNull
    public final LinkedHashSet getTrackedUnsupportedAnimations() {
        return this.g;
    }

    @VisibleForTesting
    public static void getTrackedUnsupportedAnimations$annotations() {
    }

    @NotNull
    public final Map getTransitionClocks$ui_tooling_release() {
        return this.b;
    }

    @VisibleForTesting
    public static void getTransitionClocks$ui_tooling_release$annotations() {
    }

    @NotNull
    public final List getTransitions(@NotNull ComposeAnimation composeAnimation0, long v) {
        ComposeAnimationClock composeAnimationClock0 = this.b(composeAnimation0);
        if(composeAnimationClock0 != null) {
            List list0 = composeAnimationClock0.getTransitions(v);
            return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @VisibleForTesting
    public void notifySubscribe(@NotNull ComposeAnimation composeAnimation0) {
    }

    @VisibleForTesting
    public void notifyUnsubscribe(@NotNull ComposeAnimation composeAnimation0) {
    }

    public final void setClockTime(long v) {
        for(Object object0: this.c()) {
            ((ComposeAnimationClock)object0).setClockTime(v * 1000000L);
        }
        this.a.invoke();
    }

    public final void setClockTimes(@NotNull Map map0) {
        for(Object object0: map0.entrySet()) {
            ComposeAnimation composeAnimation0 = (ComposeAnimation)((Map.Entry)object0).getKey();
            long v = ((Number)((Map.Entry)object0).getValue()).longValue();
            ComposeAnimationClock composeAnimationClock0 = this.b(composeAnimation0);
            if(composeAnimationClock0 != null) {
                composeAnimationClock0.setClockTime(v * 1000000L);
            }
        }
        this.a.invoke();
    }

    public final void trackAnimateContentSize(@NotNull Object object0) {
        this.e(object0, new b2(14, this, "animateContentSize"));
    }

    public final void trackAnimateXAsState(@NotNull AnimateXAsStateSearchInfo animationSearch$AnimateXAsStateSearchInfo0) {
        this.e(animationSearch$AnimateXAsStateSearchInfo0.getAnimatable(), new e(animationSearch$AnimateXAsStateSearchInfo0, this));
    }

    public final void trackAnimatedContent(@NotNull Transition transition0) {
        this.e(transition0, new f(transition0, this));
    }

    public final void trackAnimatedVisibility(@NotNull Transition transition0, @NotNull Function0 function00) {
        if(!(transition0.getCurrentState() instanceof Boolean)) {
            return;
        }
        this.e(transition0, new d(transition0, function00, this));
    }

    public static void trackAnimatedVisibility$default(PreviewAnimationClock previewAnimationClock0, Transition transition0, Function0 function00, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackAnimatedVisibility");
        }
        if((v & 2) != 0) {
            function00 = c.y;
        }
        previewAnimationClock0.trackAnimatedVisibility(transition0, function00);
    }

    public final void trackDecayAnimations(@NotNull DecayAnimation decayAnimation0) {
        this.e(decayAnimation0, new b2(14, this, "DecayAnimation"));
    }

    public final void trackInfiniteTransition(@NotNull InfiniteTransitionSearchInfo animationSearch$InfiniteTransitionSearchInfo0) {
        this.e(animationSearch$InfiniteTransitionSearchInfo0.getInfiniteTransition(), new g(animationSearch$InfiniteTransitionSearchInfo0, this));
    }

    public final void trackTargetBasedAnimations(@NotNull TargetBasedAnimation targetBasedAnimation0) {
        this.e(targetBasedAnimation0, new b2(14, this, "TargetBasedAnimation"));
    }

    public final void trackTransition(@NotNull Transition transition0) {
        this.e(transition0, new p2.e(transition0, this));
    }

    public final void updateAnimatedVisibilityState(@NotNull ComposeAnimation composeAnimation0, @NotNull Object object0) {
        AnimatedVisibilityClock animatedVisibilityClock0 = (AnimatedVisibilityClock)this.c.get(composeAnimation0);
        if(animatedVisibilityClock0 != null) {
            ComposeAnimationClock.setStateParameters$default(animatedVisibilityClock0, object0, null, 2, null);
        }
    }

    public final void updateFromAndToStates(@NotNull ComposeAnimation composeAnimation0, @NotNull Object object0, @NotNull Object object1) {
        ComposeAnimationClock composeAnimationClock0 = this.b(composeAnimation0);
        if(composeAnimationClock0 != null) {
            composeAnimationClock0.setStateParameters(object0, object1);
        }
    }
}

