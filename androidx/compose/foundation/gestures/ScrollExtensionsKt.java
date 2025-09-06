package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Ref.FloatRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.u1;
import z.w1;
import z.x1;
import z.y1;
import z.z1;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A*\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u0006\u001A\u001A\u0010\u0007\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0001H\u0086@¢\u0006\u0002\u0010\b\u001A\u001C\u0010\t\u001A\u00020\n*\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\fH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"animateScrollBy", "", "Landroidx/compose/foundation/gestures/ScrollableState;", "value", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/foundation/gestures/ScrollableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollBy", "(Landroidx/compose/foundation/gestures/ScrollableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopScroll", "", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ScrollExtensionsKt {
    @Nullable
    public static final Object animateScrollBy(@NotNull ScrollableState scrollableState0, float f, @NotNull AnimationSpec animationSpec0, @NotNull Continuation continuation0) {
        u1 u10;
        if(continuation0 instanceof u1) {
            u10 = (u1)continuation0;
            int v = u10.q;
            if((v & 0x80000000) == 0) {
                u10 = new u1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                u10.q = v ^ 0x80000000;
            }
        }
        else {
            u10 = new u1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = u10.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(u10.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FloatRef ref$FloatRef0 = new FloatRef();
                w1 w10 = new w1(f, animationSpec0, null, ref$FloatRef0);
                u10.o = ref$FloatRef0;
                u10.q = 1;
                return ScrollableState.scroll$default(scrollableState0, null, w10, u10, 1, null) == object1 ? object1 : Boxing.boxFloat(ref$FloatRef0.element);
            }
            case 1: {
                FloatRef ref$FloatRef1 = u10.o;
                ResultKt.throwOnFailure(object0);
                return Boxing.boxFloat(ref$FloatRef1.element);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static Object animateScrollBy$default(ScrollableState scrollableState0, float f, AnimationSpec animationSpec0, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            animationSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return ScrollExtensionsKt.animateScrollBy(scrollableState0, f, animationSpec0, continuation0);
    }

    @Nullable
    public static final Object scrollBy(@NotNull ScrollableState scrollableState0, float f, @NotNull Continuation continuation0) {
        x1 x10;
        if(continuation0 instanceof x1) {
            x10 = (x1)continuation0;
            int v = x10.q;
            if((v & 0x80000000) == 0) {
                x10 = new x1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                x10.q = v ^ 0x80000000;
            }
        }
        else {
            x10 = new x1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = x10.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(x10.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FloatRef ref$FloatRef0 = new FloatRef();
                y1 y10 = new y1(ref$FloatRef0, f, null);
                x10.o = ref$FloatRef0;
                x10.q = 1;
                return ScrollableState.scroll$default(scrollableState0, null, y10, x10, 1, null) == object1 ? object1 : Boxing.boxFloat(ref$FloatRef0.element);
            }
            case 1: {
                FloatRef ref$FloatRef1 = x10.o;
                ResultKt.throwOnFailure(object0);
                return Boxing.boxFloat(ref$FloatRef1.element);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Nullable
    public static final Object stopScroll(@NotNull ScrollableState scrollableState0, @NotNull MutatePriority mutatePriority0, @NotNull Continuation continuation0) {
        Object object0 = scrollableState0.scroll(mutatePriority0, new z1(2, null), continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object stopScroll$default(ScrollableState scrollableState0, MutatePriority mutatePriority0, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return ScrollExtensionsKt.stopScroll(scrollableState0, mutatePriority0, continuation0);
    }
}

