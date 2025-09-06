package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.LongRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import y0.y0;
import z.n2;
import z.o2;
import z.p2;
import z.q2;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0014\u001A\u00020\u0011*\u00020\u0010\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0017\u001A\u00020\u0011*\u00020\u0011\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u001A\u001A\u00020\u0010*\u00020\u0011\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001B\u001A\u00020\u0010*\u00020\u0010\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0014\u0010\u001B\u001A\u00020\u0011*\u00020\u0011\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0016J\u0018\u0010 \u001A\u00020\u00112\u0006\u0010\u001E\u001A\u00020\u0011\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0016J\u001B\u0010&\u001A\u00020#2\u0006\u0010\"\u001A\u00020!H\u0086@\u00F8\u0001\u0001\u00A2\u0006\u0004\b$\u0010%J\u001B\u0010)\u001A\u00020!2\u0006\u0010\'\u001A\u00020!H\u0086@\u00F8\u0001\u0001\u00A2\u0006\u0004\b(\u0010%J\r\u0010*\u001A\u00020\n\u00A2\u0006\u0004\b*\u0010+JC\u0010\u001E\u001A\u00020#2\b\b\u0002\u0010-\u001A\u00020,2\'\u00102\u001A#\b\u0001\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020#00\u0012\u0006\u0012\u0004\u0018\u00010\u00010.\u00A2\u0006\u0002\b1H\u0086@\u00A2\u0006\u0004\b\u001E\u00103J?\u00104\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b2\b\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b4\u00105J\r\u00106\u001A\u00020\n\u00A2\u0006\u0004\b6\u0010+\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00067"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseDirection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "", "Landroidx/compose/ui/geometry/Offset;", "toOffset-tuRUvjQ", "(F)J", "toOffset", "singleAxisOffset-MK-Hz9U", "(J)J", "singleAxisOffset", "toFloat-k-4lQ0M", "(J)F", "toFloat", "reverseIfNeeded", "(F)F", "reverseIfNeeded-MK-Hz9U", "scroll", "performRawScroll-MK-Hz9U", "performRawScroll", "Landroidx/compose/ui/unit/Velocity;", "initialVelocity", "", "onDragStopped-sF-c-tU", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStopped", "available", "doFlingAnimation-QWom1Mo", "doFlingAnimation", "shouldScrollImmediately", "()Z", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Z", "isVertical", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ScrollingLogic {
    public static final int $stable = 8;
    public ScrollableState a;
    public OverscrollEffect b;
    public FlingBehavior c;
    public Orientation d;
    public boolean e;
    public NestedScrollDispatcher f;
    public int g;
    public ScrollScope h;
    public final androidx.compose.foundation.gestures.ScrollingLogic.nestedScrollScope.1 i;
    public final y0 j;

    public ScrollingLogic(@NotNull ScrollableState scrollableState0, @Nullable OverscrollEffect overscrollEffect0, @NotNull FlingBehavior flingBehavior0, @NotNull Orientation orientation0, boolean z, @NotNull NestedScrollDispatcher nestedScrollDispatcher0) {
        this.a = scrollableState0;
        this.b = overscrollEffect0;
        this.c = flingBehavior0;
        this.d = orientation0;
        this.e = z;
        this.f = nestedScrollDispatcher0;
        this.g = 1;
        this.h = ScrollableKt.b;
        this.i = new NestedScrollScope() {
            public final ScrollingLogic a;

            {
                this.a = scrollingLogic0;
            }

            @Override  // androidx.compose.foundation.gestures.NestedScrollScope
            public long scrollBy-OzD1aCk(long v, int v1) {
                ScrollScope scrollScope0 = this.a.h;
                return ScrollingLogic.access$performScroll-3eAAhYA(this.a, scrollScope0, v, v1);
            }

            @Override  // androidx.compose.foundation.gestures.NestedScrollScope
            public long scrollByWithOverscroll-OzD1aCk(long v, int v1) {
                this.a.g = v1;
                OverscrollEffect overscrollEffect0 = this.a.b;
                return overscrollEffect0 == null || !ScrollingLogic.access$getShouldDispatchOverscroll(this.a) ? ScrollingLogic.access$performScroll-3eAAhYA(this.a, this.a.h, v, v1) : overscrollEffect0.applyToScroll-Rhakbz0(v, this.a.g, this.a.j);
            }
        };
        this.j = new y0(this, 4);
    }

    // 去混淆评级： 低(20)
    public static final boolean access$getShouldDispatchOverscroll(ScrollingLogic scrollingLogic0) {
        return scrollingLogic0.a.getCanScrollForward() || scrollingLogic0.a.getCanScrollBackward();
    }

    public static final long access$performScroll-3eAAhYA(ScrollingLogic scrollingLogic0, ScrollScope scrollScope0, long v, int v1) {
        long v2 = scrollingLogic0.f.dispatchPreScroll-OzD1aCk(v, v1);
        long v3 = Offset.minus-MK-Hz9U(v, v2);
        long v4 = scrollingLogic0.reverseIfNeeded-MK-Hz9U(scrollingLogic0.toOffset-tuRUvjQ(scrollScope0.scrollBy(scrollingLogic0.toFloat-k-4lQ0M(scrollingLogic0.reverseIfNeeded-MK-Hz9U(scrollingLogic0.singleAxisOffset-MK-Hz9U(v3))))));
        return Offset.plus-MK-Hz9U(Offset.plus-MK-Hz9U(v2, v4), scrollingLogic0.f.dispatchPostScroll-DzOQY0M(v4, Offset.minus-MK-Hz9U(v3, v4), v1));
    }

    public static final float access$toFloat-TH1AsA0(ScrollingLogic scrollingLogic0, long v) {
        return scrollingLogic0.d == Orientation.Horizontal ? Velocity.getX-impl(v) : Velocity.getY-impl(v);
    }

    public static final long access$update-QWom1Mo(ScrollingLogic scrollingLogic0, long v, float f) {
        return scrollingLogic0.d == Orientation.Horizontal ? Velocity.copy-OhffZ5M$default(v, f, 0.0f, 2, null) : Velocity.copy-OhffZ5M$default(v, 0.0f, f, 1, null);
    }

    @Nullable
    public final Object doFlingAnimation-QWom1Mo(long v, @NotNull Continuation continuation0) {
        n2 n20;
        if(continuation0 instanceof n2) {
            n20 = (n2)continuation0;
            int v1 = n20.r;
            if((v1 & 0x80000000) == 0) {
                n20 = new n2(this, continuation0);
            }
            else {
                n20.r = v1 ^ 0x80000000;
            }
        }
        else {
            n20 = new n2(this, continuation0);
        }
        Object object0 = n20.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(n20.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                LongRef ref$LongRef0 = new LongRef();
                ref$LongRef0.element = v;
                o2 o20 = new o2(this, ref$LongRef0, v, null);
                n20.o = ref$LongRef0;
                n20.r = 1;
                return this.scroll(MutatePriority.Default, o20, n20) == object1 ? object1 : Velocity.box-impl(ref$LongRef0.element);
            }
            case 1: {
                LongRef ref$LongRef1 = n20.o;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(ref$LongRef1.element);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final boolean isVertical() {
        return this.d == Orientation.Vertical;
    }

    @Nullable
    public final Object onDragStopped-sF-c-tU(long v, @NotNull Continuation continuation0) {
        long v1 = this.d == Orientation.Horizontal ? Velocity.copy-OhffZ5M$default(v, 0.0f, 0.0f, 1, null) : Velocity.copy-OhffZ5M$default(v, 0.0f, 0.0f, 2, null);
        p2 p20 = new p2(this, null);
        OverscrollEffect overscrollEffect0 = this.b;
        if(overscrollEffect0 != null && (this.a.getCanScrollForward() || this.a.getCanScrollBackward())) {
            Object object0 = overscrollEffect0.applyToFling-BMRW4eQ(v1, p20, continuation0);
            return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
        }
        Object object1 = p20.invoke(Velocity.box-impl(v1), continuation0);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    // 去混淆评级： 低(40)
    public final long performRawScroll-MK-Hz9U(long v) {
        return this.a.isScrollInProgress() ? 0L : this.toOffset-tuRUvjQ(this.reverseIfNeeded(this.a.dispatchRawDelta(this.reverseIfNeeded(this.toFloat-k-4lQ0M(v)))));
    }

    // 去混淆评级： 低(20)
    public final float reverseIfNeeded(float f) {
        return this.e ? f * -1.0f : f;
    }

    // 去混淆评级： 低(20)
    public final long reverseIfNeeded-MK-Hz9U(long v) {
        return this.e ? Offset.times-tuRUvjQ(v, -1.0f) : v;
    }

    @Nullable
    public final Object scroll(@NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = this.a.scroll(mutatePriority0, new q2(this, null, function20), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object scroll$default(ScrollingLogic scrollingLogic0, MutatePriority mutatePriority0, Function2 function20, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return scrollingLogic0.scroll(mutatePriority0, function20, continuation0);
    }

    public final boolean shouldScrollImmediately() {
        if(!this.a.isScrollInProgress()) {
            return this.b == null ? false : this.b.isInProgress();
        }
        return true;
    }

    public final long singleAxisOffset-MK-Hz9U(long v) {
        return this.d == Orientation.Horizontal ? Offset.copy-dBAh8RU$default(v, 0.0f, 0.0f, 1, null) : Offset.copy-dBAh8RU$default(v, 0.0f, 0.0f, 2, null);
    }

    public final float toFloat-k-4lQ0M(long v) {
        return this.d == Orientation.Horizontal ? Offset.getX-impl(v) : Offset.getY-impl(v);
    }

    public final long toOffset-tuRUvjQ(float f) {
        if(f == 0.0f) {
            return 0L;
        }
        return this.d == Orientation.Horizontal ? OffsetKt.Offset(f, 0.0f) : OffsetKt.Offset(0.0f, f);
    }

    public final boolean update(@NotNull ScrollableState scrollableState0, @NotNull Orientation orientation0, @Nullable OverscrollEffect overscrollEffect0, boolean z, @NotNull FlingBehavior flingBehavior0, @NotNull NestedScrollDispatcher nestedScrollDispatcher0) {
        boolean z2;
        boolean z1 = true;
        if(Intrinsics.areEqual(this.a, scrollableState0)) {
            z2 = false;
        }
        else {
            this.a = scrollableState0;
            z2 = true;
        }
        this.b = overscrollEffect0;
        if(this.d != orientation0) {
            this.d = orientation0;
            z2 = true;
        }
        if(this.e == z) {
            z1 = z2;
        }
        else {
            this.e = z;
        }
        this.c = flingBehavior0;
        this.f = nestedScrollDispatcher0;
        return z1;
    }
}

