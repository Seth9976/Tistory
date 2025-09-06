package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.FloatRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.a2;
import z.b2;
import z.d2;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AO\u0010\f\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001Ae\u0010\f\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\f\u0010\u0012\"\u001A\u0010\u0018\u001A\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "scrollable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/MotionDurationScale;", "c", "Landroidx/compose/ui/MotionDurationScale;", "getDefaultScrollMotionDurationScale", "()Landroidx/compose/ui/MotionDurationScale;", "DefaultScrollMotionDurationScale", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ScrollableKt {
    public static final a2 a;
    public static final ScrollableKt.NoOpScrollScope.1 b;
    public static final ScrollableKt.DefaultScrollMotionDurationScale.1 c;
    public static final ScrollableKt.UnityDensity.1 d;

    static {
        ScrollableKt.a = a2.w;
        ScrollableKt.b = new ScrollableKt.NoOpScrollScope.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        ScrollableKt.c = new ScrollableKt.DefaultScrollMotionDurationScale.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        ScrollableKt.d = new ScrollableKt.UnityDensity.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static final Object access$semanticsScrollBy-d-4ec7I(ScrollingLogic scrollingLogic0, long v, Continuation continuation0) {
        b2 b20;
        if(continuation0 instanceof b2) {
            b20 = (b2)continuation0;
            int v1 = b20.r;
            if((v1 & 0x80000000) == 0) {
                b20 = new b2(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                b20.r = v1 ^ 0x80000000;
            }
        }
        else {
            b20 = new b2(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = b20.q;
        Offset offset0 = a.getCOROUTINE_SUSPENDED();
        switch(b20.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FloatRef ref$FloatRef0 = new FloatRef();
                d2 d20 = new d2(scrollingLogic0, v, ref$FloatRef0, null);
                b20.o = scrollingLogic0;
                b20.p = ref$FloatRef0;
                b20.r = 1;
                return scrollingLogic0.scroll(MutatePriority.Default, d20, b20) == offset0 ? offset0 : Offset.box-impl(scrollingLogic0.toOffset-tuRUvjQ(ref$FloatRef0.element));
            }
            case 1: {
                FloatRef ref$FloatRef1 = b20.p;
                ScrollingLogic scrollingLogic1 = b20.o;
                ResultKt.throwOnFailure(object0);
                return Offset.box-impl(scrollingLogic1.toOffset-tuRUvjQ(ref$FloatRef1.element));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @NotNull
    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return ScrollableKt.c;
    }

    @ExperimentalFoundationApi
    @Stable
    @NotNull
    public static final Modifier scrollable(@NotNull Modifier modifier0, @NotNull ScrollableState scrollableState0, @NotNull Orientation orientation0, @Nullable OverscrollEffect overscrollEffect0, boolean z, boolean z1, @Nullable FlingBehavior flingBehavior0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable BringIntoViewSpec bringIntoViewSpec0) {
        return modifier0.then(new ScrollableElement(overscrollEffect0, bringIntoViewSpec0, flingBehavior0, orientation0, scrollableState0, mutableInteractionSource0, z, z1));
    }

    @Stable
    @NotNull
    public static final Modifier scrollable(@NotNull Modifier modifier0, @NotNull ScrollableState scrollableState0, @NotNull Orientation orientation0, boolean z, boolean z1, @Nullable FlingBehavior flingBehavior0, @Nullable MutableInteractionSource mutableInteractionSource0) {
        return ScrollableKt.scrollable$default(modifier0, scrollableState0, orientation0, null, z, z1, flingBehavior0, mutableInteractionSource0, null, 0x80, null);
    }

    public static Modifier scrollable$default(Modifier modifier0, ScrollableState scrollableState0, Orientation orientation0, OverscrollEffect overscrollEffect0, boolean z, boolean z1, FlingBehavior flingBehavior0, MutableInteractionSource mutableInteractionSource0, BringIntoViewSpec bringIntoViewSpec0, int v, Object object0) {
        boolean z2 = (v & 8) == 0 ? z : true;
        boolean z3 = (v & 16) == 0 ? z1 : false;
        FlingBehavior flingBehavior1 = (v & 0x20) == 0 ? flingBehavior0 : null;
        MutableInteractionSource mutableInteractionSource1 = (v & 0x40) == 0 ? mutableInteractionSource0 : null;
        return (v & 0x80) == 0 ? ScrollableKt.scrollable(modifier0, scrollableState0, orientation0, overscrollEffect0, z2, z3, flingBehavior1, mutableInteractionSource1, bringIntoViewSpec0) : ScrollableKt.scrollable(modifier0, scrollableState0, orientation0, overscrollEffect0, z2, z3, flingBehavior1, mutableInteractionSource1, null);
    }

    public static Modifier scrollable$default(Modifier modifier0, ScrollableState scrollableState0, Orientation orientation0, boolean z, boolean z1, FlingBehavior flingBehavior0, MutableInteractionSource mutableInteractionSource0, int v, Object object0) {
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        FlingBehavior flingBehavior1 = (v & 16) == 0 ? flingBehavior0 : null;
        return (v & 0x20) == 0 ? ScrollableKt.scrollable(modifier0, scrollableState0, orientation0, z, z1, flingBehavior1, mutableInteractionSource0) : ScrollableKt.scrollable(modifier0, scrollableState0, orientation0, z, z1, flingBehavior1, null);
    }
}

