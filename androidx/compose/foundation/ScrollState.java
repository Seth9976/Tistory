package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s.h1;
import u.a3;
import u.o;
import u.z2;

@Stable
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\'\u0010\u000E\u001A#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u00A2\u0006\u0002\b\rH\u0096@\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0013\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0018\u001A\u00020\u000B2\u0006\u0010\u0015\u001A\u00020\u00022\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0086@\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001A\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u0002H\u0086@\u00A2\u0006\u0004\b\u001A\u0010\u001BR+\u0010\u0015\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u00028F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\u0005R+\u0010%\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\"\u0010\u001E\u001A\u0004\b#\u0010 \"\u0004\b$\u0010\u0005R\u001A\u0010+\u001A\u00020&8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R\u001B\u00101\u001A\u00020,8VX\u0096\u0084\u0002\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100R\u001B\u00104\u001A\u00020,8VX\u0096\u0084\u0002\u00A2\u0006\f\n\u0004\b2\u0010.\u001A\u0004\b3\u00100R$\u00108\u001A\u00020\u00022\u0006\u00105\u001A\u00020\u00028F@@X\u0086\u000E\u00A2\u0006\f\u001A\u0004\b6\u0010 \"\u0004\b7\u0010\u0005R\u0011\u0010<\u001A\u0002098F\u00A2\u0006\u0006\u001A\u0004\b:\u0010;R\u0014\u0010=\u001A\u00020,8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b=\u00100R\u0014\u0010?\u001A\u00020,8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b>\u00100R\u0014\u0010A\u001A\u00020,8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b@\u00100\u00A8\u0006C"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "initial", "<init>", "(I)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "(F)F", "value", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollTo", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollTo", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<set-?>", "a", "Landroidx/compose/runtime/MutableIntState;", "getValue", "()I", "setValue", "b", "getViewportSize", "setViewportSize$foundation_release", "viewportSize", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "c", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "", "g", "Landroidx/compose/runtime/State;", "getCanScrollForward", "()Z", "canScrollForward", "h", "getCanScrollBackward", "canScrollBackward", "newMax", "getMaxValue", "setMaxValue$foundation_release", "maxValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "isScrollInProgress", "getLastScrolledForward", "lastScrolledForward", "getLastScrolledBackward", "lastScrolledBackward", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,487:1\n75#2:488\n108#2,2:489\n75#2:499\n108#2,2:500\n602#3,8:491\n81#4:502\n81#4:503\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n*L\n95#1:488\n95#1:489,2\n116#1:499\n116#1:500,2\n105#1:491,8\n160#1:502\n162#1:503\n*E\n"})
public final class ScrollState implements ScrollableState {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\u0004\u001A\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/ScrollState$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/ScrollState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return ScrollState.i;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final MutableIntState a;
    public final MutableIntState b;
    public final MutableInteractionSource c;
    public final MutableIntState d;
    public float e;
    public final ScrollableState f;
    public final State g;
    public final State h;
    public static final Saver i;

    static {
        ScrollState.Companion = new Companion(null);
        ScrollState.i = SaverKt.Saver(z2.w, o.C);
    }

    public ScrollState(int v) {
        this.a = SnapshotIntStateKt.mutableIntStateOf(v);
        this.b = SnapshotIntStateKt.mutableIntStateOf(0);
        this.c = InteractionSourceKt.MutableInteractionSource();
        this.d = SnapshotIntStateKt.mutableIntStateOf(0x7FFFFFFF);
        this.f = ScrollableStateKt.ScrollableState(new h1(this, 10));
        this.g = SnapshotStateKt.derivedStateOf(new a3(this, 1));
        this.h = SnapshotStateKt.derivedStateOf(new a3(this, 0));
    }

    public static final void access$setValue(ScrollState scrollState0, int v) {
        scrollState0.a.setIntValue(v);
    }

    @Nullable
    public final Object animateScrollTo(int v, @NotNull AnimationSpec animationSpec0, @NotNull Continuation continuation0) {
        Object object0 = ScrollExtensionsKt.animateScrollBy(this, ((float)(v - this.getValue())), animationSpec0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animateScrollTo$default(ScrollState scrollState0, int v, AnimationSpec animationSpec0, Continuation continuation0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            animationSpec0 = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState0.animateScrollTo(v, animationSpec0, continuation0);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.f.dispatchRawDelta(f);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean)this.h.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean)this.g.getValue()).booleanValue();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.c;
    }

    @NotNull
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.f.getLastScrolledBackward();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.f.getLastScrolledForward();
    }

    public final int getMaxValue() {
        return this.d.getIntValue();
    }

    public final int getValue() {
        return this.a.getIntValue();
    }

    public final int getViewportSize() {
        return this.b.getIntValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f.isScrollInProgress();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = this.f.scroll(mutatePriority0, function20, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object scrollTo(int v, @NotNull Continuation continuation0) {
        return ScrollExtensionsKt.scrollBy(this, ((float)(v - this.getValue())), continuation0);
    }

    public final void setMaxValue$foundation_release(int v) {
        this.d.setIntValue(v);
        androidx.compose.runtime.snapshots.Snapshot.Companion snapshot$Companion0 = Snapshot.Companion;
        Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
        try {
            if(this.getValue() > v) {
                this.a.setIntValue(v);
            }
        }
        finally {
            snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
        }
    }

    public final void setViewportSize$foundation_release(int v) {
        this.b.setIntValue(v);
    }
}

