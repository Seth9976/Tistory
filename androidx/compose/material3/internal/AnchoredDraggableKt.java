package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import w0.b1;
import w0.i;
import w0.l;
import w0.m;
import w0.q;

@Metadata(d1 = {"\u0000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A>\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001D\u0010\u0006\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001AO\u0010\u0014\u001A\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000B2\u0006\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\u000F2\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001A(\u0010\u0017\u001A\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000B2\u0006\u0010\u0016\u001A\u00028\u0000H\u0080@¢\u0006\u0004\b\u0017\u0010\u0018\u001A2\u0010\u001B\u001A\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000B2\u0006\u0010\u0016\u001A\u00028\u00002\b\b\u0002\u0010\u001A\u001A\u00020\u0019H\u0080@¢\u0006\u0004\b\u001B\u0010\u001C\u001Ay\u0010&\u001A\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000B2\u0006\u0010\u000E\u001A\u00020\r2H\u0010%\u001AD\u0012\u0013\u0012\u00110\u001E¢\u0006\f\b\u001F\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u001F\u0012\b\b \u0012\u0004\b\b(#\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00000$0\u001DH\u0000¢\u0006\u0004\b&\u0010\'¨\u0006("}, d2 = {"", "T", "Lkotlin/Function1;", "Landroidx/compose/material3/internal/DraggableAnchorsConfig;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/compose/material3/internal/DraggableAnchors;", "DraggableAnchors", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/material3/internal/DraggableAnchors;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "anchoredDraggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/internal/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "targetValue", "snapTo", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "velocity", "animateTo", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "size", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Pair;", "anchors", "draggableAnchors", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/internal/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AnchoredDraggableKt {
    @NotNull
    public static final DraggableAnchors DraggableAnchors(@NotNull Function1 function10) {
        DraggableAnchorsConfig draggableAnchorsConfig0 = new DraggableAnchorsConfig();
        function10.invoke(draggableAnchorsConfig0);
        return new b1(draggableAnchorsConfig0.getAnchors$material3_release());
    }

    public static final b1 access$emptyDraggableAnchors() {
        return new b1(x.emptyMap());
    }

    public static final Object access$restartable(Function0 function00, Function2 function20, Continuation continuation0) {
        m m0;
        if(continuation0 instanceof m) {
            m0 = (m)continuation0;
            int v = m0.p;
            if((v & 0x80000000) == 0) {
                m0 = new m(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                m0.p = v ^ 0x80000000;
            }
        }
        else {
            m0 = new m(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = m0.o;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(m0.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    q q0 = new q(function00, function20, null);
                    m0.p = 1;
                    return CoroutineScopeKt.coroutineScope(q0, m0) != unit0 ? Unit.INSTANCE : unit0;
                }
                catch(i unused_ex) {
                    return Unit.INSTANCE;
                }
            }
            case 1: {
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(i unused_ex) {
                }
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @NotNull
    public static final Modifier anchoredDraggable(@NotNull Modifier modifier0, @NotNull AnchoredDraggableState anchoredDraggableState0, @NotNull Orientation orientation0, boolean z, boolean z1, @Nullable MutableInteractionSource mutableInteractionSource0) {
        return DraggableKt.draggable$default(modifier0, anchoredDraggableState0.getDraggableState$material3_release(), orientation0, z, mutableInteractionSource0, anchoredDraggableState0.isAnimationRunning(), null, new p0.i(2, anchoredDraggableState0, null), z1, 0x20, null);
    }

    public static Modifier anchoredDraggable$default(Modifier modifier0, AnchoredDraggableState anchoredDraggableState0, Orientation orientation0, boolean z, boolean z1, MutableInteractionSource mutableInteractionSource0, int v, Object object0) {
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        if((v & 16) != 0) {
            mutableInteractionSource0 = null;
        }
        return AnchoredDraggableKt.anchoredDraggable(modifier0, anchoredDraggableState0, orientation0, z, z1, mutableInteractionSource0);
    }

    @Nullable
    public static final Object animateTo(@NotNull AnchoredDraggableState anchoredDraggableState0, Object object0, float f, @NotNull Continuation continuation0) {
        Object object1 = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState0, object0, null, new l(anchoredDraggableState0, f, null), continuation0, 2, null);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public static Object animateTo$default(AnchoredDraggableState anchoredDraggableState0, Object object0, float f, Continuation continuation0, int v, Object object1) {
        if((v & 2) != 0) {
            f = anchoredDraggableState0.getLastVelocity();
        }
        return AnchoredDraggableKt.animateTo(anchoredDraggableState0, object0, f, continuation0);
    }

    @NotNull
    public static final Modifier draggableAnchors(@NotNull Modifier modifier0, @NotNull AnchoredDraggableState anchoredDraggableState0, @NotNull Orientation orientation0, @NotNull Function2 function20) {
        return modifier0.then(new DraggableAnchorsElement(anchoredDraggableState0, function20, orientation0));
    }

    @Nullable
    public static final Object snapTo(@NotNull AnchoredDraggableState anchoredDraggableState0, Object object0, @NotNull Continuation continuation0) {
        Object object1 = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState0, object0, null, new p0.q(4, 1, null), continuation0, 2, null);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }
}

